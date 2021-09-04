package DB;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class JDBConfig {

    private static JdbcTemplate jdbcTemplate = new JdbcTemplate();
    private JDBConfig(){}

    public static JdbcTemplate getJdbcTemplate() throws SQLException {
        SQLiteDataSource ds = new SQLiteDataSource();
        ds.setUrl("jdbc:sqlite:C:\\Users\\SBS\\Downloads\\SampleTestFramework\\src\\main\\resources\\sample.db");
        try (Connection conn = ds.getConnection()) {
            System.out.println("Connected.");
//            String sql =
//                    "SELECT * FROM PERSON";
//            try (Statement s = conn.createStatement(); ResultSet rs = s.executeQuery(sql)) {
//                while(rs.next()){
//                    System.out.println(rs.getInt(1));
//                    System.out.println(rs.getString(2));
//                    System.out.println(rs.getString(3));
//                    System.out.println(rs.getString(4));
//                    System.out.println(rs.getString(5));
//                    System.out.println(rs.getInt(6));
//                }
//            }
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        } finally {
            ds.getConnection().close();
        }
        jdbcTemplate.setDataSource(ds);
        return jdbcTemplate;
    }

    public static void main(String[] args) throws SQLException {
        getJdbcTemplate();
    }
}



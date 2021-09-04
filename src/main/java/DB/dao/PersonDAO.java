package DB.dao;

import DB.JDBConfig;
import DB.pojo.Person;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonDAO {
    JdbcTemplate jdbcTemplate;

    public PersonDAO() throws SQLException {
        jdbcTemplate = JDBConfig.getJdbcTemplate();
    }

    public static void main(String[] args) throws SQLException {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(0, "hatem", "baccar", new GregorianCalendar(1986, Calendar.SEPTEMBER, 15).getTime(), "Arabic", true);
        personDAO.insert(person);
    }

    public void insert(Person person) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateOfBirth = dateFormat.format(person.getDateOfBirth());
        int isMarried = person.isMarried() ? 1 : 0;
        jdbcTemplate.update("INSERT INTO PERSON (firstName, lastName, dateOfBirth, firstLanguage, married) VALUES (?,?,?,?,?)",
                person.getFirstName(), person.getLastName(), dateOfBirth, person.getFirstLanguage(), isMarried);
    }

    public void updateByFirstAndLastName(Person person, Person newPerson) throws Exception {
        if (person != null || newPerson != null) {
            String dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            if(person.getDateOfBirth() != null){
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateOfBirth = dateFormat.format(person.getDateOfBirth());
            }
            int isMarried = person.isMarried() ? 1 : 0;
            jdbcTemplate.update("UPDATE PERSON SET firstName = ?, lastName = ?, dateOfBirth = ?, firstLanguage = ?, married = ? WHERE firstName = ? and lastName = ?",
                    person.getFirstName(), person.getLastName(), dateOfBirth, person.getFirstLanguage(), isMarried, newPerson.getFirstName(), newPerson.getLastName());
        } else {
            throw new Exception("Please provide a non-null Person object");
        }
    }

    public void updateById(Person person, Person newPerson) throws Exception {
        if (person != null || newPerson != null) {
            String dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            if(person.getDateOfBirth() != null){
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateOfBirth = dateFormat.format(person.getDateOfBirth());
            }
            int isMarried = person.isMarried() ? 1 : 0;
            jdbcTemplate.update("UPDATE PERSON SET firstName = ?, lastName = ?, dateOfBirth = ?, firstLanguage = ?, married = ? WHERE id = ?",
                    person.getFirstName(), person.getLastName(), dateOfBirth, person.getFirstLanguage(), isMarried, newPerson.getId());
        } else {
            throw new Exception("Please provide a non-null Person object");
        }
    }
}

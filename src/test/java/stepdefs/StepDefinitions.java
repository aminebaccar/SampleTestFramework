package stepdefs;

import DB.JDBConfig;
import DB.dao.PersonDAO;
import DB.pojo.Person;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.logging.Logger;

public class StepDefinitions {
    PersonDAO personDAO = new PersonDAO();

    public StepDefinitions() throws SQLException {
    }

    @Given("I use the test step")
    public void i_use_the_test_step() throws Throwable {
        Logger logger = Logger.getGlobal();
        logger.info("this is a test step!!!!");
    }

    @When("I add a Person with first name *string} and last name *string}")
    public void i_add_a_person(){
        Person person = new Person();
        personDAO.insert(person);
    }
}

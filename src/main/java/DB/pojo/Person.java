package DB.pojo;

import java.util.Date;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String firstLanguage;
    private boolean married;

    public Person(int id, String firstName, String lastName, Date dateOfBirth, String firstLanguage, boolean married) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.firstLanguage = firstLanguage;
        this.married = married;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstLanguage() {
        return firstLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}

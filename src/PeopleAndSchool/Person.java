package PeopleAndSchool;

public class Person {
    //Data Fields
    private String firstName;
    private String middleName = null;
    private String lastName;
    private String schoolName;
    private String uniqueID;
    private String telephone;
    private PersonAddress address;      //address of address type



    //-------------------------------------------------------------------------//
    /*
        Constructors
     */
    //Name input construct
    public Person(String firstName, String middleName, String lastName, String schoolName, String uniqueID, String telephone, PersonAddress address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.uniqueID = uniqueID;
        this.telephone = telephone;
        this.address = address;
    }

    public Person(String firstName, String lastName, String schoolName, String uniqueID, String telephone, PersonAddress address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.uniqueID = uniqueID;
        this.telephone = telephone;
        this.address = address;
    }

    //default no-arg constructor
    public Person() {
        this("",null,"","","","",new PersonAddress());
    }


    /*
    | Getters and Setters
     */
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}

package PeopleAndSchool;

import java.util.ArrayList;

public class Person {
    //Data Fields
    private String firstName;
    private String middleName = null;
    private String lastName;
    private String schoolName = null;
    private String uniqueID;
    private String telephone;
    private PersonAddress address;      //address of address type



    //-------------------------------------------------------------------------//
    /*
        Constructors
     */
    //Name input construct
    public Person(String firstName, String middleName, String lastName, String uniqueID, String telephone, PersonAddress address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.uniqueID = uniqueID;
        this.telephone = telephone;
        this.address = address;
    }

    //default no-arg constructor
    public Person() {
        this("",null,"","","",new PersonAddress());
    }

    //Overriding methods
    @Override
    public String toString() {
        return firstName + " " + ((middleName == null ? "": middleName + " ")) + lastName + "\n"
                + "ID: " + uniqueID  + ((schoolName == null ? "\n": "U:  " + schoolName + "\n"))
                + "T:  " + telephone + "\n" +  "A:  " + address.toString();

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

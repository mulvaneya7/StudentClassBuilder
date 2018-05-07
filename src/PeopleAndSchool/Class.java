package PeopleAndSchool;

import java.util.ArrayList;

public class Class {
    //Data Field
    private String classCode;               //code for class       ex "1A" or "1B" or "4A" or "4B"
    private String department;              //department of class  ex."CS" or "BIO"
    private String description;             //description of class ex."Introduction to Computer Science"
    private String sessionId;               //the ID of an instance of the class
    private int    maxStudents;             //max number of students in this class
    private int    studentsInClass;         //number of students currently in class
    private Teacher professor;              //who's teaching the class
    private ArrayList<Student> roster;      //who's in the class


    //-------------------------------------------------------------------------//
    /*
        Constructors
     */
    //Best Constructor
    public Class(String department, String classCode, String description, int maxStudents) {
        this.classCode = classCode;
        this.department = department;
        this.description = description;
        this.maxStudents = maxStudents;
        sessionId = "c" + hashCode();

    }
    //no-arg Constructor
    public Class() {
        this(null,null,"",0);
    }

    //overriding methods

    @Override
    public String toString() {
        return
                "Class: " + department + classCode + "\n" +
                "about: " + description;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() %1000000);
    }


    //generating functions


    /*
    | Getters and Setters
     */

    public String getSessionId() { return sessionId; }

    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getStudentsInClass() {
        return studentsInClass;
    }

    public void setStudentsInClass(int studentsInClass) {
        this.studentsInClass = studentsInClass;
    }

}

package PeopleAndSchool;

import java.util.ArrayList;

public class Class {
    /**
     * Data fields
     *
     * @classCode The code for each class (ex: "1A", "1B", "4A", "4B")
     * @department department of the class (ex: "CS", "BIO", "MATH")
     * @description description of the class (ex: "Intro to Computer Science")
     * @sessionId ID of an instance of the class
     * @maxStudents max number of students in the class
     * @professor the Teacher of each class
     * @roster roster of the students in the class
     *
     */
    private String classCode;               //code for class       ex "1A" or "1B" or "4A" or "4B"
    private String department;              //department of class  ex."CS" or "BIO"
    private String description;             //description of class ex."Introduction to Computer Science"
    private String sessionId;               //the ID of an instance of the class
    private int    maxStudents;             //max number of students in this class
    private Teacher professor;              //who's teaching the class
    private ArrayList<Student> roster;      //who's in the class


    //-------------------------------------------------------------------------//

    /**
     * Class Constructor
     * @param department the department the course is under (ex: Math, Science, CS)
     * @param classCode unique code for each class
     * @param description description of each course
     * @param maxStudents max amount of students allowed in each class
     */
    public Class(String department, String classCode, String description, int maxStudents) {
        this.classCode = classCode;
        this.department = department;
        this.description = description;
        this.maxStudents = maxStudents;
        sessionId = "c" + hashCode();
        professor = null;
        roster = new ArrayList<>();

    }

    /**
     * No Arg Constructor
     */
    public Class() {
        this(null,null,"",0);
    }

    /**
     * Override toString and hashCode methods
     * @return String
     */

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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Class)
            if(this.sessionId == ((Class)obj).getSessionId())
                return true;

        return false;
    }


    /*
    | Getters and Setter methods
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

    public Teacher getProfessor() {
        return professor;
    }

    public void setProfessor(Teacher professor) {
        this.professor = professor;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }
}

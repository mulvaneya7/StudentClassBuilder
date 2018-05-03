package PeopleAndSchool;

public class Class {
    //Data Field
    private String classCode;               //code for class       ex "1A" or "1B" or "4A" or "4B"
    private String department;              //department of class  ex."CS" or "BIO"
    private String description;             //description of class ex."Introduction to Computer Science"
    private int    maxStudents;             //max number of students in this class
    private int    studentsInClass;         //number of students currently in class
    private boolean isCancelled = false;    //is class cancelled?


    //-------------------------------------------------------------------------//
    /*
        Constructors
     */
    //Best Constructor
    public Class(String classCode, String department, String description, int maxStudents) {
        this.classCode = classCode;
        this.department = department;
        this.description = description;
        this.maxStudents = maxStudents;
    }
    //no-arg Constructor
    public Class() {
        this(null,null,"",0);
    }

    /*
    | Getters and Setters
     */
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

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}

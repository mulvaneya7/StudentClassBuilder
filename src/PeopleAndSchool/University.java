package PeopleAndSchool;
import java.io.*;
import java.util.*;

/**
 * Created by amulvaney0 on 5/2/2018.
 */
public class University {
    //Data Fields
    String universityName;      //name of college
    String universityId;        //unique ID for this college
    ClassScheduler agenda;      //this class hold the roster for teachers, students, and available classes


    public University(String uniName, ArrayList<Student> studentList, ArrayList<Teacher> teacherList, ArrayList<Class> classList) {
        this.universityName = uniName;
        this.agenda = new ClassScheduler();
        this.agenda.setStudentRoster(studentList);
        this.agenda.setTeacherRoster(teacherList);
        this.agenda.setAllCourses(classList);
        this.universityId = "u" + hashCode();
    }

    //constructor with just a uni name, sets new Arraylists of people and classes
    public University(String uniName) {
        this(uniName, new ArrayList<Student>(),new ArrayList<Teacher>(), new ArrayList<Class>());
    }

    /**
     * University constructor class
     * @param uniName String name of the University
     * @param Courses File object that holds all the University info (students, teachers, classes)
     */
    public University(String uniName, File Courses) {
        this(uniName);
        this.agenda.loadClasses(Courses);
    }

    /**
     * Mutator Classes
     * @param s inputs Student or Teacher object and checks to see if the student is enrolled
     * If the student is enrolled, they are added to the course
     * If the Teacher is enrolled, the teacher is added to the course schedule
     */

    //Overloaded functions when adding Students or Faculty
    //use these functions when adding students or teachers to their respective lists
    public void enroll(Student s) {
        if(s != null)
        agenda.addStudent(s);
    }

    public void enroll(Teacher t) {
        if(t != null)
        agenda.addTeacher(t);
    }

<<<<<<< HEAD
    /**
     * Override hashCode method
     * @return unique hashCode ID
     */
=======
    /*
    Accessor Methods
     */
    public int getTotalStudents() {
        return agenda.getStudentRoster().size();
    }

    public int getTotalFaculty() {
        return agenda.getTeacherRoster().size();
    }

    public int getTotalAvailableClasses() {
        return agenda.getAllCourses().size();
    }

    //Overriding methods
    @Override
    public int hashCode() {
        return super.hashCode() % 100000;
    }


    /*
    | Getters and Setters
     */
    public ClassScheduler getAgenda() {
        return agenda;
    }

    public void setAgenda(ClassScheduler agenda) {
        this.agenda = agenda;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }
}

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
        this.agenda.setStudentRoster(studentList);
        this.agenda.setTeacherRoster(teacherList);
        this.agenda.setAllCourses(classList);
        this.universityId = "u" + hashCode();
    }

    //constructor with just a uni name, sets new Arraylists of people and classes
    public University(String uniName) {
        this(uniName, new ArrayList<Student>(),new ArrayList<Teacher>(), new ArrayList<Class>());
    }

    //load the University Class list on Construction
    public University(String uniName, File Courses) {
        this(uniName);
        this.agenda.loadClasses(Courses);
    }


    //Methods on CourseList



    //Overriding methods
    @Override
    public int hashCode() {
        return super.hashCode() % 100000;
    }

    //Print Functions

    //generating functions
    //if the class is less than 30% of its max students, session is cancelled
    public static boolean isSessionCancelled(Class course) {
        if(course.getStudentsInClass() >= (course.getMaxStudents()/3))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //if there are no courses of this type scheduled its cancelled
    public static boolean isCourseCancelled(Class course) {
        return true;
    }


    /*
    | Getters and Setters
     */


    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public ArrayList<Class> getClassList() {
        return classList;
    }

    public void setClassList(ArrayList<Class> classList) {
        this.classList = classList;
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

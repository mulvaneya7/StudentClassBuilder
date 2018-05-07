package PeopleAndSchool;
import java.io.*;
import ScheduleInterfaces.GenerateRandomSchedule;
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

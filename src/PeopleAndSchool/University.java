package PeopleAndSchool;
import java.io.*;
import ScheduleInterfaces.GenerateRandomSchedule;
import java.util.*;

/**
 * Created by amulvaney0 on 5/2/2018.
 */
public class University implements GenerateRandomSchedule{
    //Data Fields
    String universityName;
    String universityId;
    ArrayList<Student> studentList;
    ArrayList<Teacher> teacherList;
    ArrayList<Class>   classList;

    public University(String uniName, ArrayList<Student> studentList, ArrayList<Teacher> teacherList, ArrayList<Class> classList) {
        this.universityName = uniName;
        this.studentList = studentList;
        this.teacherList = teacherList;
        this.classList = classList;
        this.universityId = "u" + hashCode();
    }

    //constructor with just a uni name, sets new Arraylists of people and classes
    public University(String uniName) {
        this(uniName, new ArrayList<Student>(),new ArrayList<Teacher>(), new ArrayList<Class>());
    }

    //load the University Class list on Construction
    public University(String uniName, File Courses) {
        this(uniName);
        loadClasses(Courses);
    }

    //load University classes via Text file
    private void loadClasses(java.io.File inputFile) {
        try(Scanner input = new Scanner(inputFile)) {
            while(input.hasNext()) {
                classList.add(new Class(input.nextLine(),
                                        input.nextLine(),
                                        input.nextLine(),
                                        input.nextInt())
                                        );
                if(input.hasNext())
                    input.next();
            }
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }

    //Methods on CourseList



    //Overriding methods
    @Override
    public int hashCode() {
        return super.hashCode() % 100000;
    }

    //Print Functions
    public void printAvailableCourses() {
        for(int i = 0; i < classList.size(); i++) {
            System.out.println(classList.get(i).toString());
            System.out.println();
        }
    }

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

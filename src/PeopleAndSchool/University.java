package PeopleAndSchool;
import java.io.*;
import ScheduleInterfaces.GenerateRandomSchedule;
import java.util.*;

/**
 * Created by amulvaney0 on 5/2/2018.
 */
public class University implements GenerateRandomSchedule{
    //Data Fields
    ArrayList<Student> studentList;
    ArrayList<Teacher> teacherList;
    ArrayList<Class>   classList;

    public University(ArrayList<Student> studentList, ArrayList<Teacher> teacherList, ArrayList<Class> classList) {
        this.studentList = studentList;
        this.teacherList = teacherList;
        this.classList = classList;
    }

    //default no-arg constructor
    public University() {
        this(new ArrayList<Student>(),new ArrayList<Teacher>(), new ArrayList<Class>());
    }

    //load the University Class list on Construction
    public University(File Courses) {
        this();
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
}

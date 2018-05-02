package PeopleAndSchool;

import java.util.ArrayList;

/**
 * Created by amulvaney0 on 5/2/2018.
 */
public class University {
    //Data Fields
    ArrayList<Student> studentList;
    ArrayList<Teacher> teacherList;
    ArrayList<Class>   classList;

    public University(ArrayList<Student> studentList, ArrayList<Teacher> teacherList, ArrayList<Class> classList) {
        this.studentList = studentList;
        this.teacherList = teacherList;
        this.classList = classList;
    }

    public University() {
        studentList = new ArrayList<>();
        teacherList = new ArrayList<>();
        classList   = new ArrayList<>();
    }
}

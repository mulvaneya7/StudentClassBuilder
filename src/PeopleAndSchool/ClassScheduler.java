package PeopleAndSchool;

import ScheduleInterfaces.GenerateRandomSchedule;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amulvaney0 on 5/7/2018.
 */
public class ClassScheduler implements GenerateRandomSchedule {
    //data field
    ArrayList<Student> studentRoster;
    ArrayList<Teacher> teacherRoster;
    ArrayList<Class>   allCourses;

    //Construct the class with three lists
    public ClassScheduler(ArrayList<Student> studentRoster, ArrayList<Teacher> teacherRoster, ArrayList<Class> allCourses) {
        this.studentRoster = studentRoster;
        this.teacherRoster = teacherRoster;
        this.allCourses = allCourses;
    }

    //Construct the class with just teachers and students
    public ClassScheduler(ArrayList<Student> studentRoster, ArrayList<Teacher> teacherRoster) {
        this(studentRoster, teacherRoster, new ArrayList<Class>());
    }

    //default no-arg
    public ClassScheduler() {
        this(new ArrayList<Student>(), new ArrayList<Teacher>(), new ArrayList<Class>());
    }


    //Mutator methods

    //load ClassScheduler classes via Text file
    protected void loadClasses(java.io.File inputFile) {
        try(Scanner input = new Scanner(inputFile)) {
            while(input.hasNext()) {
                allCourses.add(new Class(input.nextLine(),
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

    //Accessor methods
    //if the class is less than 30% of its max students, session is cancelled
    public static boolean isSessionCancelled(Class course) {
        if(course.getRoster().size() >= (course.getMaxStudents()/3))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

//    public boolean isCourseCancelled(Class course) {
//        for(int i = 0; i < allCourses.size(); i++) {
//
//        }
//    }

    //Printing methods
    public void printAvailableCourses() {
        for(int i = 0; i < allCourses.size(); i++) {
            System.out.println(allCourses.get(i).toString());
            System.out.println();
        }
    }

    /*
    Getters and Setters
     */
    public ArrayList<Student> getStudentRoster() {
        return studentRoster;
    }

    public void setStudentRoster(ArrayList<Student> studentRoster) {
        this.studentRoster = studentRoster;
    }

    public ArrayList<Teacher> getTeacherRoster() {
        return teacherRoster;
    }

    public void setTeacherRoster(ArrayList<Teacher> teacherRoster) {
        this.teacherRoster = teacherRoster;
    }

    public ArrayList<Class> getAllCourses() {
        return allCourses;
    }

    public void setAllCourses(ArrayList<Class> allCourses) {
        this.allCourses = allCourses;
    }
}

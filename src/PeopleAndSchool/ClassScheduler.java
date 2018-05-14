package PeopleAndSchool;

import ScheduleInterfaces.*;
import ScheduleInterfaces.Scheduler;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by amulvaney0 on 5/7/2018.
 */
public class ClassScheduler implements Scheduler {
    //data field
    private ArrayList<Student> studentRoster;
    private ArrayList<Teacher> teacherRoster;
    private ArrayList<Class>   allCourses;
    Scheduler scheduler;

    /**
     * Constructor Class
     * Takes in 3 Array Lists
     * @param studentRoster Array List that contains the list of students
     * @param teacherRoster Array List that contains the list of teachers
     * @param allCourses Array List that contains all the courses in the school
     */
    public ClassScheduler(ArrayList<Student> studentRoster, ArrayList<Teacher> teacherRoster, ArrayList<Class> allCourses) {
        this.studentRoster = studentRoster;
        this.teacherRoster = teacherRoster;
        this.allCourses = allCourses;
    }

    /**
     * Constructor class
     * @param studentRoster
     * @param teacherRoster
     */
    public ClassScheduler(ArrayList<Student> studentRoster, ArrayList<Teacher> teacherRoster) {
        this(studentRoster, teacherRoster, new ArrayList<Class>());
    }

    /**
     * Default No Arg Constructor Class
     */
    public ClassScheduler() {

        this(new ArrayList<Student>(), new ArrayList<Teacher>(), new ArrayList<Class>());
    }


    /**
     * This method loads ClassScheduler classes via Text file
     * @param inputFile the text file that contains ClassScheduler
     */
    protected void loadClasses(java.io.File inputFile) {
        try(Scanner input = new Scanner(inputFile)) {
            while (input.hasNextLine()) {
                allCourses.add(new Class(input.next(),
                                         input.next(),
                                         input.next(),
                                         input.nextInt()));
            }
        }catch(InputMismatchException x) {
            System.out.println(x);
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }


    /**
     * Accessor Methods
     * If the class is less than 30% of its max students, the session is cancelled
     * @param course references to a specific course
     * @return true if there aren't enough students in a class and the session is cancelled
     */
    public boolean isSessionCancelled(Class course) {
        if(courseExists(course) && course.getRoster().size() >= (course.getMaxStudents()/3))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isCourseCancelled(Class course) {
        int count = 0;
        for(int i = 0; i < allCourses.size(); i++) {
            if(allCourses.get(i).getDepartment().equals(course.getDepartment()) &&
                    allCourses.get(i).getClassCode().equals(course.getClassCode())) {
                if(isSessionCancelled(allCourses.get(i)) == true)
                    count++;
            }
        }
        if(count == amountOfSessions(course))
            return true;
        else
            return false;
    }

    public int amountOfSessions(Class course) {
        int count = 0;
        for (int i = 0; i < allCourses.size(); i++) {
            if (allCourses.get(i).getDepartment().equals(course.getDepartment()) &&
                    allCourses.get(i).getClassCode().equals(course.getClassCode())) {
                count++;
            }
        }
        return count;
    }

    public boolean courseExists(Class course) {
        for (int i = 0; i < allCourses.size(); i++) {
            if (allCourses.get(i).getDepartment().equals(course.getDepartment()) &&
                    allCourses.get(i).getClassCode().equals(course.getClassCode())) {
                return true;
            }
        }
        return false;
    }

//    public int getUnscheduledCourses() {
//        for(int i )
//    }

    /**
     * This method prints all the available courses
     */
    public void printAvailableCourses() {
        for(int i = 0; i < allCourses.size(); i++) {
            System.out.println(allCourses.get(i).toString());
            System.out.println();
        }
    }

    /**
     * Mutator Functions
     * @param s takes in a Student object and adds the student to studentRoster
     */
    public void addStudent(Student s) {
        if(s instanceof Student) {
            studentRoster.add(s);
        }
    }

    /**
     * This Method adds a Teacher to the teacherRoster
     * @param t
     */
    public void addTeacher(Teacher t) {
        teacherRoster.add(t);
    }

    /**
     * Getter and Setter methods
     * @return the instance variables
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

    /**
     * This method allows the input to choose how the classes want to be scheduled
     * It can be scheduled sequentially or randomly
     * If the input choice is 0, it will be scheduled randomly.
     * If the input choice is any number greater than 0, it will schedule sequentially.
     */
    public void selectWhichSchedulerToUse(int choice){
        if(choice < 0){
            System.out.println("Choice must be a number 0 or greater");
        }
        if(choice == 0){
            scheduler = new GenerateRandomSchedule();
        }
        else{
            scheduler = new GenerateSequentialSchedule();
        }

    }

    @Override
    public String scheduleClasses(ArrayList<String> students, ArrayList<String> faculty, ArrayList<String> sessionId) {
        return null;
    }


}

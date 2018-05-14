package ScheduleInterfaces;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class schedules classes in a random order.
 * Created by emarin5 on 5/7/2018.
 */
public class GenerateRandomSchedule implements Scheduler {

    Random random = new Random();
    Class aClass;
    ArrayList<ArrayList<String>> studentsInCourse = new ArrayList<>();


    /**
     * Override method that schedules the classes Randomly
     * @param studentRoster list of students in the University
     * @param teacherRoster list of teachers in the University
     * @param sessionId course session that needs to be filled
     * @return String of students and teacher in the course session
     */
    @Override
    public String scheduleClasses(ArrayList<String> studentRoster, ArrayList<String> teacherRoster, ArrayList<String> sessionId) {
        int studentsInClass = 0;
        if(aClass.getSessionID().equals(sessionId)){
            studentsInClass = aClass.getMaxStudents();
        }

        for(int i = 0; i < studentsInClass; i++){
            studentsInCourse.add(studentRoster);
        }
        //studentsInCourse.add(teacherRoster.get(1));

        return studentsInCourse.toString();
    }


}

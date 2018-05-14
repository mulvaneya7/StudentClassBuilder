package ScheduleInterfaces;

import java.util.ArrayList;

/**
 * This class schedules classes for students sequentially
 * Created by emarin5 on 5/7/2018.
 */
public class GenerateSequentialSchedule implements Scheduler{

    Class aClass;
    ArrayList<ArrayList<String>> studentsInCourse = new ArrayList<>();

    /**
     * Override method that schedules classes Sequentially
     * @param studentRoster list of students
     * @param teacherRoster list of teachers
     * @param sessionId course session ID
     * @return String of students and teacher in the specific session
     */
    @Override
    public String scheduleClasses(ArrayList<String> studentRoster, ArrayList<String> teacherRoster, ArrayList<String> sessionId) {
        int studentsInClass = 0;
        teacherRoster =
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

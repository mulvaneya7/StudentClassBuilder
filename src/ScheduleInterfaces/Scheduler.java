package ScheduleInterfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This is a general interface of Scheduler that can be implemented to create different ways to schedule classes.
 * Created by emarin5 on 5/7/2018.
 */
public interface Scheduler {
    public String scheduleClasses(ArrayList <String> studentRoster, ArrayList<String> teacherRoster, ArrayList <String> sessionId);
}

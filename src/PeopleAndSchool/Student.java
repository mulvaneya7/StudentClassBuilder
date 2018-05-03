package PeopleAndSchool;
import ScheduleInterfaces.*;
import java.util.ArrayList;
import java.util.Date;

public class Student extends Person implements GenerateRandomSchedule{

    //Data Fields
    private java.util.Date dateOfBirth;
    private java.util.Date startDate;
    private double gpa;
    private ArrayList<Class> currentClasses;    //classes the student is currently enrolled in

    public Student()
    {
        this("","","","","",new PersonAddress(), new Date(), new Date(), -0.1);
    }

    public Student(String firstName, String middleName, String lastName, String uniqueID, String telephone, PersonAddress address, Date dateOfBirth, Date startDate, double gpa) {
        super(firstName, middleName, lastName, uniqueID, telephone, address);
        this.dateOfBirth = dateOfBirth;
        this.startDate = startDate;
        this.gpa = gpa;
    }

    //Overriding methods
    @Override
    public String toString() {
        return  super.toString() + "\n" + "GPA: " + ((super.getSchoolName() == null ? 0.0: gpa)) + "\n" + "Birth:    " + dateOfBirth.toString() + "\n"
                + "Enrolled: " + startDate.toString();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

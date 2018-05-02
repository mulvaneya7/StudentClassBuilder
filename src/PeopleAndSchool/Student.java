package PeopleAndSchool;
import ScheduleInterfaces.*;
import java.util.Date;

public class Student extends Person implements GenerateRandomSchedule{

    //Data Fields
    private Date dateOfBirth;
    private Date startDate;
    private double gpa;

    public Student()
    {

    }

    public Student(String firstName, String middleName, String lastName, String schoolName, String uniqueID, String telephone, PersonAddress address, Date dateOfBirth, Date startDate, double gpa) {
        super(firstName, middleName, lastName, uniqueID, telephone, address);
        this.dateOfBirth = dateOfBirth;
        this.startDate = startDate;
        this.gpa = gpa;
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

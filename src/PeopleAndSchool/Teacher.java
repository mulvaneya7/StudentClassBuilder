package PeopleAndSchool;
import java.util.Date;

public class Teacher extends Person {

    /**
     * Data Fields
     */
    private boolean isTenured;
    private Date hireDate;

    public Teacher()
    {

    }

    /**
     * Teacher constructor
     * @param firstName String teacher's first name
     * @param middleName String teacher's middle name
     * @param lastName String teacher's last name
     * @param schoolName String name of the school
     * @param uniqueID String the teacher's unique ID
     * @param telephone String teacher's telephone number
     * @param address PersonalAddress class teacher's address
     * @param isTenured boolean if the teacher isTenured
     * @param hireDate Date class - date the teacher was hired
     */
    public Teacher(String firstName, String middleName, String lastName, String schoolName, String uniqueID, String telephone, PersonAddress address, boolean isTenured, Date hireDate) {
        super(firstName, middleName, lastName, telephone, address);
        this.isTenured = isTenured;
        this.hireDate = hireDate;
        this.setUniqueID("f" + this.hashCode());
    }

    /**
     * Override hashCode method
     * @return a unique hashcode for each teacher object
     */

    @Override
    public int hashCode() {
        return (super.hashCode() % 100000);
    }

    /**
     * Getter and Setter methods
     * @return instance variable
     */
    public boolean isTenured() {
        return isTenured;
    }

    public void setTenured(boolean tenured) {
        isTenured = tenured;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


}

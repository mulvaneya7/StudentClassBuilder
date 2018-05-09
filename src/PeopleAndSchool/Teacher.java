package PeopleAndSchool;
import java.util.Date;

public class Teacher extends Person {

    //Data Fields
    private boolean isTenured;
    private Date hireDate;

    public Teacher()
    {

    }

    public Teacher(String firstName, String middleName, String lastName, String schoolName, String uniqueID, String telephone, PersonAddress address, boolean isTenured, Date hireDate) {
        super(firstName, middleName, lastName, telephone, address);
        this.isTenured = isTenured;
        this.hireDate = hireDate;
        this.setUniqueID("f" + this.hashCode());
    }

    //Overriding methods

    @Override
    public int hashCode() {
        return (super.hashCode() % 100000);
    }

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

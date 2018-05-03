package PeopleAndSchool;


//This class hold all address information of a person
public class PersonAddress {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public PersonAddress(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public PersonAddress(String street, String state, String zipcode) {
        this(street,null,state,zipcode);
    }

    public PersonAddress() {
        this("","","","");
    }

    @Override
    public String toString() {
        return street + " " + city + ", " + zipcode + " " + state;
    }

    /*
        | Getters and Setters
         */
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}

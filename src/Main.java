import PeopleAndSchool.*;
import static DatabaseClasses.SQLiteJDBCDriverConnection.*;
import java.io.*;
import java.lang.Class;
import java.sql.*;
import java.util.Date;
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Connection conn = connect();
//        Connection conn = getConn();

//        Connection c = null;
//        Statement stmt = null;
//        try
//        {
//            Class.forName("org.sqlite.JDBC");
//            c = DriverManager.getConnection("jdbc:sqlite:C:/Users/ronen/Desktop/Github/StudentClassBuilder/src/DatabaseClasses/StudentInfo.db");
//            c.setAutoCommit(false);
//            System.out.println("Opened database successfully");
//            stmt = c.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM StudentInfo");
//
//            while(rs.next())
//            {
//                String firstName = rs.getString("FirstName");
//
//                System.out.println("FirstName = " + firstName);
//            }
//        }
//        catch(Exception e)
//        {
//            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//            System.exit(0);
//        }


        Person john = new Person("John", null , "Doe", "12256", "949-555-9090",
                new PersonAddress("123 Maple","RSM","California", "92688"));

        Student studentJohn = new Student("John", "Malerd" , "Doe", "12256", "949-555-9090",
                new PersonAddress("123 Maple","RSM","California", "92688"),
                new java.util.Date(1995,10,1), new java.util.Date(2018,1,1), 3.5);

        System.out.println(john.toString());
        System.out.println();
        System.out.println(studentJohn.toString());


        //CLASS TEXT FILE GENERATOR
        /*
        try(PrintWriter output = new PrintWriter("src/CourseMockup.txt")) {

            for(int i = 0; i < 50; i++) {
                if(i%2==0)
                    output.println("A");
                else
                    output.println("B");
                output.println(i);
                output.println("Description");
                output.println(20);
                output.println();
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        */
        File courseMockup = new File("src/CourseMockup.txt");
        University UCLA = new University("UCLA",courseMockup);
        System.out.println("\ncourses for University " + UCLA.getUniversityName() +": ");
        UCLA.printAvailableCourses();
        System.out.println(UCLA.getClassList().get(5).getDepartment() + ":" + UCLA.getClassList().get(5).getMaxStudents());
    }
}


import static DatabaseClasses.SQLiteJDBCDriverConnection.*;
import PeopleAndSchool.*;
import java.io.*;

public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Connection conn = connect(); //connect to the database
//
//        Statement stmt = null;
//        try
//        {
//            stmt = conn.createStatement();
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



        //Alex testing gay shit
        Person john = new Person("John", null , "Doe", "949-555-9090",
                new PersonAddress("123 Maple","RSM","California", "92688"));

        Student studentJohn = new Student("John", "Malerd" , "Doe", "949-555-9090",
                new PersonAddress("123 Maple","RSM","California", "92688"),
                new java.util.Date(1995,10,1), new java.util.Date(2018,1,1), 3.5);
//
//        System.out.println(john.toString());
//        System.out.println();
//        System.out.println(studentJohn.toString());


        //CLASS TEXT FILE GENERATOR

        try(PrintWriter output = new PrintWriter("src/CourseMockup.txt")) {

            for(int i = 0; i < 50; i++) {
                if(i%2==0)
                    output.println("AB");
                else
                    output.println("CS");
                output.println(i);
                output.println("Description");
                output.println(20);
                output.println();
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }

        File courseMockup = new File("src/CourseMockup.txt");
        University saddleback = new University("Saddleback",courseMockup);
        saddleback.getAgenda().printAvailableCourses();
        System.out.println(saddleback.getAgenda().getAllCourses().get(4));
        //System.out.println(saddleback.getUniversityId());

        System.out.println();
        saddleback.enroll(studentJohn);
        System.out.println(saddleback.getAgenda().getStudentRoster().get(0).toString());


    }
}

import PeopleAndSchool.*;
import static DatabaseClasses.SQLiteJDBCDriverConnection.*;

import java.lang.Class;
import java.sql.*;

public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Connection conn = connect();
//        Connection conn = getConn();

        Connection c = null;
        Statement stmt = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:/Users/ronen/Desktop/Github/StudentClassBuilder/src/DatabaseClasses/StudentInfo.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM StudentInfo");

            while(rs.next())
            {
                String firstName = rs.getString("FirstName");

                System.out.println("FirstName = " + firstName);
            }
        }
        catch(Exception e)
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }


    }
}

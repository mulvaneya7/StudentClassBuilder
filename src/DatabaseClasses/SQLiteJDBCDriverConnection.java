package DatabaseClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sqlitetutorial.net
 */
public class SQLiteJDBCDriverConnection {
//    private static Connection conn = null;
    /**
     * Connect to a sample database
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/ronen/Desktop/Github/StudentClassBuilder/src/DatabaseClasses/StudentInfo.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

        }
        return conn;
    }

//    public static Connection getConn() {
//        return conn;
//    }
}

package example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author akaloshin
 */
public class UseSqliteJdbc {
    public static void main(String... args) throws SQLException {
        System.out.println("About to use sqlite-jdbc");
        DriverManager.getConnection("jdbc:sqlite:", new Properties()).createStatement().close();
        System.out.println("Success");
    }
}

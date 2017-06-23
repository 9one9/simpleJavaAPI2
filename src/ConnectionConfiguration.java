import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Rayson on 6/21/17.
 */
public class ConnectionConfiguration {

    public static Connection getConnection() {
        Connection connection = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://longbeach.ctaje27sy3yo.us-east-1.rds.amazonaws.com");

        } catch(Exception e) {
            e.printStackTrace();

        }
        return connection;
    }
}

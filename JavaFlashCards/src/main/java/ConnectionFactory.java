import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class ConnectionFactory {
    public  static final String URL = "jdbc:mysql://localhost:3306/JavaFacts";
    public  static final String USER = "Toms";
    public  static final String PASS = "zipcode0";

    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException throwables) {
            throw new RuntimeException("Error connecting to the database", throwables);
        }
    }

}




















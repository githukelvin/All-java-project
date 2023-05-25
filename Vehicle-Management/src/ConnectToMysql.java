import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToMysql {
    // Connection and statement objects
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public void connectToDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/vehicle";
        String username = "root";
        String password = "";


        try {

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);
            // if connection sucessful return connection

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}

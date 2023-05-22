import java.sql.*;

public class ConnectToMysql {
    public static void main(String[] args) {
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

        // Connection and statement objects
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

      

        try {
      
            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query
            String sql = "SELECT * FROM Register";
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("User_id");
                String name = resultSet.getString("UserName");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

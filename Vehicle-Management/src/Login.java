import java.sql.Connection;

public class Login extends ConnectToMysql {

    private final String userName;
    private String password;


    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public boolean login() {
        // select from database
        ConnectToMysql conn = new ConnectToMysql();
        conn.connectToDB();

        Connection connection = conn.connection;
        try {
            // Create a statement
            statement = connection.createStatement();
            // Execute SQL query
            resultSet = statement.executeQuery("SELECT * FROM Register WHERE userName = '" + userName + "' AND password = '" + password + "'");
            // Process the result set
            if (resultSet.next()) {
                // add   to frame the succes
                new SuccessDialog("Login Was Successful");
                return true;
            } else {
                // add   to frame the error
                new ErrorDialog("Login Was Unsuccessful");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }


    }

}





    
    

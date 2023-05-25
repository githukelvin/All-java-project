import java.sql.Connection;
import java.sql.PreparedStatement;

public class Register extends ConnectToMysql {
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String address;


    public Register(String userName, String password, String email, String firstName, String lastName, String address) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password= password;
    }
    public void setEmail(String email) {
        this.email= email;
    }
    public void setFirstName(String firstName) {
        this.firstName= firstName;
    }
    public void setLastName(String lastName) {
        this.lastName= lastName;
    }
    public void setAddress(String address) {
        this.address= address;
    }
    // Insert  to Database
    public void insert() {
        ConnectToMysql conn = new ConnectToMysql();
        conn.connectToDB();

        Connection con = conn.connection;

        try {
            String query = "INSERT INTO Register (userName, password, email, firstName, lastName, address) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, userName);
            preparedStmt.setString(2, password);
            preparedStmt.setString(3, email);
            preparedStmt.setString(4, firstName);
            preparedStmt.setString(5, lastName);
            preparedStmt.setString(6, address);
            preparedStmt.execute();

            // add to frame the success
            new SuccessDialog("The User  Registration has been Succesfully.");


        } catch (Exception e) {
            System.out.println(e);
            new ErrorDialog("The  User  Registration have failed");
        }


    }


}

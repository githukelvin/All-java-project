import java.sql.*;

public class Register {
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
        // 1.  connect to database
        // 2.  insert to database
        // 3.  close connection
        // 4.  return to login page
        // 5.  show message
        // 6.  show error message
        // 7.  show success message
        try {
            String sql = "INSERT INTO register (userName, password, email, firstName, lastName, address) VALUES ('" + userName + "', '" + password + "', '" + email + "', '" + firstName + "', '" + lastName + "', '" + address + "')";
            stmt.executeUpdate(sql);
            con.close();
         
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        } 
        
    
}

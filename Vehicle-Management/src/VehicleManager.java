import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * VehicleManager
 */
public class VehicleManager extends ConnectToMysql {

    public static void main(String[] args) {
        // ConnectToMysql conn = new ConnectToMysql();
        // conn.ConnectionToMysql();
        // Add Jframe and Jlabel to capture inputs for  userName, password, email, firstName, lastName, address

        // JFrame
        JFrame frame = new JFrame("Vehicle Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        // capture the following userName, password, email, firstName, lastName, address
        JLabel label = new JLabel("User Name");
        JTextField userName = new JTextField();
        userName.setBounds(10, 10, 100, 100);
        frame.add(userName);
        label.setBounds(10, 10, 100, 100);
        frame.add(label);
        JLabel label1 = new JLabel("Password");
        JTextField password = new JTextField();
        password.setBounds(10, 30, 100, 100);
        frame.add(password);
        label1.setBounds(10, 30, 100, 100);
        frame.add(label1);
        JLabel label2 = new JLabel("Email");
        JTextField email = new JTextField();
        email.setBounds(10, 50, 100, 100);
        frame.add(email);
        label2.setBounds(10, 50, 100, 100);
        frame.add(label2);
        JLabel label3 = new JLabel("First Name");
        JTextField firstName = new JTextField();
        firstName.setBounds(10, 70, 100, 100);
        frame.add(firstName);
        label3.setBounds(10, 70, 100, 100);
        frame.add(label3);
        JLabel label4 = new JLabel("Last Name");
        JTextField lastName = new JTextField();
        lastName.setBounds(10, 90, 100, 100);
        frame.add(lastName);

        label4.setBounds(10, 90, 100, 100);
        frame.add(label4);
        JLabel label5 = new JLabel("Address");
        JTextField address = new JTextField();
        address.setBounds(10, 110, 100, 100);
        frame.add(address);
        label5.setBounds(10, 110, 100, 100);
        frame.add(label5);
        // JButton
        JButton button = new JButton("Submit");
        button.setBounds(10, 130, 100, 100);
        // frame.add(button);
        // JButton


        frame.setVisible(true);
        

        // Register register = new Register(userName, password, email, firstName, lastName, address);
        // String sql = "INSERT INTO vehicle (User_id, UserName, Password, Email, FirstName, LastName, Address) VALUES (?,?,?,?,?,?,?)";
        // PreparedStatement statement = connection.prepareStatement(sql);
        // statement.setInt(1, register.getUser_id());
        // statement.setString(2, register.getUserName());
        // statement.setString(3, register.getPassword());
        // statement.setString(4, register.getEmail());
        // statement.setString(5, register.getFirstName());
        // statement.setString(6, register.getLastName());
        // statement.setString(7, register.getAddress());
        // int rowsInserted = statement.executeUpdate();
        // if (rowsInserted > 0) {
        //     System.out.println("A new user was inserted successfully!");
        // }
        // String sql = "SELECT * FROM vehicle";
        // resultSet = statement.executeQuery(sql);
        // while (resultSet.next()) {
        //     int id = resultSet.getInt("User_id");
        //     String name = resultSet.getString("UserName");
        //     System.out.println("ID: " + id + ", Name: " + name);
        // }



       
    } 
    
}
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * VehicleManager
 */
public class VehicleManager extends  Register {

    public VehicleManager(String userName, String password, String email, String firstName, String lastName,
            String address) {
        super(userName, password, email, firstName, lastName, address);
        //TODO Auto-generated constructor stub

    }

    public static void main(String[] args) {
        // frame  to collect inputs required
        JFrame frame = new JFrame("Vehicle Manager");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        // jlabel to display welcome message
        JLabel welcome = new JLabel("Welcome to Vehicle Manager");
        welcome.setBounds(150, 10, 200, 30);
        frame.add(welcome);
        // jlabel to display username
        JLabel userName = new JLabel("Username");
        userName.setBounds(50, 50, 100, 30);
        frame.add(userName);
        // editfield to collect username
        JTextField userNameField = new JTextField();
        userNameField.setBounds(150, 50, 200, 30);
        frame.add(userNameField);
        // jlabel to display password
        JLabel password = new JLabel("Password");
        password.setBounds(50, 100, 100, 30);

        frame.add(password);
        // jtextfield to collect password
        JTextField passwordField = new JTextField();
        passwordField.setBounds(150, 100, 200, 30);
        frame.add(passwordField);
        // label to display email
        JLabel email = new JLabel("Email");
        email.setBounds(50, 150, 100, 30);
        frame.add(email);
        // editfield to collect email
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 150, 200, 30);
        frame.add(emailField);
        // jlabel to display first name
        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(50, 200, 100, 30);
        frame.add(firstName);
        // jtextfield to collect first name
        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(150, 200, 200, 30);
        frame.add(firstNameField);
        // jlabel to display last name
        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(50, 250, 100, 30);
        frame.add(lastName);
        // jtextfield to collect last name
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(150, 250, 200, 30);
        frame.add(lastNameField);
        // jlabel to display address
        JLabel address = new JLabel("Address");
        address.setBounds(50, 300, 100, 30);
        frame.add(address);
        // jtextfield to collect address

        JTextField addressField = new JTextField();
        addressField.setBounds(150, 300, 200, 30);
        frame.add(addressField);
        // jbutton to submit
        JButton submit = new JButton("Submit");
        submit.setBounds(150, 350, 100, 30);
        frame.add(submit);
        // jbutton to login
        JButton login = new JButton("Login");
        login.setBounds(150, 400, 100, 30);
        frame.add(login);
        // setVisible
        frame.setVisible(true);
        // get inputs if submit === submit
        submit.addActionListener(e -> {
            String userNameInput = userNameField.getText();
            String passwordInput = passwordField.getText();
            String emailInput = emailField.getText();
            String firstNameInput = firstNameField.getText();
            String lastNameInput = lastNameField.getText();
            String addressInput = addressField.getText();
            // set inputs to Register class
            Register register = new Register(userNameInput, passwordInput, emailInput, firstNameInput, lastNameInput,
                    addressInput);
            // insert to database
            register.insert();
            // close frame
            frame.dispose();
        });
        // if login redirect use redirect function
        login.addActionListener(e -> {
            // close frame
            frame.dispose();
            // frame to get  username and password  and button to log in
            JFrame loginFrame = new JFrame("Login");
            loginFrame.setSize(500, 600);
            loginFrame.setLayout(null);
            loginFrame.setVisible(true);
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setResizable(false);
            // jlabel to display welcome message
            JLabel welcomeLogin = new JLabel("Welcome to Login Vehicle Manager");
            welcomeLogin.setBounds(150, 10, 200, 30);
            loginFrame.add(welcomeLogin);
            // jlabel to display username
            JLabel userNameLogin = new JLabel("Username");
            userNameLogin.setBounds(50, 50, 100, 30);
            loginFrame.add(userNameLogin);
            // editfield to collect username
            JTextField userNameFieldLogin = new JTextField();
            userNameFieldLogin.setBounds(150, 50, 200, 30);
            loginFrame.add(userNameFieldLogin);
            // jlabel to display password
            JLabel passwordLogin = new JLabel("Password");
            passwordLogin.setBounds(50, 100, 100, 30);
            loginFrame.add(passwordLogin);
            // jtextfield to collect password
            JTextField passwordFieldLogin = new JTextField();
            passwordFieldLogin.setBounds(150, 100, 200, 30);
            loginFrame.add(passwordFieldLogin);
            // jbutton to login
            JButton loginButton = new JButton("Login");
            loginButton.setBounds(150, 150, 100, 30);
            loginFrame.add(loginButton);
            // get inputs if login === login
            loginButton.addActionListener(e1 -> {
                String userNameInputLogin = userNameFieldLogin.getText();
                String passwordInputLogin = passwordFieldLogin.getText();
                // set inputs to Log in class
                Login loginPage = new Login(userNameInputLogin, passwordInputLogin);
                // check if user exists
                if (loginPage.login()) {
                    // close frame
                    loginFrame.dispose();
                    // frame to get  username and password  and button to log in
                    MainMenuFrame menu = new MainMenuFrame();
                    menu.MainMenu();
                  

                  
                   
                }
            });
     

        
        
      
       
       

    });
    
}
}
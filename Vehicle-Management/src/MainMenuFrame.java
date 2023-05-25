import javax.swing.*;


public class MainMenuFrame extends ConnectToMysql {
    private JFrame vehicleFrame;


    public void MainMenu() {

        vehicleFrame = new JFrame("Vehicle Manager");
        vehicleFrame.setSize(500, 600);
        vehicleFrame.setLayout(null);
        vehicleFrame.setVisible(true);
        vehicleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vehicleFrame.setLocationRelativeTo(null);
        vehicleFrame.setResizable(false);
        // label to display welcome message
        JLabel welcomeVehicle = new JLabel("Welcome to Vehicle Manager");
        welcomeVehicle.setBounds(150, 10, 200, 30);
        vehicleFrame.add(welcomeVehicle);
        // Set Menu item
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem addVehicle = new JMenuItem("Add Vehicle");
        JMenuItem viewVehicle = new JMenuItem("View Vehicle");
        JMenuItem updateVehicle = new JMenuItem("Update Vehicle");
        JMenuItem deleteVehicle = new JMenuItem("Delete Vehicle");
        JMenuItem logout = new JMenuItem("Logout");
        menu.add(addVehicle);
        menu.add(viewVehicle);
        menu.add(updateVehicle);
        menu.add(deleteVehicle);
        menu.add(logout);
        menuBar.add(menu);
        vehicleFrame.setJMenuBar(menuBar);

        // set   window  to show  more info of the system
        JLabel userName = new JLabel("Username");
        userName.setBounds(0, 550, 100, 30);
        vehicleFrame.add(userName);


        // add vehicle
        addVehicle.addActionListener(e2 ->

        {
            // close frame
            vehicleFrame.dispose();
            Vehicle vehicle = new Vehicle();
            vehicle.addVehicle();
            // get inputs if add vehicle === add vehicle

        });
        // view button
        viewVehicle.addActionListener(e3 ->
        {
            // close frame
            vehicleFrame.dispose();
            Vehicle veh = new Vehicle();
            veh.viewVehicle();
        });


    }


}

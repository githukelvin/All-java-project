import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddVehicle extends ConnectToMysql {
    public String vehicleMake;
    public String vehicleName;
    public String vehicleModel;
    public String vehicleYear;
    public Float vehiclePrice;
    public String vehicleColor;
    public String bodyType;
    public int noOfDoors;
    public int Space;

    public void addAVehicle(JFrame addVehicleFrame, String carType) {
        // DB
        ConnectToMysql conn = new ConnectToMysql();
        conn.connectToDB();

        Connection connection = conn.connection;
        addVehicleFrame.dispose();
        // frame to get vehicle name, model, year, price and button to add
        JFrame addFrame = new JFrame("Add Vehicle");
        addFrame.setSize(500, 700);
        addFrame.setLayout(null);
        addFrame.setVisible(true);
        addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addFrame.setLocationRelativeTo(null);
        addFrame.setResizable(false);
        // jlabel to display welcome message
        JLabel welcomeAddVehicle = new JLabel("Add Vehicle");
        welcomeAddVehicle.setBounds(150, 10, 200, 30);
        addFrame.add(welcomeAddVehicle);
        // jlabel to display vehicle make
        JLabel vehicleMake = new JLabel("Vehicle Make");
        vehicleMake.setBounds(50, 50, 100, 30);
        addFrame.add(vehicleMake);
        // editfield to collect vehicle make
        JTextField vehicleMakeField = new JTextField();
        vehicleMakeField.setBounds(150, 50, 200, 30);
        addFrame.add(vehicleMakeField);

        // jlabel to display vehicle name
        JLabel vehicleName = new JLabel("Vehicle Name");
        vehicleName.setBounds(50, 100, 100, 30);
        addFrame.add(vehicleName);
        // editfield to collect vehicle name
        JTextField vehicleNameField = new JTextField();
        vehicleNameField.setBounds(150, 100, 200, 30);
        addFrame.add(vehicleNameField);
        // jlabel to display vehicle model
        JLabel vehicleModel = new JLabel("Vehicle Model");
        vehicleModel.setBounds(50, 150, 100, 30);
        addFrame.add(vehicleModel);
        // editfield to collect vehicle model
        JTextField vehicleModelField = new JTextField();
        vehicleModelField.setBounds(150, 150, 200, 30);
        addFrame.add(vehicleModelField);
        // jlabel to display vehicle year
        JLabel vehicleYear = new JLabel("Vehicle Year");
        vehicleYear.setBounds(50, 200, 100, 30);
        addFrame.add(vehicleYear);
        // editfield to collect vehicle year
        JTextField vehicleYearField = new JTextField();
        vehicleYearField.setBounds(150, 200, 200, 30);
        addFrame.add(vehicleYearField);
        // jlabel to display vehicle price
        JLabel vehiclePrice = new JLabel("Vehicle Price");
        vehiclePrice.setBounds(50, 250, 100, 30);
        addFrame.add(vehiclePrice);
        // editfield to collect vehicle price
        JTextField vehiclePriceField = new JTextField();
        vehiclePriceField.setBounds(150, 250, 200, 30);
        addFrame.add(vehiclePriceField);
        // bodyType
        JLabel bodyType = new JLabel("Body Type");
        bodyType.setBounds(50, 300, 100, 30);
        addFrame.add(bodyType);
        // editfield to collect bodyType
        JTextField bodyTypeField = new JTextField();
        bodyTypeField.setBounds(150, 300, 200, 30);
        addFrame.add(bodyTypeField);
        // editfield to collect vehicle price

        // noOfDoors
        JLabel noOfDoors = new JLabel("No Of Doors");
        noOfDoors.setBounds(50, 350, 100, 30);
        addFrame.add(noOfDoors);
        // editfield to collect noOfDoors
        JTextField noOfDoorsField = new JTextField();
        noOfDoorsField.setBounds(150, 350, 200, 30);
        addFrame.add(noOfDoorsField);

        // Space
        JLabel Space = new JLabel("Space/noOfPass");
        Space.setBounds(50, 400, 100, 30);
        addFrame.add(Space);
        // editfield to collect Space
        JTextField SpaceField = new JTextField();
        SpaceField.setBounds(150, 400, 200, 30);
        addFrame.add(SpaceField);
        // jlabel to display vehicle color
        JLabel vehicleColor = new JLabel("Vehicle Color");
        vehicleColor.setBounds(50, 450, 100, 30);
        addFrame.add(vehicleColor);
        // editfield to collect vehicle color
        JTextField vehicleColorField = new JTextField();
        vehicleColorField.setBounds(150, 450, 200, 30);
        addFrame.add(vehicleColorField);

        // jbutton to add vehicle
        JButton addVehicleButton = new JButton("Add Vehicle");
        addVehicleButton.setBounds(200, 500, 100, 30);
        addFrame.add(addVehicleButton);
        // add button to got to previous
        JButton previousButton = new JButton("Previous");
        previousButton.setBounds(50, 550, 100, 30);
        addFrame.add(previousButton);

        // action
        previousButton.addActionListener(e1 -> {
            addFrame.dispose();
            Vehicle vh = new Vehicle();
            vh.addVehicle();
        });


        // add vehicle button action listener
        addVehicleButton.addActionListener(e -> {
            // get all inputs
            this.vehicleMake = vehicleMakeField.getText();
            this.vehicleName = vehicleNameField.getText();
            this.vehicleModel = vehicleModelField.getText();
            this.vehicleYear = vehicleYearField.getText();
            this.vehiclePrice = Float.parseFloat(vehiclePriceField.getText());
            this.bodyType = bodyTypeField.getText();
            this.vehicleColor = vehicleColorField.getText();
            this.noOfDoors = Integer.parseInt(noOfDoorsField.getText());
            this.Space = Integer.parseInt(SpaceField.getText());
            try {
                // Create a statement
                statement = connection.createStatement();
                // Execute SQL query
                String sql = "INSERT INTO vehicle (CarType,vehicleMake, vehicleName, vehicleModel, vehicleYear, vehiclePrice,vehicleColor, bodyType, noOfDoors, Space) VALUES (?,?, ?, ?, ?, ?, ?,?,?,?)";
                PreparedStatement preparedStmt = connection.prepareStatement(sql);
                preparedStmt.setString(1, carType);
                preparedStmt.setString(2, this.vehicleMake);
                preparedStmt.setString(3, this.vehicleName);
                preparedStmt.setString(4, this.vehicleModel);
                preparedStmt.setString(5, this.vehicleYear);
                preparedStmt.setFloat(6, this.vehiclePrice);
                preparedStmt.setString(7, this.vehicleColor);
                preparedStmt.setString(8, this.bodyType);
                preparedStmt.setInt(9, this.noOfDoors);
                preparedStmt.setInt(10, this.Space);

                // Execute SQL query
                preparedStmt.execute();
                // add to frame the success
                new SuccessDialog("The Vehicle Details Succesfully added");

                // Process the result set
                preparedStmt.execute();
                // close the connection
                connection.close();
                // close the statement
                statement.close();
                // clear the fields
                vehicleMakeField.setText("");
                vehicleNameField.setText("");
                vehicleModelField.setText("");
                vehicleYearField.setText("");

                vehiclePriceField.setText("");
                bodyTypeField.setText("");
                vehicleColorField.setText("");
                noOfDoorsField.setText("");
                SpaceField.setText("");
                // refresh table

            } catch (Exception e1) {
                new ErrorDialog("The  Vehicle Registration have failed");

                System.out.println(e1);
            }
            // add to frame the error
            // add to frame the success
        });

    }


}

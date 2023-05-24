import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class Vehicle extends ConnectToMysql {


    public void addVehicle(){
        // DB
  
        // Object  class
        JFrame addVehicleFrame = new JFrame("Add Vehicle");

        // buttons for  diferrebt types of vehicle
        JButton carButton = new JButton("Car");
        carButton.setBounds(50, 200, 100, 30);
        addVehicleFrame.add(carButton);
        JButton truckButton = new JButton("Truck");
        truckButton.setBounds(150, 200, 100, 30);
        addVehicleFrame.add(truckButton);
        JButton motorcycleButton = new JButton("Motorcycle");
        motorcycleButton.setBounds(250, 200, 100, 30);  
        addVehicleFrame.add(motorcycleButton);
        JButton busButton = new JButton("Bus");
        busButton.setBounds(350, 200, 100, 30);
        addVehicleFrame.add(busButton);
        JButton vanButton = new JButton("Van");
        vanButton.setBounds(450, 200, 100, 30);
        addVehicleFrame.add(vanButton);
        JButton trailerButton = new JButton("Trailer");
        trailerButton.setBounds(550, 200, 100, 30);
        addVehicleFrame.add(trailerButton);
        // add  label to show message 
        JLabel message = new JLabel("Select Vehicle Type");
        message.setBounds(250, 100, 200, 100);
        addVehicleFrame.add(message);

        // car button action listener
        // get text of button
        carButton.addActionListener(e -> {
            // get text of button
            String buttonText = carButton.getText();
            // check if text is equal to car
            if (buttonText.equals("Car")) {
                // call add car method
                AddVehicle Vehicles= new AddVehicle();
                Vehicles.addAVehicle(addVehicleFrame ,buttonText);
      
            }
        });
        // truck button action listener
        truckButton.addActionListener(e -> {
            // get text of button
            String buttonText = truckButton.getText();
            // check if text is equal to truck
            if (buttonText.equals("Truck")) {
                // call add truck method
                AddVehicle Vehicles= new AddVehicle();
                Vehicles.addAVehicle(addVehicleFrame ,buttonText);
            }
        });
        // motorcycle button action listener
        motorcycleButton.addActionListener(e -> {
            // get text of button
            String buttonText = motorcycleButton.getText();
            // check if text is equal to motorcycle
            if (buttonText.equals("Motorcycle")) {
                // call add motorcycle method
                AddVehicle Vehicles= new AddVehicle();
                Vehicles.addAVehicle(addVehicleFrame ,buttonText);
            }
        });
        // bus button action listener
        busButton.addActionListener(e -> {
            // get text of button
            String buttonText = busButton.getText();
            // check if text is equal to bus
            if (buttonText.equals("Bus")) {
                // call add bus method
                AddVehicle Vehicles= new AddVehicle();
                Vehicles.addAVehicle(addVehicleFrame ,buttonText);
            }
        });
        // van button action listener
        vanButton.addActionListener(e -> {
            // get text of button
            String buttonText = vanButton.getText();
            // check if text is equal to van
            if (buttonText.equals("Van")) {
                // call add van method
                AddVehicle Vehicles= new AddVehicle();
                Vehicles.addAVehicle(addVehicleFrame ,buttonText);
            }
        });
        // trailer button action listener
        trailerButton.addActionListener(e -> {
            // get text of button
            String buttonText = trailerButton.getText();
            // check if text is equal to trailer
            if (buttonText.equals("Trailer")) {
                // call add trailer method
                AddVehicle Vehicles= new AddVehicle();
                Vehicles.addAVehicle(addVehicleFrame ,buttonText);
            }
        });
        // add button action listener



        // action  btns
        // jbutton to go back to main menu
        JButton mainMenuButton = new JButton("Main Menu");
        mainMenuButton.setBounds(200, 300, 100, 30);
        addVehicleFrame.add(mainMenuButton);
        // jbutton to exit
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(200, 3500, 100, 30);
        addVehicleFrame.add(exitButton);



        
        // main menu button action listener
        mainMenuButton.addActionListener(e -> {
            // go back to main menu
            addVehicleFrame.dispose();
            // return 
            MainMenuFrame mainMenuFrame = new MainMenuFrame();
            mainMenuFrame.MainMenu();





        });
        // exit  Button
        exitButton.addActionListener(e -> {
            // exit
            System.exit(0);
        });
        // set  visible
        addVehicleFrame.setSize(700, 700);
        addVehicleFrame.setLayout(null);
        addVehicleFrame.setVisible(true);
        addVehicleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void viewVehicle() {
        ConnectToMysql conn = new ConnectToMysql();
        conn.connectToDB();

        Connection connection = conn.connection;

        // Create a query to get all vehicles
        String query = "SELECT * FROM vehicle";

        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.last();
            int numberOfRows = resultSet.getRow();
            resultSet.beforeFirst();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            Object[][] data = new Object[numberOfRows][numberOfColumns];

            int row = 0;
            while (resultSet.next()) {
                for (int column = 0; column < numberOfColumns; column++) {
                    data[row][column] = resultSet.getObject(column + 1);
                }
                row++;
            }

            String[] columnNames = { "vehicleMake", "vehicleName", "vehicleModel", "vehicleYear", "vehiclePrice",
                    "vehicleColor", "bodyType", "noOfDoors", "Space" };

            // Create a JTable with the data and column names
            JTable table = new JTable(data, columnNames);

            // Create a scroll pane and add the table to it
            JScrollPane scrollPane = new JScrollPane(table);

            // Create a panel and add the scroll pane to it
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(scrollPane, BorderLayout.CENTER);

            // Create a frame and add the panel to it
            JFrame frame = new JFrame("View Vehicle");
            frame.setSize(1000, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            // Set the frame to be visible
            frame.setVisible(true);

            // Close the connection and statement
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    


        




        
}

     


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface Engine {
    void start();
    void stop();
}

class Vehicle {
    private String VIN;
    private String make;
    private String model;
    private int capacity;
    private Engine engine;

    public Vehicle(String VIN, String make, String model, int capacity, Engine engine) {
        this.VIN = VIN;
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.engine = engine;
    }

    public String getVIN() {
        return VIN;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }
}

class CarEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Car engine started. Vroom vroom!");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");
    }
}

class TruckEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Truck engine started. Rumble rumble!");
    }

    @Override
    public void stop() {
        System.out.println("Truck engine stopped.");
    }
}

class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class VehicleM{
    private Vehicle car;
    private Vehicle truck;

    private JLabel carInfoLabel;

    public static void main(String[] args) {
        VehicleM system = new VehicleM();
        system.start();
    }

    public void start() {
        car = new Vehicle("12345", "Toyota", "Corolla", 5, new CarEngine());
        truck = new Vehicle("67890", "Ford", "F-150", 3, new TruckEngine());

        JFrame frame = new JFrame("Vehicle Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel carLabel = new JLabel("Car");
        carLabel.setBounds(20, 20, 100, 30);

        JButton carStartButton = new JButton("Start");
        carStartButton.setBounds(120, 20, 80, 30);
        carStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car.startEngine();
                displayOwner();
            }
        });

        JButton carStopButton = new JButton("Stop");
        carStopButton.setBounds(220, 20, 80, 30);
        carStopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car.stopEngine();
            }
        });

        carInfoLabel = new JLabel();
        carInfoLabel.setBounds(20, 60, 300, 30);

        JLabel truckLabel = new JLabel("Truck");
        truckLabel.setBounds(20, 100, 100, 30);

        JButton truckStartButton = new JButton("Start");
        truckStartButton.setBounds(120, 100, 80, 30);
        truckStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                truck.startEngine();
                displayOwner();
            }
        });

        JButton truckStopButton = new JButton("Stop");
        truckStopButton.setBounds(220, 100, 80, 30);
        truckStopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                truck.stopEngine();
            }
        });

        panel.add(carLabel);
        panel.add(carStartButton);
        panel.add(carStopButton);
        panel.add(carInfoLabel);
        panel.add(truckLabel);
        panel.add(truckStartButton);
        panel.add(truckStopButton);

        frame.add(panel);
        frame.setSize(350, 180);
        frame.setVisible(true);
    }

    public void displayOwner() {
        Owner owner = new Owner("Selasio ");
        carInfoLabel.setText("Vehicle owned by: " + owner.getName());
    }
}

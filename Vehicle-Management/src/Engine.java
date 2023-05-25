public class Engine {
    // use  this class to implement overiding and overloading

    public static void main(String[] args) {
        // create an object of the class
        Engine e = new Engine();
        // call the method
        e.start();
        e.start("Toyota");
        e.start("Toyota", "Camry");
        e.start("Toyota", "Camry", 2019);
        e.start("Toyota", "Camry", 2019, "Black");
        e.start("Toyota", "Camry", 2019, "Black", 4);
        e.start("Toyota", "Camry", 2019, "Black", 4, 4);
        e.start("Toyota", "Camry", 2019, "Black", 4, 4, 4);
        e.start("Toyota", "Camry", 2019, "Black", 4, 4, 4, 4);
        e.start("Toyota", "Camry", 2019, "Black", 4, 4, 4, 4, 4);
        e.start("Toyota", "Camry", 2019, "Black", 4, 4, 4, 4, 4, 4);
        e.start("Toyota", "Camry", 2019, "Black", 4, 4, 4, 4, 4, 4, 4);
        e.start("Toyota", "Camry", 2019, "Black", 4, 4, 4, 4, 4, 4, 4, 4);
        e.start("Toyota", "Camry", 2019, "Black", 4, 4, 4, 4, 4, 4, 4, 4, 4);

    }
    // define the method
    public void start() {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color, int doors) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color, int doors, int windows) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color, int doors, int windows, int seats) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color, int doors, int windows, int seats, int wheels) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color, int doors, int windows, int seats, int wheels, int mirrors) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color, int doors, int windows, int seats, int wheels, int mirrors, int lights) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color, int doors, int windows, int seats, int wheels, int mirrors, int lights, int wipers) {
        System.out.println("Engine started");
    }
    // overloading the method

    public void start(String make, String model, int year, String color, int doors, int windows, int seats, int wheels, int mirrors, int lights, int wipers, int radio) {
        System.out.println("Engine started");
    }
    // overloading the method
    public void start(String make, String model, int year, String color, int doors, int windows, int seats, int wheels, int mirrors, int lights, int wipers, int radio, int horn) {
        System.out.println("Engine started");
    }
    // overiding the method
    

    

    
}

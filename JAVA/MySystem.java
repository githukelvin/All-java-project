import javax.swing.JOptionPane;

public class MySystem {
    String owner;
    private String secret;

    public static void main(String[]args) {
        MySystem system = new MySystem();
        system.secret = "secret";   
        // system.owner = "Kelvin";
       system.owner= JOptionPane.showInputDialog(null,"Enter owner");

    //   use joptionpane to get two integers

      int Number1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number 1"));
      int Number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number 2"));

        // function to add two numbers
//    int sum = system.add(Number1, Number2);

        System.out.println(system.owner);
        System.out.println(Number1 + Number2);
        
    }
    
}
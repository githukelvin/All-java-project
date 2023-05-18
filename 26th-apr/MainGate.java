public class MainGate{
    public static void main(String argv[]) {
        // System.out.println("This is a User Class");
       User user1 = new User("Kelvin", "Githu", 001);
    NormalUser user2 = new NormalUser("John", "Maina", 003);

    user1.eat();
    user2.eat();
    user2.eat("Bread","Uji");

    }
}
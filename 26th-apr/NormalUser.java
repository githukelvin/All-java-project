public class NormalUser extends User {

    NormalUser(String nameOfUser, String userName, int normalId) {
        super(nameOfUser, userName, normalId);
        type = "normal User";
    }
    void identify(){
        // logic for identifying
        System.out.println("Normal User identification");
    }
    void eat(){
        System.out.println("I am eating  normal stuff");
        System.out.println("Something else ..." + 20);
    }

    void eat(String food,String beverage){
        System.out.println("I am eating  "+ food +" and " + beverage );
        System.out.println("I was very happy");

    }

}

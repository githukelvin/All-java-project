public class User {
    String name, type;
    String userName, password;
    int identification;
    boolean loggedInStatus;

    void login() {
        // logic for logging in
        Authenticate authMe = new Authenticate();
        this.loggedInStatus = authMe.checkDetails();
    }
    void identify(){
        // logic for identifying
        System.out.println("General identification");
    }
    

    User(String aName, String aUserName, int anID) {
        // logic for instantiates a User
        name = aName;
        userName = aUserName;
        identification = anID;
        password = anID + userName;
    }
    // overiding
    void eat(){
        System.out.println("I am eating  general stuff");
    }

}

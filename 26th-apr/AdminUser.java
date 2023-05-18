public class AdminUser extends User {
    AdminUser(String nameOfAdmin, String adminUserName, int adminId) {
        super(nameOfAdmin, adminUserName, adminId);
        type = "superUSer";
    }


    void verify() {

    }
    void identify(){
        // logic for identifying
        System.out.println("Admin User identification");
    }
}

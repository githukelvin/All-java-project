/**
 * This class is the Application entry point
 */
/**
 * * @author Salesio
 */
//package tukgatesystemFile;

import java.util.Scanner;

public class TUKGateSystem {

    User currLoggedInUser;
    
    /* This is a method I use to avoid having to type **SYSTEM.OUT.PRINTLN** */
    void myPrint(String str) {
        System.out.println(str);
    }

    public static void main(String args[]) {
        TUKGateSystem tukGateSys = new TUKGateSystem();
        // start of a loop X
        tukGateSys.myPrint("Make a Choice from Below:");
        tukGateSys.myPrint("1. Login (I am Registered) \n2. I want to Register \n3. Logout");
        Scanner keyBoard = new Scanner(System.in);
        int choice = keyBoard.nextInt();
        switch (choice) {
            case 1:
                tukGateSys.currLoggedInUser = new User();
                tukGateSys.currLoggedInUser.login();
                break;
            case 2:
                User newUser = new User();
                newUser.register();
                // TODO --> view the menu once more to LOGIN
                // CHECK A password fullfills some criteria --> for security
                // don't show plain passwd --> hash the password
                break;
            case 3:
                // terminate / logout
            default:
                tukGateSys.myPrint("Wrong Choice");
                break;

            // delete user, log out, support for multiple run
            // end of the loop X
        }
    }

}

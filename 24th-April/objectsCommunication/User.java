//package tukgatesystemFile;

import java.util.Scanner;
//import  tukgatesystemDB.TUKGateSystem.myPrint;

/**
 *
 * @author Salesio
 */
public class User {

    // properties
    String userName, passWord, firstName, secondName;

    // create user
    // search for a user
    // edit a user
    void myPrint(String str) {
        System.out.println(str);
    }

    void login() {
        Scanner keyBoard = new Scanner(System.in);
        myPrint("Enter UserName:");
        String username = keyBoard.next();
        myPrint("Enter password");
        String passwd = keyBoard.next();
        FileBasedStore myLogin = new FileBasedStore();
        myLogin.checkUser(username, passwd);
    }

    void register() {
        Scanner keyBoard = new Scanner(System.in);
        myPrint("Enter UserName to Register:");
        String username = keyBoard.next();
        myPrint("Enter password for User: " + username);
        String passwd = keyBoard.next();
        FileBasedStore myLogin = new FileBasedStore();
        myLogin.createUsersFile(username, passwd);
    }
}

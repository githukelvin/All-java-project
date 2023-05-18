//package tukgatesystemFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Salesio
 */
public class FileBasedStore {
    String passFileName = "passwd.txt";

    /*
     * public FileBasedStore() {
     * 
     * }
     */
    boolean checkUser(String usrName, String passWord) {

        if (validate(usrName, passWord)) {
            System.out.println("was Found");
            return true;
        } else {
            System.out.println("was NOT NOT Found");
            return false;
        }
    }

    boolean validate(String usrName, String passWord) {
        boolean tempValidation = false;
        BufferedReader fileReader;
        try {
            fileReader = new BufferedReader(new FileReader(passFileName));
            String oneLine = fileReader.readLine();
            while (oneLine != null) {
                String tmpUser = oneLine.substring(0, oneLine.indexOf(" "));
                // austine 123
                // godwin abc
                String tmpPass = oneLine.substring(oneLine.indexOf(" ") + 1);
                if ((tmpUser.equals(usrName)) && (tmpPass.equals(passWord)))
                    tempValidation = true;
                // System.out.println(tmpUser);
                // System.out.println(tmpPass);
                oneLine = fileReader.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return tempValidation;
    }

    void createUsersFile(String userName, String password) {
        // create bytes to write to file
        String oneLine = userName + " " + password + "\n";
        byte data[] = oneLine.getBytes();
        try {
            File usersFile = new File(passFileName);
            if (!usersFile.exists()) {
                OutputStream outPassFile = new FileOutputStream(passFileName);
                outPassFile.write(data, 0, data.length);
            } else {
                OutputStream outPassFile = new FileOutputStream(passFileName, true);
                outPassFile.write(data, 0, data.length);
            }
        } catch (IOException e) {
            System.out.print("Exception: " + e.getMessage());

        }

    }

}

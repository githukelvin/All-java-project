
import java.util.Scanner;
/**
 * code
 */
public class code {
    String nameOfStation;
    String nameOfPolice;
    // date
    String date;
    int incident;



    void createCode()
    {
        // scan user input
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter the name of the station");
        nameOfStation = scanName.nextLine();
        System.out.println("Enter the police name");
        nameOfPolice = scanName.nextLine();
        System.out.println("Enter date of the incident");
        date = scanName.nextLine();
        System.out.println("Incident Number");
        incident = Integer.parseInt(scanName.nextLine());

        // create object  code
        String uniqueCode = nameOfStation+"/"+date+"/"+incident+"-"+nameOfPolice;


        System.out.println("This is  the Unique Code  :" + uniqueCode);

        


    }
    


    // create a unique that contains name of station,date of the incident,serial number
   
    
}
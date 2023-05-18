import java.util.Scanner;

public class MyProgram{
    String owner;
    private String secret;

    public static void main(String[]args) {
        MyProgram myProgram = new MyProgram();
        System.out.println("Enter the name of the student :");
        Scanner scanName= new Scanner(System.in);
        myProgram.owner=scanName.nextLine();
        System.out.println("Enter the secret you hold :");
        Scanner scanSecrect = new Scanner(System.in);
        myProgram.secret=scanSecrect.nextLine();
        System.out.println("Name is :");
        System.out.println(myProgram.owner);
        System.out.println("secret is :");
        System.out.println(myProgram.secret);

        
    }
}



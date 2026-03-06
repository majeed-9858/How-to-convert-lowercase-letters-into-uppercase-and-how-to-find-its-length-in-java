import java.util.Scanner;

public class GreetingMessageFormator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter second name: ");
        String secondName = sc.nextLine();

        String fullName = firstName + " " + secondName;
        String upperName = fullName.toUpperCase();

        System.out.println("Full name in uppercase: " + upperName);
        System.out.println("Length of full name: " + fullName.length());


        sc.close();
    }
}
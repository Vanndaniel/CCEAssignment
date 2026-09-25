import java.util.Scanner;
public class testing {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("First Name: ");
        String firstName = input.nextLine ();

        System.out.print("Last Name: ");
        String lastName = input.nextLine ();

        System.out.print("Birth Year: ");
        int birthYear = input.nextInt ();

        int currYear = 2026;
        int age = currYear - birthYear;
        
        System.out.println("Hello " + firstName + " " + lastName  + " Your current age is " + age + ".");

        input.close();

    }
}
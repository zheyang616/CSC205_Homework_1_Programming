//Zhe Yang

//Import scanner module
import java.util.Scanner;

//Define class
public class CSC205_Homework_1_Problem_3 {
    //Define method and intake parameters
    public static void main(String[] args){
        //Create a scanner object to read data from users
        Scanner scanner = new Scanner(System.in);

        //Ask the user for the quantity of quarters
        System.out.println("How many quarters do you have? ");
        int quarters = scanner.nextInt();

        //Ask the user for the quantity of dimes
        System.out.println("How many dimes do you have? ");
        int dimes = scanner.nextInt();

        //Ask the user for the quantity of nickels
        System.out.println("How many nickels do you have? ");
        int nickels = scanner.nextInt();

        //Ask the user for the quantity of pennies
        System.out.println("How many pennies do you have? ");
        int pennies = scanner.nextInt();

        //Calculate the total amount in dollars
        double dollars = (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.5) + (pennies * 0.01);

        //Display the total amount in dollars
        System.out.println("You have $ " + dollars);

        //Close the scanner
        scanner.close();
    }
}

//Zhe Yang

//Import Scanner module
import java.util.Scanner;

import javax.sound.midi.Soundbank;
//Define class
public class CSC205_Homewor_1_Problem_2 {
    //Create execute method and input parameter
    public static void main(String[] args){
        //Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Ask the user for a name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //Convert the name to uppercase
        String upperCaseName = name.toUpperCase();

        //Greet the user with the converted name
        System.out.println("Hello " + upperCaseName + " nice to meet you!");

        //Close the scanner
        scanner.close();
    }
}

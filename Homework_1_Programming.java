//Zhe Yang
/**
 * Homework_1_Programming
 */
public class Homework_1_Programming {
    //Execute method
    public static void main(String[] args) {
        //Assign first variable
        int firstRoll = rollDie();
        //Print first number
        System.out.print("The first number is " + firstRoll + "\n");
        
        //Assign seconde variable
        int secondRoll = rollDie();
        System.out.print("The seconde number is " + secondRoll + "\n"); 

        //Calculate the total roll
        int totalRoll = firstRoll + secondRoll;
        System.out.print("The total roll is " + totalRoll);
    }
    //Define method
    public static int rollDie(){
        //Generate a number between 1 and 6(inclusive)
        return (int) (Math.random() * 6) + 1;
    }

}
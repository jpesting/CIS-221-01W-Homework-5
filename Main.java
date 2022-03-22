/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

import java.util.Scanner; // Used for user input for integer guess

public class Main { // Root Class - used to print results to the console

    public static void main(String[] args) { // Main method
        Root result = new Root(); // Create object of Root class - Used to call getter methods
        Scanner input = new Scanner(System.in); // Reference Scanner class - Used for user input
        System.out.println("Two dice will roll and you will guess the total:");
        System.out.println("Enter an integer (2 - 12): ");
        result.setValue(input.nextInt()); // Calling setValue method in Root class and using the user's input as the argument
        System.out.println("Sum of the two dice rolls: " + result.getSum()); // Print the sum to console
    }

}
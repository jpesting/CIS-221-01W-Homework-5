/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

public class Root { // Main Class - Used to declare variables

    OutterValues outterStore = new OutterValues(); // Create object of the outter OutterValues class
    OutterValues.Values store = outterStore.new Values(); // Create object of the inner Values class - Used to reference the declared variables inside


    public class OutterValues {
        private class Values { // Private Values class - Used to withhold data from the user
            private int die1 = Roll.roll(); // Assign roll 1 to a private and randomly generated integer (1-6) using the roll method located in the Roll class
            private int die2 = Roll.roll(); // Assign roll 2 to a private and randomly generated integer (1-6) using the roll method located in the Roll class
            private int sum = die1 + die2; // Declare a private variable to store the sum of the two rolls
        }
    }

    public int getSum() { // Getter for the sum of the two rolls
        return store.sum;
    }

    public int getRoll1() { // Getter for the value of the first roll
        return store.die1;
    }

    public int getRoll2() { // Getter for the value of the second roll
        return store.die2;
    }

    public void setValue(int x) { // setValue method - Used as a check to see if the user's input equals the sum of the two rolls
        if (x == getSum()) { // Will return positive feedback if the user's input equalled the sum of the two rolls
            System.out.println("You guessed correctly!");
        }
        else if ((x <= 1) || (x >= 13)) { // Will throw and error if the user does not enter an integer between (2 and 12)
            System.out.println("Invalid input!");
        }
        else {
            System.out.println("You guessed incorrectly!"); // Will return negative feedback if the user's input does not equal the sum of the two rolls
        }
    }

}
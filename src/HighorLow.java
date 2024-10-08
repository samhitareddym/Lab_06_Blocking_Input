import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Create Scanner Object for user input
        Random rand = new Random();

        // Generate random number between 1 and 10 inclusive
        int randomNumber = rand.nextInt(10) + 1;
        int guess= 0;
        boolean validInput;

        // Get the user's guess
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess >= 1 && guess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Invalid guess. Please enter a number between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                validInput = false;
                in.next();  // Clear invalid input
            }
        } while (!validInput);

        // Display the random number and whether the guess is high, low, or correct
        System.out.println("The random number was: " + randomNumber);
        if (guess == randomNumber) {
            System.out.println("You guessed it! On the money!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was too low.");
        }
    }
}

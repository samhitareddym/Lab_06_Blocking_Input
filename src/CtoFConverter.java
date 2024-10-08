import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Create Scanner Object for user input
        double celsius = 0;
        boolean validInput;
        // Do-while loop to validate the input
        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble()) {  // Check if the user input is a valid number
                celsius = in.nextDouble();  // Store the valid number
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.next();  // Clear the invalid input
            }
        } while (!validInput);  // Repeat the loop until valid input is received
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        // Output the result
        System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit + "°F");
    }
}

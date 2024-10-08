import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);
        double gallonsInTank = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;
        boolean validInput;

        // Get the number of gallons in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            validInput = in.hasNextDouble();  // Check if input is a valid double
            if (validInput) {
                gallonsInTank = in.nextDouble();  // Store valid input
            } else {
                System.out.println("Invalid input. Please enter a number.");
                in.next();  // Clear invalid input
            }
        } while (!validInput);

        // Get the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            validInput = in.hasNextDouble();
            if (validInput) {
                fuelEfficiency = in.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                in.next();
            }
        } while (!validInput);

        // Get the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            validInput = in.hasNextDouble();
            if (validInput) {
                pricePerGallon = in.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                in.next();
            }
        } while (!validInput);

        // Calculate and display the results
        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double maxDistance = gallonsInTank * fuelEfficiency;

        System.out.println ("The cost to drive 100 miles is:" +"$"+ costPer100Miles);
        System.out.println ("The no. of miles the car can go with a full tank is:" +maxDistance+ "miles");
    }
}

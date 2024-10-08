import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Create Scanner Object for user input
        double width = 0.0;
        double height = 0.0;
        boolean validInput;

        // Get the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                if (width > 0) {
                    validInput = true;
                } else {
                    System.out.println("Width must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.next();  // Clear invalid input
            }
        } while (!validInput);

        // Get the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height > 0) {
                    validInput = true;
                } else {
                    System.out.println("Height must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                in.next();  // Clear invalid input
            }
        } while (!validInput);

        // Calculate the area, perimeter, and diagonal length
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        // Display the results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.printf("The length of the diagonal is: " + diagonal);
    }
}

/*public class ExceptionDemo {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            // Check for potential ArithmeticException
            if (divisor == 0) {
                // Manually throwing an ArithmeticException
                throw new ArithmeticException("Custom Error: You cannot divide by zero!");
            } else {
                int result = dividend / divisor;
                System.out.println("Result: " + result);
            }
        } 
        catch (ArithmeticException e) {
            // Catching and handling the specific exception
            System.out.println("Caught an Exception: " + e.getMessage());
        } 
        finally {
            // This block always executes regardless of an exception
            System.out.println("Finally block: Execution completed.");
        }
        
        System.out.println("The program continues...");
    }

}*/

/* writting the same code by taking input from user */

import java.util.Scanner;

public class UserInputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter dividend (number to divide): ");
            int dividend = sc.nextInt();

            System.out.print("Enter divisor (number to divide by): ");
            int divisor = sc.nextInt();

            // Logic to check for division by zero
            if (divisor == 0) {
                throw new ArithmeticException("Manually Thrown: Cannot divide by zero.");
            }

            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            // Catches non-arithmetic errors, like entering text instead of a number
            System.out.println("Error: Please enter valid integers.");
        } 
        finally {
            System.out.println("Finally: Closing scanner and cleaning up resources.");
            sc.close();
        }
    }
}




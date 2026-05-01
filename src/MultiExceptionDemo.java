import java.util.Scanner;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // A simple array with 3 elements (indices 0, 1, 2)
        int[] numbers = {10, 20, 30};

        try {
            // 1. Handling Arithmetic Exception
            System.out.print("Enter a number to divide 100 by: ");
            int divisor = sc.nextInt();
            
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            System.out.println("Division Result: " + (100 / divisor));

            // 2. Handling Array Index Exception
            System.out.print("Enter an array index to access (0-2): ");
            int index = sc.nextInt();
            
            if (index < 0 || index >= numbers.length) {
                throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds!");
            }
            System.out.println("Value at index " + index + " is: " + numbers[index]);

        } 
        catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General Error: Something went wrong.");
        } 
        finally {
            System.out.println("Execution finished. Cleaning up...");
            sc.close();
        }
    }
}
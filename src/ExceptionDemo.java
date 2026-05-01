public class ExceptionDemo {
   public ExceptionDemo() {
   }

   public static void main(String[] var0) {
      byte var1 = 10;
      byte var2 = 0;

      try {
         if (var2 == 0) {
            throw new ArithmeticException("Custom Error: You cannot divide by zero!");
         }

         int var3 = var1 / var2;
         System.out.println("Result: " + var3);
      } catch (ArithmeticException var7) {
         System.out.println("Caught an Exception: " + var7.getMessage());
      } finally {
         System.out.println("Finally block: Execution completed.");
      }

      System.out.println("The program continues...");
   }
}
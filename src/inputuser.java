import java.util.Scanner;

public class inputuser {

public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("enter an integer");

  int a = sc.nextInt();

  System.out.println("enter second integer");

  int b = sc.nextInt();

  int sum = a + b;

  System.out.println("the sum of two numbers is " + sum);
  
  sc.close();

  }
}









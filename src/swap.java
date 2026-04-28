import java.util.Scanner;
public class swap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swapping the numbers");
        System.out.println("the first number a becoms  : " + a);
        System.out.println("the second number b becomes  : " + b);
        sc.close();

    }
}

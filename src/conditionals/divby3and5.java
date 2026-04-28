package conditionals;
import java.util.Scanner;
public class divby3and5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check whether it is divisible by 3 and 5: ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("the number is divisible by 3 and 5 ");
        }
        else{
            System.out.println("the number is NOT divisible by 3 and 5 ");
        }
        sc.close();
}
}

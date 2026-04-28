import java.util.Scanner;

public class iFeLse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int m = sc.nextInt();

     if(m%2==0){
        System.out.println("the number you have entered is even");
     }
     else{
        System.out.println("the number you entered is odd");
     }

        sc.close();
    }

}

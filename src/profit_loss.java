import java.util.Scanner;

public class profit_loss {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the cost price :");
    double cp = sc.nextDouble();

    System.out.print("enter the selling price: ");
    double sp = sc.nextDouble();

    if(sp>cp){

        System.out.println("your profit is RS:");
        System.out.println(sp-cp + " rupees ");
    }
    else{
        System.out.println("your loss is RS:");
        System.out.println(cp-sp + " rupees ");
    }
    sc.close();
 }
}

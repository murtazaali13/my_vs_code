
import java.util.Scanner;

public class shopcart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String item;

        double price;

        double quantity;

        char  currency = '$';

        double total;

        System.out.print("enter the item: ");
        item = sc.nextLine();

        System.out.print("the price of item is: ");
        price = sc.nextDouble();

        System.out.print("how many of the items you want: ");
        quantity = sc.nextDouble();

        total = price * quantity;

        System.out.println("you have bought : " + quantity + " " + item + " " );
        System.out.println("your total bill is " + currency + total);
         
        sc.close();





    
    }
  

}

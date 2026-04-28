import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p , r , t , si; // principal , Rate , Time 

        System.out.print("enter principal : ");
        p = sc.nextDouble();

        System.out.print("enter the rate : ");
        r = sc.nextDouble();

        System.out.print("enter the time :");

        t = sc.nextDouble();

        si = (p * r * t )/100; // simple intrest 

        System.out.println("the simple intrest is : " + si);
        
        sc.close();
    }

}

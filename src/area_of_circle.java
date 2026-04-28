import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the radius :");

        double r = sc.nextDouble(); // r = RADIUS

        double pi = 3.14159265359;

        double area = pi * r * r; // area of the circle 

        System.out.println("the area of the circle is: " + area);
        sc.close();
    }

}

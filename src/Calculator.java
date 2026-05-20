
import java.util.Scanner; 
class calculator{
    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+ b + c;
    }
    double add(double a, double b){
        return a+b;
    }

}
class advancedcal extendes calculator{
float add(float a, float b){
    return a+b;
}
}
public class c{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    advancedcal cal = new advancedcal();

    System.out.println("enter two intergers");
    int a = sc.nextInt();
    int b = sc.nextInt(); 
    System.out.println("sum (int , int):" + cal.add(a,b));

    System.out.println("enter three interger:");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    System.out.println("sum (int , int ,int):" + cal.add(x,y,z));

    System.out.println("enter two double values:");
    double d1 = sc.nextDouble();
    double d2 = sc.nextDouble();
    System.out.println("sum(double,double):" + cal.add(d1,d2));


    System.out.println("enter two float values:");
    float f1 = sc.nextFloat();
    float f2 = sc.nextFloat();
    System.out.println("sum (float , float):" + cal.add(f1,f2));

    sc.close();


}
}
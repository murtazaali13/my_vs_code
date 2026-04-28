import java.util.Scanner;

public class prac {

public static void main(String[] args) {

    System.out.println("Bismillah,running my first java program rabbi zidini ilma");

    Scanner sc = new Scanner(System.in);

    System.out.print("enter your name :");
    String name = sc.nextLine();

    System.out.print("enter your age :");
    int age = sc.nextInt();
    

    System.out.print("enter your gpa :");
    double gpa = sc.nextDouble();
    

    System.out.print("are you a student?(true/false) :");
    boolean isStudent = sc.nextBoolean();


     System.out.println("Hello " +   name);

    System.out.println("your age is : " +  age);

    System.out.println("your gpa is : " +  gpa);



    if(isStudent){
        System.out.print("you are enrolled as a student");

    }
       else{
        System.out.println(" you are NOT enrolled");

       }
       sc.close();











}
}

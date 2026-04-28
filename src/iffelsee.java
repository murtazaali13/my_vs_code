import java.util.Scanner;

public class iffelsee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
            System.out.println("enter your name: ");
             sc.nextLine();

            System.out.println("enter your age");
            int age = sc.nextInt();

            if(age >=100){
                System.out.println("you are going to die soon !");
            }
            else if(age >=60){
                System.out.println("you are a senior");
        
            }
            
            else if(age >=18){
                System.out.println("you are an adult");
            }
            else if(age >= 0){
                System.out.println("you are a baby");

            }
            else{
                System.out.println("you are a child");
            }


        sc.close();

    }

}

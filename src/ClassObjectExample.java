import java.util.Scanner;

class Student {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter age: ");
        s1.age = sc.nextInt();

        s1.display();
        sc.close();
    }
}         
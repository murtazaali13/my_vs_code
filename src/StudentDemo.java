import java.util.Scanner;

// Student class
class Student {
    private int rollNo;
    private String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

// Demo class
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        // Creating object
        Student s1 = new Student(roll, name);

        // Display output
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());

        sc.close();
    }
}

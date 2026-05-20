import java.io.*;
import java.util.*;

class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    String fileName = "students.txt";

    // Add student
    void addStudent(int id, String name, double marks) {
        loadFromFile();
        students.add(new Student(id, name, marks));
        saveToFile();
    }

    // View students
    void viewStudents() {
        loadFromFile();

        System.out.println("\n---------------------------------------------");
        System.out.println("ID\tName\tMarks\tGrade");
        System.out.println("---------------------------------------------");

        for (Student s : students) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.marks + "\t" + s.getGrade());
        }
    }

    // Search student
    void searchStudent(int id) {
        loadFromFile();
        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Found: ID: " + s.id + " Name: " + s.name + " Marks: " + s.marks + " Grade: " + s.getGrade());
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ Student not found!");
        }
    }

    // Delete student
    void deleteStudent(int id) {
        loadFromFile();
        boolean removed = false;

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.id == id) {
                it.remove();
                removed = true;
            }
        }

        if (removed) {
            saveToFile();
            System.out.println("✅ Student deleted!");
        } else {
            System.out.println("❌ Student not found!");
        }
    }

    // Update student
    void updateStudent(int id) {
        loadFromFile();
        boolean found = false;

        Scanner sc = new Scanner(System.in);

        for (Student s : students) {
            if (s.id == id) {
                sc.nextLine(); // clear buffer
                System.out.print("Enter new name: ");
                s.name = sc.nextLine();

                System.out.print("Enter new marks: ");
                s.marks = sc.nextDouble();

                found = true;
            }
        }

        if (found) {
            saveToFile();
            System.out.println("✅ Student updated!");
        } else {
            System.out.println("❌ Student not found!");
        }
    }

    // Save to file
    void saveToFile() {
        try {
            FileWriter fw = new FileWriter(fileName);
            for (Student s : students) {
                fw.write(s.toString() + "\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }

    // Load from file
    void loadFromFile() {
        students.clear();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double marks = Double.parseDouble(data[2]);

                students.add(new Student(id, name, marks));
            }
            br.close();
        } catch (Exception e) {
            // ignore if file not found
        }
    }
}
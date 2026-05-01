// Define the CAMERA interface
interface CAMERA {
    void capture();
}

// Define the Video interface
interface Video {
    void capture();
}

// Mobile class implementing both interfaces at once
class Mobile implements CAMERA, Video {
    
    // Implementing the capture method
    @Override
    public void capture() {
        // Printing output as requested (sout)
        System.out.println("The mobile is now capturing a high-resolution image...");
        System.out.println("The mobile is also recording a 4K video clip...");
    }

    // Method to display the result/status
    public void displayResult() {
        System.out.println("Mobile functionalities are operating normally.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Create an instance of the Mobile class
        Mobile myPhone = new Mobile();

        // Execute the capture method
        myPhone.capture();

        // Display the final result
        myPhone.displayResult();
    }
}
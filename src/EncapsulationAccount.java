class Account {
    // Private variable to store the balance
    private double BALANCE;

    // Method to set the balance (Setter)
    public void setBalance(double balance) {
        this.BALANCE = balance;
    }

    // Method to get the balance (Getter)
    public double getBalance() {
        return this.BALANCE;
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("The current account balance is: " + getBalance());
    }
}

public class EncapsulationAccount {
    public static void main(String[] args) {
        // Create an instance of the Account class
        Account myAccount = new Account();

        // Set the balance using the setter method
        myAccount.setBalance(50000.75);

        // Display the balance using the display method
        myAccount.displayBalance();
    }
}
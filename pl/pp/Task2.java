package pl.pp;
public class Task2 {

    // Private fields
    private String accountNumber;
    private double balance;
    private String ownerName;
    private String email;
    private String phoneNumber;

    // Constructor
    public Task2(String accountNumber, double balance, String ownerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to credit the account
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposit of PLN %.2f was made. New balance PLN %.2f%n", amount, balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew PLN %.2f from the account, Remaining balance = PLN %.2f%n", amount, balance);
        } else if (amount > balance) {
            System.out.printf("Insufficient funds. You have PLN %.2f in your account.%n", balance);
        } else {
            System.out.println("Invalid amount. Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Task2 account = new Task2("1234567890", 1000.0, "rumeysa ceyhan", "hntrtezz0001@gmail.com", "123-456-789");

        account.withdraw(900.0);
        account.credit(250.0);
        account.withdraw(50.0);
        account.withdraw(500.0); // Should print insufficient funds
    }
}
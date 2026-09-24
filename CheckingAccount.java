import java.util.Scanner;
public class CheckingAccount {
     public double balance;
    public double interestRate = 0.01;
    public String name;


    public void deposit(int x) {
        balance += x;
    }

    public double calculateInterest() {
        double interest = balance * interestRate / 12;
        return interest;
    }

    public void withdraw(int x) {
        if (x > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= x;
        }
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}
    


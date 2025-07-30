package cba;

public class Account {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;
    private boolean isActive;
    private String city;

    public Account(int accountNumber, String firstName, String lastName, double balance, boolean isActive, String city) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.isActive = isActive;
        this.city = city;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void transfer(Account from, Account to, double amount) {
        if (amount > 0 && from.balance >= amount) {
            from.balance -= amount;
            to.balance += amount;
            System.out.println("₹" + amount + " transferred from " + from.firstName + " to " + to.firstName);
        } else {
            System.out.println("Transfer failed: insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account{" +
                "Account Number=" + accountNumber +
                ", Name=" + firstName + " " + lastName +
                ", Balance=₹" + balance +
                ", Active=" + isActive +
                ", City=" + city +
                '}';
    }
}

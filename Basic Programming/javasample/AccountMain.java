package cba;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;
        int ch;

        do {
            System.out.println("\n===== Account Menu =====");
            System.out.println("1. Create an account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter First Name: ");
                    String fname = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lname = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    System.out.print("Is Account Active (true/false): ");
                    boolean isActive = sc.nextBoolean();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();

                    account = new Account(accNo, fname, lname, bal, isActive, city);
                    System.out.println("Account created successfully:");
                    System.out.println(account);
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    double wdAmount = sc.nextDouble();
                    account.withdraw(wdAmount);
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.println("Current balance: ₹" + account.getBalance());
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (ch != 5);

        // Optional: predefined accounts for demonstration
        System.out.println("\n--- Predefined Account Operations ---");
        Account account1 = new Account(101, "Ramesh", "Sharma", 3000, true, "Mumbai");
        System.out.println(account1);

        Account account2 = new Account(102, "Amitabh", "Bachan", 5000, true, "Mumbai");
        System.out.println(account2);

        account2.withdraw(500);
        System.out.println(account2);

        System.out.println("Transfer ₹4500 from Amitabh to Ramesh:");
        account2.transfer(account2, account1, 4500);

        System.out.println(account1);
        System.out.println(account2);
    }
}

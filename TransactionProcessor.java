package Banking_Project;

import java.util.Scanner;

public class TransactionProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 100.0; // starting balance

        System.out.println("Welcome to the Banking System.");
        int choice;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                balance += amount;
                Transaction t = new Transaction("deposit", amount, balance);
                System.out.println(t);

            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    Transaction t = new Transaction("withdraw", amount, balance);
                    System.out.println(t);
                } else {
                    System.out.println("Insufficient funds.");
                }

            } else if (choice == 3) {
                Transaction t = new Transaction("check balance", 0, balance);
                System.out.println(t);

            } else if (choice == 4) {
                System.out.println("Exiting system. Goodbye!");
            } else {
                System.out.println("Invalid choice, try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}

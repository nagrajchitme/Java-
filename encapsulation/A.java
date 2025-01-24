package encapsulation;


import java.util.Scanner;

class Bank {
    private double bal = 5000;
    private int pwd;

    // Constructor to initialize password if needed
    public Bank() {
        this.pwd = 1234; // Default password
    }

    // Method to deposit money
    public void deposit(double money, Scanner sc) {
        System.out.println("Enter your password:");
        int enteredPwd = sc.nextInt();
        if (enteredPwd == pwd) {
            bal += money;
            System.out.println("Deposited money: " + money);
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect password");
        }
    }

    // Method to withdraw money
    public void withdraw(double money, Scanner sc) {
        System.out.println("Enter your password:");
        int enteredPwd = sc.nextInt();
        if (enteredPwd == pwd) {
            if (bal >= money) {
                bal -= money;
                System.out.println("Withdrawn money: " + money);
                System.out.println("Total Balance: " + bal);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Incorrect password");
        }
    }

    // Method to check balance
    public void checkBal(Scanner sc) {
        System.out.println("Enter your password:");
        int enteredPwd = sc.nextInt();
        if (enteredPwd == pwd) {
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect password");
        }
    }
}

public class A {
    public static void main(String[] args) {
        Bank bank = new Bank(); // Create an instance of the Bank class
        Scanner sc = new Scanner(System.in);
        int ch;

        // Menu options
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.print("Enter your choice: ");
        ch = sc.nextInt();

        // Switch statement for the user's choice
        switch (ch) {
            case 1:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = sc.nextDouble();
                bank.deposit(depositAmount, sc);
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                bank.withdraw(withdrawAmount, sc);
                break;
            case 3:
                bank.checkBal(sc);
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}


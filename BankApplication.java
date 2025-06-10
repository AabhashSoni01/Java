import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    private String type; // "deposit" or "withdrawal"
    private double amount;
    private String date;

    public Transaction(String type, double amount, String date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}

class Account {
    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    ArrayList<Transaction> transactions = new ArrayList<>();

    public void deposit(double amount, String date) {
        balance += amount;
        transactions.add(new Transaction("deposit", amount, date));
    }

    public void withdraw(double amount, String date) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("withdrawal", amount, date));
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class BankApplication {

    public static void main(String[] args) {
        System.out.println("Welcome ");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank Application!");
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        Account account = new Account(name, 0, initialDeposit);
        System.out.println("Account created successfully!");
        System.out.println("Account Holder: " + account.getName());
        System.out.println("Initial Balance: $" + account.getBalance());
        System.out.println("Account Number: " + account.getAccountNumber());

        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account.deposit(depositAmount, "2024-12-01"); // Example date
                    System.out.println("Deposit successful! New balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account.withdraw(withdrawalAmount, "2024-12-01"); // Example date
                    System.out.println("Withdrawal successful! New balance: $" + account.getBalance());
                    break;
                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the application. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
        System.out.println("Goodbye!");
    }
}
class Bank {
    int totalBalance = 1000;

    public synchronized void withdraw(int amount) {
        if (totalBalance >= amount) {
            System.out.println("Withdrawal of " + amount + " is in progress...");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            totalBalance -= amount;
            System.out.println("Withdrawal complete. Remaining balance: " + totalBalance);
        } else {
            System.out.println("Insufficient balance for " + amount);
        }
    }
}

class Withdrawal extends Thread {
    private int amount;
    private Bank bank;

    public Withdrawal(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(amount);
    }
}

public class Multithreading3 {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Withdrawal obj1 = new Withdrawal(bank, 800);
        Withdrawal obj2 = new Withdrawal(bank, 500);
        obj1.start();
        obj2.start();
    }
}

package JOURNAL;

class BankAccount {
    private double balance = 1000.0;

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + " | Current Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tracking Insufficient Funds for withdrawal.");
        }
    }
}

public class MultiThreadBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.deposit(500), "Depositor-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Withdrawer-1");
        Thread t3 = new Thread(() -> account.withdraw(400), "Withdrawer-2");

        t1.start();
        t2.start();
        t3.start();
    }
}

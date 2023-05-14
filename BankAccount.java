public class BankAccount {
    private double balance;

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

public class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        int numDeposits = 3;
        int numWithdrawals = 2;
        double depositAmount = 100.0;
        double withdrawalAmount = 50.0;

        // Create and start multiple DepositThread instances
        for (int i = 0; i < numDeposits; i++) {
            DepositThread depositThread = new DepositThread(account, depositAmount);
            depositThread.start();
        }

        // Create and start multiple WithdrawThread instances
        for (int i = 0; i < numWithdrawals; i++) {
            WithdrawThread withdrawThread = new WithdrawThread(account, withdrawalAmount);
            withdrawThread.start();
        }

        // Wait for all threads to finish
        Thread.sleep(1000);

        // Print the final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}

import java.util.logging.Logger;
import java.util.logging.Level;

class BankAccount {
    private static final Logger logger = Logger.getLogger(BankAccount.class.getName());
    private int balance = 1000;  // Initial balance

    // Deposit Method
    synchronized void deposit(int amount) {
        logger.info("Depositing: " + amount);
        balance += amount;
        logger.info("Balance after deposit: " + balance);
        notify();  // Notify waiting thread
    }

    // Withdraw Method
    synchronized void withdraw(int amount) {
        logger.info("Attempting to withdraw: " + amount);
        while (balance < amount) {
            logger.warning("Insufficient balance! Waiting for deposit...");
            try {
                wait();  // Wait for deposit
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "Thread interrupted while waiting", e);
            }
        }
        balance -= amount;
        logger.info("Withdrawal successful. Remaining balance: " + balance);
    }
}

class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(2000);  // Depositing amount
    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(1500);  // Withdrawing amount
    }
}

public class AtmSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        WithdrawThread withdrawThread = new WithdrawThread(account);
        DepositThread depositThread = new DepositThread(account);

        withdrawThread.start();
        depositThread.start();
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance >= 0 ? initialBalance : 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder + " | Balance: $" + balance);
    }
}

public class BankEncapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Zain", 1000.0);
        acc.displayBalance();
        acc.deposit(500.0);
        acc.withdraw(300.0);
        acc.displayBalance();
    }
}
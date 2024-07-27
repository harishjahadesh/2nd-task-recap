package account;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayBalance();

        Account acc2 = new Account(1000);
        acc2.deposit(300);
        acc2.withdraw(500);
        acc2.displayBalance();
    }
}

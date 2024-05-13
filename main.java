
public class Account {
    private double balance;

    // Constructor with no arguments
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

//main
public class Main {
    public static void main(String[] args) {
        // Create an Account object using the constructor with no arguments
        Account account1 = new Account();
        System.out.println("Initial Balance: " + account1.getBalance());

        account1.deposit(100.0);
        System.out.println("New Balance after Deposit: " + account1.getBalance());

        account1.withdraw(50.0);
        System.out.println("New Balance after Withdrawal: " + account1.getBalance());

        // Create an Account object using the constructor with two arguments
        Account account2 = new Account(500.0);
        System.out.println("Initial Balance: " + account2.getBalance());

        account2.deposit(200.0);
        System.out.println("New Balance after Deposit: " + account2.getBalance());

        account2.withdraw(1000.0);
        System.out.println("New Balance after Withdrawal: " + account2.getBalance());
    }
}

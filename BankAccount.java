public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds for this withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial Balance: " + account.getBalance()); // Expected: 1000.0

        
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance()); // Expected: 1500.0

        
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance()); // Expected: 1300.0

        
        account.withdraw(2000.0);
        System.out.println("Balance after overdraw attempt: " + account.getBalance()); // Expected: 1300.0

        
        account.deposit(-500.0);
        System.out.println("Balance after negative deposit attempt: " + account.getBalance()); // Expected: 1300.0
    }
}

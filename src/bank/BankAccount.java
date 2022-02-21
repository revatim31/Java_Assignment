package bank;

public class BankAccount {

    private double balance;
    private int accountNumber;

  
    public BankAccount(double initialBalance, int accountNumber) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Accounts with a negative balance cannot be created!");
        }
        
        // number isn't 5 digits.
        balance = initialBalance;
        this.accountNumber = accountNumber;
        
    }

   
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Don't deposit negative amounts!");
        }
        balance = balance + amount;
    }

  
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Don't withdraw a negative amount!");
        }
        balance = balance - amount;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public int getAccountNumber() {
        return accountNumber;
    }

   
    public String toString () {
        return "" + accountNumber + " " + balance;
    }
}
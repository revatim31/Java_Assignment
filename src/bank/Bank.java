package bank;


public class Bank {
    
    
    private BankAccount[] accounts;

   
    private int firstAvailableAcc;

   
    public Bank(int numAccounts) {
        this.accounts = new BankAccount[numAccounts];
        this.firstAvailableAcc = 0;
    }

    
    public void add(BankAccount account) {
        if (firstAvailableAcc == accounts.length) {
            System.out.println("Bank is full. No account added.");
            return;
        }
        this.accounts[firstAvailableAcc] = account;
        firstAvailableAcc++;
    }

  
    
    public BankAccount find(int acctNumber) {
        for (int i = 0; i < firstAvailableAcc; i++) {
            if (accounts[i].getAccountNumber() == acctNumber) {
                return accounts[i];
            }
        }

        return null;
    }

    
    public String toString() {
        if (firstAvailableAcc == 0) return "NONE";
        
        String result = "";
        for (int i = 0; i < firstAvailableAcc; i++) {
            result += accounts[i].getAccountNumber() + " ";
            result += accounts[i].getBalance() + "\n"; 
        }

        return result;
    }
}
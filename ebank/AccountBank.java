package ebank;

public class AccountBank {
    private String accountNumber;
    private String AccountHolderName;
    private double balance;

    public AccountBank(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        AccountHolderName = accountHolderName;
        this.balance = 0;
    }

    public AccountBank() {

    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Invalid amount.");
            return;
        }
        this.balance += amount;
        System.out.println("Transfer successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("Invalid amount.");
            return;
        }
        if (amount > this.balance) {
            System.err.println("Not enough money.");
            return;
        }
        this.balance -= amount;
        System.out.println("Transfer successful.");
    }

    public void transfer(String destinationAccountNumber, double amount){
        //Main.accountBanks
        if (amount <= 0) {
            System.err.println("Invalid amount.");
        }
        if (amount > this.balance) {
            System.err.println("Not enough money.");
        }
        int destinationAccountIndex = -1;
        for (int i = 0; i < Main.accountBanks.size(); i++){
            AccountBank accountBank = Main.accountBanks.get(i);
            if (accountBank.getAccountNumber().equals(destinationAccountNumber)){
                destinationAccountIndex = i;
            }
        }
        if(destinationAccountIndex == -1){
            System.err.println("Destination account does not exist.");
            return;
        }
        //validated,process
        this.balance -= amount;
        AccountBank destinationAccount = Main.accountBanks.get(destinationAccountIndex);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        System.out.println("Transfer successful.");
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.AccountHolderName);
        System.out.println("Balance: " + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

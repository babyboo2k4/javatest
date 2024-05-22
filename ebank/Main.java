package ebank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<AccountBank> accountBanks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the eBank! ");
        System.out.println("Please enter your account number");
        String accountNumber = scanner.nextLine();
        System.out.println("Please enter your account holder name");
        String accountHolderName = scanner.nextLine();
        System.out.println("Please enter your account balance");
        double accountBalance = scanner.nextDouble();
        scanner.nextLine();
        AccountBank accountBank = new AccountBank();
        accountBank.setBalance(accountBalance);
        accountBank.setAccountNumber(accountNumber);
        accountBank.setAccountHolderName(accountHolderName);
        System.out.println("Your account number is: " + accountBank.getBalance());
        System.out.println("Test deposit method.");
        System.out.println("--------------------------");
        System.out.println("Please enter deposit amount");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Your deposit amount is: " + depositAmount);
        accountBank.deposit(depositAmount);
        System.out.println("Your account bance after deposit is:" + accountBank.getBalance());
        System.out.println("---------------------------");
        System.out.println("Test withdraw method.");
        System.out.println("--------------------------");
        System.out.println("Please enter withdraw amount");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Withdraw amount is: " + withdrawAmount);
        accountBank.deposit(withdrawAmount);
        System.out.println("Your account balance after withdraw is:" + accountBank.getBalance());
        System.out.println("---------------------------");
        System.out.println("Test transfer method.");
        System.out.println("---------------------------");
        AccountBank destinationAccountBank = new AccountBank();
        destinationAccountBank.setAccountHolderName("Le Bo");
        destinationAccountBank.setBalance(10000);
        accountBanks.add(destinationAccountBank);
        accountBanks.add(accountBank);
        System.out.println("Destination Account");
        destinationAccountBank.displayAccountInfo();
        System.out.println("Please enter transfer amount");
        double transferAmount = scanner.nextDouble();
        scanner.nextLine();
        accountBank.transfer("013", transferAmount);
        System.out.println("After transfer method.");
        System.out.println("My account");
        accountBank.displayAccountInfo();
        System.out.println("Destination Account");
        accountBank.displayAccountInfo();
    }
}

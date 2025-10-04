package Inheritance;

public class CheckingBankAccount extends BankAccount {
    // Constructor
    public CheckingBankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, ACCOUNT_TYPE_CHECKING, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        // Implement deposit logic specific to CheckingAccount
        System.out.println("Depositing " + amount + " to Checking Account");
    }

    @Override
    public void withdraw(double amount) {
        // Implement withdraw logic specific to CheckingAccount
        System.out.println("Withdrawing " + amount + " from Checking Account");
    }
}

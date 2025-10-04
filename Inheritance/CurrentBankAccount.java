package Inheritance;

public class CurrentBankAccount extends BankAccount {
    // Constructor
    public CurrentBankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, ACCOUNT_TYPE_CURRENT, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        // Implement deposit logic specific to CurrentBankAccount
        System.out.println("Depositing " + amount + " to Current Account");
    }

    @Override
    public void withdraw(double amount) {
        // Implement withdraw logic specific to CurrentBankAccount
        System.out.println("Withdrawing " + amount + " from Current Account");
    }
}

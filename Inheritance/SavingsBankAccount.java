package Inheritance;

public class SavingsBankAccount extends BankAccount {
    // Constructor
    public SavingsBankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, ACCOUNT_TYPE_SAVINGS, initialDeposit);
    }
}

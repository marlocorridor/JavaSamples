package Inheritance;

public class CurrentBankAccount extends BankAccount {
    // Constructor
    public CurrentBankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, ACCOUNT_TYPE_CURRENT, initialDeposit);
    }
}

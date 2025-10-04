package Inheritance;

public class CheckingBankAccount extends BankAccount {
    // Constructor
    public CheckingBankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, ACCOUNT_TYPE_CHECKING, initialDeposit);
    }
}

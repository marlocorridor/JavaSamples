package Inheritance;

public class Bank {
    public static void main(String[] args) {
        SavingsBankAccount savingsAccount = new SavingsBankAccount(
                "0001",
                "Josie Rizal",
                5000.00);
        CheckingBankAccount checkingAccount = new CheckingBankAccount(
                "0002",
                "John Dela Cruz",
                50000.00);
        CurrentBankAccount currentAccount = new CurrentBankAccount(
                "0003",
                "Gabriella Silang",
                1000000.00);

        BankAccount.showAccountsStatistics();
    }
}

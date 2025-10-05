package Inheritance;

public class Bank {
    public static void main(String[] args) {
        // Setup accounts
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

        System.out.println("""
                =================================
                System: Setup complete.
                =================================
                """);

        showWelcomeMessage(savingsAccount);
        // Withdraw to trigger the limit
        savingsAccount.withdraw(99999);
        checkingAccount.withdraw(99999);
        currentAccount.withdraw(99999);
        // Deposit to trigger the limit
        savingsAccount.deposit(99999);
        checkingAccount.deposit(99999);
        currentAccount.deposit(99999);
        // Check balance
        savingsAccount.checkBalance();
        checkingAccount.checkBalance();
        currentAccount.checkBalance();
        // // Withdraw within limit
        // savingsAccount.withdraw(savingsAccount.getWithdrawalLimit());
        // savingsAccount.checkBalance();
        // checkingAccount.withdraw(checkingAccount.getWithdrawalLimit());
        // checkingAccount.checkBalance();
        // currentAccount.withdraw(currentAccount.getWithdrawalLimit());
        // currentAccount.checkBalance();
        // Deposit within limit
        savingsAccount.deposit(savingsAccount.getDepositLimit());
        savingsAccount.checkBalance();
        checkingAccount.deposit(checkingAccount.getDepositLimit());
        checkingAccount.checkBalance();
        currentAccount.deposit(currentAccount.getDepositLimit());
        currentAccount.checkBalance();
        // Check balance
        // // //
        // BankAccount.showAccountsStatistics();
        // //
        // savingsAccount.closeAccount();
        // checkingAccount.closeAccount();
        // currentAccount.closeAccount();

        // // Setup for close accounts
        // System.out.println("""

        // =================================
        // System: Setting up for-close Accounts.
        // =================================
        // """);
        // SavingsBankAccount savingsAccountForClose = new SavingsBankAccount(
        // "0004",
        // "Josieline C",
        // 0.00);
        // CheckingBankAccount checkingAccountForClose = new CheckingBankAccount(
        // "0005",
        // "Johanna C",
        // 0.00);
        // CurrentBankAccount currentAccountForClose = new CurrentBankAccount(
        // "0006",
        // "Gabriel C",
        // 0.00);
        // //
        // System.out.println("""
        // =================================
        // System: Setup complete.
        // =================================
        // """);
        // //
        // BankAccount.showAccountsStatistics();
        // //
        // savingsAccountForClose.closeAccount();
        // BankAccount.showAccountsStatistics();
        // //
        // checkingAccountForClose.closeAccount();
        // BankAccount.showAccountsStatistics();
        // //
        // currentAccountForClose.closeAccount();
        // BankAccount.showAccountsStatistics();
        // //

    }

    public static void showWelcomeMessage(BankAccount bankAccount) {
        String message = String.format("Welcome, %s!", bankAccount.getAccountHolder());
        System.out.println(message);
    }

    public static void showMenu() {
        String menu = """
                ┌─────────────────────────────────┐
                │        BANKING MENU             │
                ├─────────────────────────────────┤
                │ 1. Deposit Money                │
                │ 2. Withdraw Money               │
                │ 3. Check Balance                │
                │ 4. Close Account                │
                │ 5. Exit                         │
                └─────────────────────────────────┘
                """;
        System.out.print(menu);
    }
}

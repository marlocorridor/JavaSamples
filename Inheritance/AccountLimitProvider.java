package Inheritance;

/**
 * Interface that defines constants for bank account transaction limits.
 * Classes implementing this interface must provide withdrawal and deposit
 * limits.
 */
public interface AccountLimitProvider {

    // Withdrawal limit constants - must be implemented by implementing classes
    double getWithdrawalLimit();

    // Deposit limit constants - must be implemented by implementing classes
    double getDepositLimit();

    // NOTE: `default` methods could be overriden by implementing class
    // Default method to check if withdrawal amount is within limit
    default boolean isWithdrawalWithinLimit(double amount) {
        return amount > 0 && amount <= getWithdrawalLimit();
    }

    // Default method to check if deposit amount is within limit
    default boolean isDepositWithinLimit(double amount) {
        return amount > 0 && amount <= getDepositLimit();
    }
}

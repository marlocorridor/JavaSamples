package Inheritance;

/**
 * Interface that defines constants for different types of bank transactions.
 * This provides a centralized location for transaction type definitions.
 */
public interface TransactionTypeProvider {

    // Transaction type constants (public static final by default)
    String TRANSACTION_TYPE_DEPOSIT = "DEPOSIT";
    String TRANSACTION_TYPE_WITHDRAW = "WITHDRAW";
    String TRANSACTION_TYPE_CHECK_BALANCE = "CHECK_BALANCE";
    String TRANSACTION_TYPE_TRANSFER = "TRANSFER";
    String TRANSACTION_TYPE_CLOSE_ACCOUNT = "CLOSE_ACCOUNT";
}

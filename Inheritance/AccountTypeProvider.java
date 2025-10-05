package Inheritance;

/**
 * Interface that defines constants for different types of bank accounts.
 * This provides a centralized location for account type definitions.
 */
public interface AccountTypeProvider {

    // Account type constants (public static final by default)
    String ACCOUNT_TYPE_SAVINGS = "SAVINGS";
    String ACCOUNT_TYPE_CHECKING = "CHECKING";
    String ACCOUNT_TYPE_CURRENT = "CURRENT";
    String ACCOUNT_TYPE_BUSINESS = "BUSINESS";
    String ACCOUNT_TYPE_STUDENT = "STUDENT";
    String ACCOUNT_TYPE_VIP = "VIP";
}

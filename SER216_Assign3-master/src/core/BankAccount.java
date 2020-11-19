package core;

/** Class that creates BankAccount with accountNumber, accountHolder, balance, and accountType
 * attributes. Modeled after the requirements given in Assignment 3, Step 1.
 * 
 * @author cody
 */
public class BankAccount {
	
	// attributes
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private int accountType;
	
	// Class constants
	private final int SAVINGS = 1, AWARD_SAVERS = 2, CHECKING = 3, CREDIT_CARD = 4;
	private final double SAVINGS_RATE = 0.5, AWARD_SAVINGS_RATE = 4.5, CHECKING_RATE = 1.0,
			CREDIT_CARD_RATE = 15.0;
	
	/** Default constructor that sets all instance variables to default values.
	 * 
	 */
	public BankAccount() {
		accountNumber = "none";
		accountHolder = "Unknown";
		balance = 0;
		accountType = 0;
	}
	
	/** Constructor that accepts user-entered values to set all attributes.
	 * 
	 * @param accountNumber	The String to set as the accountNumber.
	 * @param accountHolder	The String to set as the accountHolder
	 * @param balance		The number to set as the initial balance.
	 * @param accountType	The integer to specify the type of account. Refer to the 
	 * 	class constants.
	 */
	public BankAccount(String accountNumber, String accountHolder, double balance, 
			int accountType) throws IllegalArgumentException {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountType = accountType;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountHolder
	 */
	public String getAccountHolder() {
		return accountHolder;
	}

	/**
	 * @param accountHolder the accountHolder to set
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accountType
	 */
	public int getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	
	/** Returns the balance of the account after the interest has been applied based on 
	 * the result of getInterestRate.
	 * 
	 * @return	The new balance after applying interest.
	 */
	public double calculateTotalBalance() {
		double balance = this.getBalance();
		double interestRate = this.getInterestRate();
		double totalBalance = balance + (balance * interestRate/100);
		return totalBalance;
	}
	
	/** Returns the interest rate depending on the type of account. Rates are taken from
	 * the class constants.
	 * 
	 * @return	The interest rate associated with the account type.
	 */
	public double getInterestRate() {
		double interestRate;
		switch (this.getAccountType()) {
		case SAVINGS: 
			interestRate = this.SAVINGS_RATE;
			break;
		case AWARD_SAVERS:
			interestRate = this.AWARD_SAVINGS_RATE;
			break;
		case CHECKING:
			interestRate = this.CHECKING_RATE;
			break;
		case CREDIT_CARD:
			interestRate = this.CREDIT_CARD_RATE;
			break;
		default:
			interestRate = 0;
		}
		return interestRate;
	}
}

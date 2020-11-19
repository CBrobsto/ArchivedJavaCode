package test;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Test;

import core.BankAccount;

/** Performs black-box testing on BankAccount.java.
 * 
 * @author cody
 */
public class BankAccountTest {
	static BankAccount testAccount;
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		testAccount = null;
	}
		
	@Test
	public void defaultCaseGetInterestRateTest() {
		testAccount = new BankAccount();
		assertTrue(testAccount.getInterestRate() == 0);
	}
	
	@Test
	public void savingsGetInterestRateTest() {
		testAccount = new BankAccount("001", "test", 100, 1);
		assertTrue(testAccount.getInterestRate() == 0.5);
	}
	
	@Test
	public void awardSavingsGetInterestRateTest() {
		testAccount = new BankAccount("002", "test", 100, 2);
		assertTrue(testAccount.getInterestRate() == 4.5);
	}
	
	@Test
	public void checkingGetInterestRateTest() {
		testAccount = new BankAccount("003", "test", 100, 3);
		assertTrue(testAccount.getInterestRate() == 1.0);
	}
	
	@Test
	public void creditCardGetInterestRateTest() {
		testAccount = new BankAccount("004", "test", 100, 4);
		assertTrue(testAccount.getInterestRate() == 15.0);
	}

	@Test
	public void accountTypeOutOfBoundsGetInterestRateTest() {
		testAccount = new BankAccount("004", "test", 100, -1);
		assertTrue(testAccount.getInterestRate() == 0.0);
	}
	
	@Test
	public void calculateTotalBalanceTest() {
		testAccount = new BankAccount("005", "test", 100, 4);
		assertTrue(testAccount.calculateTotalBalance() == 115);
		testAccount = new BankAccount("006", "test", -100, 2);
		assertTrue(testAccount.calculateTotalBalance() == -104.5);
	}
}

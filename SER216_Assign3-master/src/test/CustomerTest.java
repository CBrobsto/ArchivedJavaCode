/**
 * 
 */
package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Test;

import core.Customer;

/** Tests Customer class
 * 
 * @author cody
 *
 */
public class CustomerTest {
	
	static Customer testCustomer = new Customer("Mr. Test Case", "12345 Sample Address",
			"SER216", "ASU", "12345-999", 0);

	@Test
	public void testDisplayAddress() {
		assertNotNull(testCustomer);
		assertTrue(testCustomer.getAge() == 0);
		System.out.println("Address:\n" + testCustomer.displayAddress()+ "\n");
		assertTrue("12345 Sample Address\nSER216, ASU\n12345-999".equals(
				testCustomer.displayAddress()));
		}
	
	@Test
	public void testDisplayAddressLabel() {
		assertNotNull(testCustomer);
		assertTrue(testCustomer.getName().equals("Mr. Test Case"));
		System.out.println("Address Label:\n" + testCustomer.displayAddressLabel()+ "\n");
		assertTrue("Mr. Test Case\n12345 Sample Address\nSER216, ASU\n12345-999".equals(
				testCustomer.displayAddressLabel()));
		}
	
	@AfterClass
	public static void tearDownAfterClass() {
		testCustomer = null;
	}
}

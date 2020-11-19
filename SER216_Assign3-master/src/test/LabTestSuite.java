package test;

import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

/** Runs BankAccountTest test case.
 * 
 * @author cody
 */
@RunWith(Suite.class)
@SuiteClasses({BankAccountTest.class, CustomerTest.class})


public class LabTestSuite {

}

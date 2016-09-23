package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
		
	
	@Test
	public void testiseven() {
		int IntTest = 1;
		MyInteger instance = new MyInteger(IntTest);
		boolean bExpectedresult = false;
		boolean bActualresult = instance.isEven();
		assertEquals("testisEven() has failed", bExpectedresult, bActualresult);
	}
	
	@Test
	public void testisodd() {
		int IntTest = 2;
		MyInteger instance = new MyInteger(IntTest);
		boolean bExpectedresult = false;
		boolean bActualresult = instance.isOdd();
		assertEquals("testisOdd() has failed", bExpectedresult, bActualresult);
	}
	
	@Test
	public void testisprime() {
		int IntTest = 8;
		MyInteger instance = new MyInteger(IntTest);
		boolean bExpectedresult = false;
		boolean bActualresult = instance.isPrime();
		assertEquals("testisEven() has failed", bExpectedresult, bActualresult);
	}
	
	static MyInteger val1 = new MyInteger(2);
	static MyInteger val2 = new MyInteger(2);
	
	@Test
	public void testequals() {
		boolean bExpectedresult = true;
		boolean bActualResult = val1.equals(val2);
		assertEquals("testequals() failed", bExpectedresult, bActualResult);
	}
}

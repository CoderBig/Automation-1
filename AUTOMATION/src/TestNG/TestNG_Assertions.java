package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {//Assertions means verification methods
//1.assertEquals
	@Test (enabled = false)
	public void TC1 () {
		Reporter.log("Running TC1", true);
		String ExpResult = "Good Morning";
		//String ActResult = "Good Morning";
		String ActResult = "Good Day";
		Assert.assertEquals(ActResult, ExpResult, "Act & Exp results are not matching");
	}
//2. assertNotEquals
	@Test (enabled = false)
	public void TC2 () {
		Reporter.log("Running TC2", true);
		String ExpResult = "Good Morning";
		String ActResult = "Good Morning";
		//String ActResult = "Good Day";
		Assert.assertNotEquals(ActResult, ExpResult, "Act & Exp results are Equal");
	}
//3. assertTrue
	@Test (enabled= false)
	public void TC3 () {
		Reporter.log("Running TC3", true);
		boolean Result = true;
		Assert.assertTrue(Result, "Result is false");
	}
//4. assertFalse
	@Test (enabled= false)
	public void TC4 () {
		Reporter.log("Running TC4", true);
		boolean Result = false;
		Assert.assertFalse(Result, "Result is True");
}
	//5.assertNotNull
	@Test (enabled=false)
	public void TC5 () {
		Reporter.log("Running TC5", true);
		String Result = "asdfg";
		Assert.assertNotNull(Result, "Result is Null");
}
	//6.assertNull
		@Test (enabled= false)
		public void TC6 () {
			Reporter.log("Running TC6", true);
			String Result = "null";
			Assert.assertNull(Result, "Result is not Null");
	}
		//7Assert.fail
		@Test 
		public void TC7 () {
			Reporter.log("Running TC7", true);
			Assert.fail();
		}
}
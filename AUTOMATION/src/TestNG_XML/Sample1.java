package TestNG_XML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
@Test
public void TC1 () { 
	Reporter.log("Running TC1");
	Assert.assertTrue(false);}
@Test
public void TC2 () { Reporter.log("Running TC1");}
@Test
public void TC3 () { Reporter.log("Running TC1");}
}

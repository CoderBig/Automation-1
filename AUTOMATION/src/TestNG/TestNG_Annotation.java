package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation {
// Annotatons used to control flow methods in the test script
@BeforeClass
public void openBrowser() {
	//open browser
}
@BeforeMethod
public void login() {
	 
}
@Test
public void verifyusername() {
	 //test case 1
}
 @Test
 public void verifypwd() {
	 // test case 2
 }
 @AfterMethod
 public void logout() {
	 
 }
 @AfterClass
 public void closeBrowser() {
	 //driver.quit();
 } 
}

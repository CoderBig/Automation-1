package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGTestClass {
@Test // marks a class or a method as a part of the test
public void test() {
	System.out.println("TestNG");// this will print msg in console
	Reporter.log("TestNG", false);// this will print msg in report
	Reporter.log("TestNG", true);// this will print msg in console as well as report
}
}

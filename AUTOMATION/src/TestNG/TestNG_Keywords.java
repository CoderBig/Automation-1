package TestNG;

import org.testng.annotations.Test;

public class TestNG_Keywords {
	//1. Invocation count- used to run test case for number of times
@Test (invocationCount=2)
public void TC1 () {
	System.out.println("Running TC1");
	}
//2. Priority-By default priority is 0 (-2,-1, 0,1,2,2) these are valid priority numbers
@Test (priority = 0)
public void TC2 () {
	System.out.println("Running TC2");		
}
//3. Enabled if we want any test case  not to run we make enabled= false
@Test (priority = 1, enabled=false)
public void TC3 () {
	System.out.println("Running TC3");
}
@Test (priority = 4)
public void TC4 () {
	System.out.println("Running TC4");
}
//4.timeOut
/*4.timeOut- if a testcase is taking much more time to execute the we make it timeout 
 * for perticular time so if it doents executed within that period automatically it 
 * will be  omitted */
@Test (priority = 3, timeOut=2000)// we want it to run within 2 sec
public void TC5 () throws InterruptedException {
	Thread.sleep(3000);// Deliberately added 3 sec to fail the timeOut
	System.out.println("Running TC5");
}
//5. dependsOnMethods{""}- if one of the testcase depends on some other test case/s 
//then we use above method if 1st case fails dependent case is skipped
@Test (priority = 3, dependsOnMethods = {"TC5"})
public void TC6 () {
	System.out.println("Running TC6");
}
@Test (priority = 0,dependsOnMethods = {"TC1", "TC2"})// as TC7 depends on 1&2 it will execute after them
public void TC7 ()
{
	System.out.println("Running TC7");
}
}
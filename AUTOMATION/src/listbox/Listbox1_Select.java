package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1_Select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	// for create new account button	
		driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
		Thread.sleep(4000);
	// STEP 1. Identify list box
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	// STEP 2.  Create an object of Select class which accepts WebElement  arguments
		Select s = new Select(day);
	// STEP 3.	Use Select class methods to select options
		// select by index 
		//s.selectByIndex(10); // selected value should be 11
		// select by value
		//s.selectByValue("12");
		//select by visible text
		s.selectByVisibleText("8");
		
		
	}

}

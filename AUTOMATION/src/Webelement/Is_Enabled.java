package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled {
	/*1.isEnabled() 
	 *2.isSelected()
	 */
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// finding whether the button is enabled and printing the result
		System.out.println(driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).isEnabled());
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(2000);
		WebElement male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		System.out.println(male.isSelected());// false
		male.click();// clicking the male radio button
		System.out.println(male.isSelected());// true
		driver.quit();
	}

}

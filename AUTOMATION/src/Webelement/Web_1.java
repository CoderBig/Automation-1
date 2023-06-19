package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_1 {
/* 1.get()
 * 2.click()
 * 3.clear()
 * 4.getText() */
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.facebook.com/");
					driver.manage().window().maximize();
					Thread.sleep(2000); 
					WebElement Unfield = driver.findElement(By.xpath("//input[@id='email']"));
					Unfield.sendKeys("abc@gmail.com");
					Thread.sleep(2000); 
					Unfield.clear();
					Thread.sleep(2000);
					driver.findElement(By.id("pass")).sendKeys("12345678");
					Thread.sleep(2000);
					//driver.findElement(By.xpath("//button[text()='Log in']")).click();
					// getting text of the link in output
					System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).getText());
					driver.quit();
	}

}

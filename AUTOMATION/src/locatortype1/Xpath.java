package locatortype1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
//1. Xpath by Attribute
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Username");
driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("password");
//2. xpath by text
//driver.findElement(By.xpath("//button[text()='Log in']")).click();
//3. XPATH by contains (for forgot password button)
 //driver.findElement(By.xpath("//a[contains(text(),password)]")).click();
// 4. XPATH by Index (For create new account) there are 
// 4 options with  text //a[contains(text(),'Create ')] but we want to perform action only
// on first option so we index it as   (//a[contains(text(),'Create ')])[1]
 driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
	}

}

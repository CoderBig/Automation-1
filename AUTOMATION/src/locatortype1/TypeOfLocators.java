package locatortype1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("E:\\manual testing\\ST\\aUTOMATION\\Selenium\\html\\for checking locators.html");
Thread.sleep(2000);
// 1. BY TAG NAME (anything after "<" sign is TAGNAME)
driver.findElement(By.tagName("input")).sendKeys("abc@123");
Thread.sleep(2000);
/* 2. BY ID ( we have same tagname for password also so we can 
not use it again hence using ID now*/
// ID IS USED IN DOUBLE QUOTES
driver.findElement(By.id("pass")).sendKeys("abc@123#");
Thread.sleep(2000);
//3. BY CLASS NAME
driver.findElement(By.className("abcd")).sendKeys("someone@gmail.com");
Thread.sleep(2000);
//4. BY NAME
driver.findElement(By.name("1234")).sendKeys("9821314567");
Thread.sleep(2000);
//5. BY LINKTEXT
//driver.findElement(By.linkText("Link1")).click();
//Thread.sleep(2000);
//6. BY PARTIAL LINKTEXT (When link text is too long)
driver.findElement(By.partialLinkText("Li")).click();

driver.quit();
	}

}

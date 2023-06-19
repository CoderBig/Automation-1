package locatortype1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//1.USERNAME		
driver.findElement(By.cssSelector("input[ type='text']")).sendKeys("someone@microsoft.com");
Thread.sleep(2000);
//2. PASSWORD
//driver.findElement(By.cssSelector("input[ type='password']")).sendKeys("mypassword");
driver.findElement(By.cssSelector("input[ data-testid='royal_pass']")).sendKeys("mypassword");	
//3. LOGIN BUTTON
Thread.sleep(2000);
driver.findElement(By.cssSelector("button[name='login']")).click();	
//FORGOT PASSWORD
driver.findElement(By.partialLinkText("<a href=\"https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgzOTE2MTg2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_login\">Forgotten password?</a>")).click();
Thread.sleep(10000);	
driver.quit();
	}

}

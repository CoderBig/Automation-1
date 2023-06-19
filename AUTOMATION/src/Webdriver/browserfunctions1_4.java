package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserfunctions1_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//1. OPEN BROWSER.
	driver.get("https://www.selenium.dev/downloads/");
//2. WAIT FOR 2 SEC.	
	Thread.sleep(2000);
//3. MAXIMIZE WINDOW	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();
//4. QUIT
	driver.quit();
	}

}

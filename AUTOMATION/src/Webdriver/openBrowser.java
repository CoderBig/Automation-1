package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//5. Maximize browser
driver.manage().window().maximize();
// 1. get()- used to open url.
driver.get("https://www.selenium.dev/downloads/");
//4.Thread.sleep(2000)- will keep the browser open for 2 sec before executing quit
Thread.sleep(2000);
driver.manage().window().minimize();
Thread.sleep(10000);
// 2. close()-This will close a single window.
//driver.close();
//3. quit()-This will close all open windows.
driver.quit();
}
}

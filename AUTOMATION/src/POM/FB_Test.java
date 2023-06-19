package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FB_Test {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions ();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		FB_Login Login = new FB_Login(driver);
		Login.setFB_LoginUserName();//setFB_LoginUserName
		Login.setFB_LoginPassword();//setFB_LoginPassword
		Login.clickFB_LoginLogin();//clickFB_LoginLogin
		Thread.sleep(2000);
		
		FB_HomePage HomePage = new FB_HomePage(driver);
		HomePage.clickFB_HomePageHomePageBtn();
		Thread.sleep(2000);
		
		FB_LogOut LogOut = new FB_LogOut(driver);
		LogOut.clickB_LogOutLogOutBtn();
		Thread.sleep(2000);
		driver.quit();

	}

}

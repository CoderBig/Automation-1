package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Github_signin SignIn = new Github_signin (driver);
		SignIn.clickGitHubSignInBtn();
		Thread.sleep(2000);
		Github_login login =new Github_login(driver);
		login.setGithubloginUsername();
		login.setGithubloginPassword();
		login.clickGithubloginBTN();
		Thread.sleep(2000);
		
		Github_home Home =new Github_home(driver);
		Home.clickGitHubHomePageSignOut();
		Thread.sleep(2000);
		Github_Signout SignOut = new Github_Signout(driver);
		SignOut.clickGitHubSignOutBtn();
		Thread.sleep(2000);
		driver.quit();
	}
	

}

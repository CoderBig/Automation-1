package locatortype1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S420396294%3A1683969172139451&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Af_xneFp1hWskLEqyiM51_j3pn3iC54DzDabsbD-L7Z6EKf0WG4-OCLHA2g8bToNYtHIcpwToPFH&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
driver.findElement(By.cssSelector("input[type='email']")).sendKeys("myusername");
Thread.sleep(2000);	
//driver.findElement(By.cssSelector("button[jsname='Cuz2Ue']")).click();
driver.findElement(By.cssSelector("span[class='VfPpkd-vQzf8d']")).click();
	}

}

package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
	"E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
// not clicking on the button even though xpath is correct because one html contains another
	driver.switchTo().frame("iframeResult");// we need to shift focus on another frame
	driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	Thread.sleep(2000);
	driver.quit();
	}

}

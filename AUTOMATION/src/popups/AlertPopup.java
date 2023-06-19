package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		//enter the cust id to be deleted
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='submit']")).click();
/*Alert Popup there is no provision of right click so we have to switch  attention 
 * of selenium to popup  using "switch to" keyword*/
Alert alt=driver.switchTo().alert();
//get text of alert in output 
System.out.println(alt.getText());
//To accept 
alt.accept();
//To reject
//alt.dismiss();
Thread.sleep(5000);
/* Second popup shows up to handle this we again have to use  switch to*/
Alert alt1= driver.switchTo().alert();
//get text of alert in output 
System.out.println(alt1.getText());
Thread.sleep(2000);
// Press ok
alt1.accept();
Thread.sleep(2000);
driver.quit();
	}

}

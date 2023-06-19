package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNdrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
//STEP1 identify elements
		WebElement source = driver.findElement(By.xpath(" (//a[@class='button button-orange'])[2]"));
		WebElement destination = driver.findElement(By.xpath("//ol[@id='amt8']/li"));
//STEP 2 create object of option class
		Actions act = new Actions(driver);
		//STEP 3 methods of action class
		//act.clickAndHold(source).moveToElement(destination).release().build().perform();
		/* When we use more than one method in a single line we have to use "BUILD METHOD" */
		act.dragAndDrop(source, destination).perform();
		Thread.sleep(2000);
		
		
	}

}
 
package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	  //STEP 1 identify element to which control has to move in this case its "more"
	    WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']")) ;
	    // we pass webelement reference to "select class"
	    //we pass webdriver reference to "ACTION class"
	    // STEP 2 create object of actions class
	    Actions act = new Actions(driver);
	    //STEP 3 move to more element
	    act.moveToElement(more).perform();
	    Thread.sleep(5000);
	    // Right click on more button
	    act.contextClick(more).perform();
	    Thread.sleep(5000);
	    //left click
	    act.click(more).perform();
	    Thread.sleep(5000);
	    driver.quit();
	    
	    

	}

}

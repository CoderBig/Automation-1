package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3_sizeoflistbox {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
		Thread.sleep(4000);
		// STEP 1. Identify list box
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		// STEP 2.  Create an object of Select class which accepts WebElement  arguments
		Select s = new Select(day);
		// let us see how many options are there in list day
		List<WebElement> alloptions = s.getOptions();
		int size = alloptions.size();
		// checking the size of list
		System.out.println(size);
		for (WebElement option : alloptions) {
			System.out.println(option.getText());
			
		}
		Thread.sleep(5000);
		driver.quit();
	}

}

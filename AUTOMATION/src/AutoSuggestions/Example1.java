package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		// define  the option on which we want to click
		String expResult = "redmi note 12 pro";
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//text path of google search option and enter text redmi to see available options
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);
		//we get list with all available options with word redmi
		List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		for(WebElement option:alloptions){
			String actResult = option.getText();
		System.out.println(option.getText());
			if(actResult.equals(expResult)) {
				option.click();
				break;
			
			
			
			}
			
		}
		Thread.sleep(2000);
		driver.quit(); 
	}

}

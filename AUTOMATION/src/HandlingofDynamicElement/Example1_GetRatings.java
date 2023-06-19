package HandlingofDynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_GetRatings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("OnePlus 11R 5G (Galactic Silver, 128 GB)  (8 GB RAM)");
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//Ratings only shows span so we identify its parent and then by relative xpath i.e. //span we co-relate it
//String rating = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[2]")).getText();
//BY COMPLETE XPATH
System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]/span[2]/span/span[1]")).getText());
//BY XPATH
//System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]/span[2]/span/span[1]")).getText());
//String rating = driver.findElement(By.xpath("(//div[@class='_3pLy-c row'])//span)[2]")).getText();
//System.out.println(rating);
Thread.sleep(2000); 
driver.quit();
	}
	
}

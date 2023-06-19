package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME_NSE {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver",
				"E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("http://rediff.com/");
/*There are number of iframes on this page to get NSE indices we have to shift focus on 
					iframe "moneyiframe" */
					driver.switchTo().frame("moneyiframe");
					String NseIndex = driver.findElement(By.id("nseindex")).getText();
					System.out.println(NseIndex);
					Thread.sleep(2000);
	}

}

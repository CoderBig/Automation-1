package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
driver.get("https://skpatro.github.io/demo/links/");
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
// Click on new window a child window will popup
driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
Thread.sleep(5000);
// get id of main page by driver.getWindowHandle(); assign it to IdofMainwindow  variable of type string
//String IdofMainwindow = driver.getWindowHandle();
// to get ids of other windows  use driver.getWindowHandles(); 
Set<String> Ids = driver.getWindowHandles();
//convert this set of strings in to array list
ArrayList<String> al = new ArrayList<String>(Ids);
//System.out.println(al.get(0)); // to get id of main page
//System.out.println(al.get(1));// to get id of child page
driver.switchTo().window(al.get(1));
driver.manage().window().maximize();
driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
Thread.sleep(2000);
driver.switchTo().window(al.get(0));

	}

}

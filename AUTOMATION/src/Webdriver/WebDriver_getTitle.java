package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_getTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.selenium.dev/downloads/");
driver.manage().window().maximize();
Thread.sleep(2000);
//************ GET ATUAL TITLE OF PAGE*****************8
String actual_title= driver.getTitle();// will get the title "Downloads | Selenium"
System.out.println(actual_title);
String expected_Title = "Downloads | Selenium";
if(expected_Title.equals(expected_Title)) 
{System.out.println("Pass");
}
else {System.out.println("Fail");}
//********************* GET CURRENT URL *********************
driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
//********************* GET CURRENT URL *********************
driver.quit();

	}

}

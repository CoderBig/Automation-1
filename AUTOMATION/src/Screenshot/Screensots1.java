package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screensots1 {

	public static void main(String[] args) throws IOException {
		System.getProperty("webdriver.chrome.driver",
				"E:\\manual testing\\ST\\aUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scr);// C:\Users\Dell\AppData\Local\Temp\screenshot5996684436495426481.png
String random = RandomString.make(4);
		File dest = new File("E:\\manual testing\\ST\\aUTOMATION\\Selenium\\Screenshots\\amazon"+random+".png");
		FileHandler.copy(scr, dest);
	}

}

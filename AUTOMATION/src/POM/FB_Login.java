package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Login {
//1. Variable Declaration
@FindBy (xpath="//input[@id='email']") private WebElement UN;
@FindBy (xpath ="//input[@id='pass']") private WebElement PWD;
@FindBy(xpath="//button[@name='login']") private WebElement Login_Btn;

//2. Variable Initialization
public FB_Login (WebDriver driver) {
	PageFactory.initElements(driver,this );
}
//3. Usage
public void setFB_LoginUserName() {
	UN.sendKeys("asdfgh");
}
public void setFB_LoginPassword() {
	PWD.sendKeys("12345678");
}
public void clickFB_LoginLogin() {
	Login_Btn.click();
}
}

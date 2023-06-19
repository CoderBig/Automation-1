package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_login {

	
		//initialization Declaration
		@FindBy(xpath="//input[@id='login_field']") private WebElement UN;
		@FindBy(xpath="//input[@id='password']") private WebElement PWD;
		@FindBy(xpath="//input[@class='btn btn-primary btn-block js-sign-in-button'] ") private WebElement loginBtn;
		
		public Github_login (WebDriver driver) {
			PageFactory.initElements(driver,this );
		}
public void setGithubloginUsername() {
	UN.sendKeys("CoderBig");
}
public void setGithubloginPassword() {
	PWD.sendKeys("Mygithub123*");
}
public void clickGithubloginBTN() {
	loginBtn.click();	
}
	}



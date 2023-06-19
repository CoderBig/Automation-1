package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_signin {
	//1. Variable Declaration
		@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SignInBtn;
	//2. Variable Initialization
		public Github_signin (WebDriver driver) {
			PageFactory.initElements(driver,this );
		}
	//3. Usage
	public void clickGitHubSignInBtn() {
		SignInBtn.click();
	}

}

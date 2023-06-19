package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_Signout {
@FindBy (xpath = "//button[contains(text(),'Sign out')]") private WebElement SignOut;
public Github_Signout (WebDriver driver) {
	PageFactory.initElements(driver,this );
}
	
public void clickGitHubSignOutBtn() {
	SignOut.click();
}
	}



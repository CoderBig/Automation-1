package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_home {

	@FindBy (xpath= "(//summary[@class='Header-link'])[2]") private WebElement SignOutBtn;
	public Github_home (WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	public void clickGitHubHomePageSignOut() {
		SignOutBtn.click();
	}
	}
 


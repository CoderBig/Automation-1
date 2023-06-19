package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_HomePage {
@FindBy (xpath= "(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]") private WebElement HomePageBtn;

public FB_HomePage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickFB_HomePageHomePageBtn () {
	HomePageBtn.click();
}
}
 
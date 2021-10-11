package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilsMethods;

public class HomePage extends UtilsMethods {
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using="Sign in")
	WebElement eleSignIn;
	
	public SignInPage clickSignIn() {
		eleSignIn.click();
		return new SignInPage();
	}
}

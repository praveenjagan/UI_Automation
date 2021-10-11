package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilsMethods;

public class SignInPage extends UtilsMethods {
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "email_create")
	WebElement eleEmailAddress;
	
	public SignInPage enterEmailAddress() {
		Random random = new Random();
		int userNumber = random.nextInt(1000);
		eleEmailAddress.sendKeys("username"+userNumber+"@yourlogo.com");
		return this;
	}

}
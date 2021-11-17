package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilsMethods;

public class MyAccountPage extends UtilsMethods {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@class='info-account']")
	WebElement eleGetMyAccount;

	public MyAccountPage getMyAccountText() {
		String getMyAccountText = eleGetMyAccount.getText();
		String expectedText = "Welcome to your account. Here you can manage all of your personal information and orders.";
		assertEquals(getMyAccountText, expectedText);
		System.out.println(getMyAccountText);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//a[@class='logout']")
	WebElement eleSignOut;

	public MyAccountPage clickSignOut() {
		eleSignOut.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "//a[@title='My Store']//img")
	WebElement eleHome;

	public HomePage clickHome() {
		eleHome.click();
		return new HomePage();
	}

}

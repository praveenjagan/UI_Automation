package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInPage;
import utils.UtilsMethods;

public class TC_001_AccountCreation extends UtilsMethods {

	@Test
	public void accountCreation() {
		extent.createTest("Account Creation");
		HomePage home = new HomePage();
		SignInPage signin = new SignInPage();
		MyAccountPage account = new MyAccountPage();
		home.clickSignIn();
		signin.enterEmailAddress().clickCreateAccount().selectTitle().enterFirstName().enterLastName().enterPassword()
				.selectDay().selectMonth().selectYear().enterAddress().enterCity().selectState().enterPostcode()
				.enterMobileNumber().enterAddressAlias().clickRegister();
		account.getMyAccountText();
		extent.flush();
	}
}

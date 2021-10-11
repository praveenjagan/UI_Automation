package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;
import utils.UtilsMethods;

public class TC_001_AccountCreation extends UtilsMethods {

	@Test
	public void accountCreation() {
		HomePage home = new HomePage();
		SignInPage signin = new SignInPage();
		home.clickSignIn();
		signin.enterEmailAddress();
	}
}

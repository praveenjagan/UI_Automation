package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;
import utils.UtilsMethods;

public class TC_002_LogIn extends UtilsMethods {

	@Test
	public void login() {
		extent.createTest("Log In");
		HomePage home = new HomePage();
		SignInPage signin = new SignInPage();
		home.clickSignIn();
		signin.enterRegEmailAddress().enterRegPassword().clickSignIn();
		extent.flush();
	}
}

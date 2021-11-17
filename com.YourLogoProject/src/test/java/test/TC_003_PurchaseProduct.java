package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInPage;
import utils.UtilsMethods;

public class TC_003_PurchaseProduct extends UtilsMethods {

	@Test(retryAnalyzer = utils.RetryAnalyzer.class)
	public void addCart() {
		extent.createTest("Add to Cart");
		HomePage home = new HomePage();
		SignInPage signin = new SignInPage();
		MyAccountPage account = new MyAccountPage();
		home.clickSignIn();
		signin.enterRegEmailAddress().enterRegPassword().clickSignIn();
		account.clickHome();
		home.clickTShirt().clickProduct().selectSize().clickAddCart().clickProceedCart().clickSummaryProceedCart()
				.clickAddressProceedCart().clickTermsServices().clickAddressProceedCart().clickPayByCheck()
				.clickAddressProceedCart().getOrderSuccessMessage();
		extent.flush();
	}
}

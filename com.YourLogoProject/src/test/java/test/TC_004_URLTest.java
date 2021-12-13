package test;

import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import pages.LinkValidation;
import utils.UtilsMethods;

public class TC_004_URLTest extends UtilsMethods {

	@Test
	public void urlTest() throws MalformedURLException, IOException {
		extent.createTest("URL Test");
		LinkValidation link = new LinkValidation();
		link.linkWomen().linkSpecials().linkNewproducts().linkBestsellers().linkOurstores().linkContactus()
				.linkTermsConditions().linkAboutus().linkSitemap().linkMyOrders().linkMyCreditSlips().linkMyAddresses()
				.linkMyPersonalInfo();
		extent.flush();
	}

}

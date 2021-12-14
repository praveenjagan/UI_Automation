package pages;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilsMethods;

public class LinkValidation extends UtilsMethods {

	public LinkValidation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Women")
	WebElement eleWomen;

	public LinkValidation linkWomen() throws MalformedURLException, IOException {
		String urlWomen = eleWomen.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlWomen);
		System.out.println("Women URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Specials")
	WebElement eleSpecials;

	public LinkValidation linkSpecials() throws MalformedURLException, IOException {
		String urlSpecials = eleSpecials.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlSpecials);
		System.out.println("Specials URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "New products")
	WebElement eleNewproducts;

	public LinkValidation linkNewproducts() throws MalformedURLException, IOException {
		String urlNewproducts = eleNewproducts.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlNewproducts);
		System.out.println("New Products URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Best sellers")
	WebElement eleBestsellers;

	public LinkValidation linkBestsellers() throws MalformedURLException, IOException {
		String urlBestsellers = eleBestsellers.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlBestsellers);
		System.out.println("Best sellers URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Our stores")
	WebElement eleOurstores;

	public LinkValidation linkOurstores() throws MalformedURLException, IOException {
		String urlOurstores = eleOurstores.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlOurstores);
		System.out.println("Our stores URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	WebElement eleContactus;

	public LinkValidation linkContactus() throws MalformedURLException, IOException {
		String urlContactus = eleContactus.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlContactus);
		System.out.println("Contact us URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Terms and conditions of use")
	WebElement eleTermsConditions;

	public LinkValidation linkTermsConditions() throws MalformedURLException, IOException {
		String urlTermsConditions = eleTermsConditions.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlTermsConditions);
		System.out.println("Terms and conditions of use URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "About us")
	WebElement eleAboutus;

	public LinkValidation linkAboutus() throws MalformedURLException, IOException {
		String urlAboutus = eleAboutus.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlAboutus);
		System.out.println("About us URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Sitemap")
	WebElement eleSitemap;

	public LinkValidation linkSitemap() throws MalformedURLException, IOException {
		String urlSitemap = eleSitemap.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlSitemap);
		System.out.println("Sitemap URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "My orders")
	WebElement eleMyOrders;

	public LinkValidation linkMyOrders() throws MalformedURLException, IOException {
		String urlMyOrders = eleMyOrders.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlMyOrders);
		System.out.println("My orders URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "My credit slips")
	WebElement eleMyCreditSlips;

	public LinkValidation linkMyCreditSlips() throws MalformedURLException, IOException {
		String urlMyCreditSlips = eleMyCreditSlips.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlMyCreditSlips);
		System.out.println("My credit slips URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "My addresses")
	WebElement eleMyAddresses;

	public LinkValidation linkMyAddresses() throws MalformedURLException, IOException {
		String urlMyAddresses = eleMyAddresses.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlMyAddresses);
		System.out.println("My addresses URL is loaded successfully");
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "My personal info")
	WebElement eleMyPersonalInfo;

	public LinkValidation linkMyPersonalInfo() throws MalformedURLException, IOException {
		String urlMyPersonalInfo = eleMyPersonalInfo.getAttribute("href");
		UtilsMethods.httpUrlConnection(urlMyPersonalInfo);
		System.out.println("My personal info URL is loaded successfully");
		return this;
	}

}

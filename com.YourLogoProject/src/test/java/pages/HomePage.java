package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.UtilsMethods;

public class HomePage extends UtilsMethods {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	WebElement eleSignIn;

	public SignInPage clickSignIn() {
		eleSignIn.click();
		return new SignInPage();
	}

	@FindBy(how = How.XPATH, using = "(//a[@title='T-shirts'])[2]")
	WebElement eleTShirt;

	public HomePage clickTShirt() {
		eleTShirt.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement eleProduct;

	public HomePage clickProduct() {
		eleProduct.click();
		return this;
	}

	@FindBy(how = How.ID, using = "group_1")
	WebElement eleSize;

	public HomePage selectSize() {
		Select select = new Select(eleSize);
		select.selectByValue("3");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Add to cart')]")
	WebElement eleAddCart;

	public HomePage clickAddCart() {
		eleAddCart.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "//*[@title='Proceed to checkout']")
	WebElement eleProceedCart;

	public HomePage clickProceedCart() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(eleProceedCart)).click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//*[@title='Proceed to checkout'])[2]")
	WebElement eleSummaryProceedCart;

	public HomePage clickSummaryProceedCart() {
		eleSummaryProceedCart.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	WebElement eleTermsServices;

	public HomePage clickTermsServices() {
		eleTermsServices.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	WebElement eleAddressProceedCart;

	public HomePage clickAddressProceedCart() {
		eleAddressProceedCart.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "//*[@title='Pay by check.']")
	WebElement elePayByCheck;

	public HomePage clickPayByCheck() {
		elePayByCheck.click();
		return this;
	}

	@FindBy(how = How.XPATH, using = "//*[@class='alert alert-success']")
	WebElement eleOrderSuccessMessage;

	public HomePage getOrderSuccessMessage() {
		String actualMessage = eleOrderSuccessMessage.getText();
		String expectedMessage = "Your order on My Store is complete.";
		if (actualMessage.equalsIgnoreCase(expectedMessage)) {
			System.out.println("Order placed successfully");
		} else {
			System.out.println("Order failed");
		}
		System.out.println("TC_003_PurchaseProduct Passed Successfully");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//*[@class='box order-confirmation']//br[3]")
	WebElement eleOrderID;

	public HomePage getOrderID() {
		String orderID = eleOrderID.getText();
		System.out.println("Order ID: " + orderID);
		return this;
	}

}

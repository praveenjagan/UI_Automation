package pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.UtilsMethods;

public class SignInPage extends UtilsMethods {
	public Select select; 
	public WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "email_create")
	WebElement eleEmailAddress;
	
	public SignInPage enterEmailAddress() {
		Random random = new Random();
		int userNumber = random.nextInt(1000);
		String emailAddress = "username"+userNumber+"@yourlogo.com";
		System.out.println("The User name is: "+emailAddress);
		eleEmailAddress.sendKeys(emailAddress);
//		eleEmailAddress.sendKeys("username143@yourlogo.com");
		return this;
	}
	
	@FindBy(how = How.ID, using ="SubmitCreate")
	WebElement eleCreateAccount;
	
	public SignInPage clickCreateAccount() {
		eleCreateAccount.click();
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
	WebElement eleTitle;
	
	public SignInPage selectTitle() {
		wait.until(ExpectedConditions.visibilityOf(eleTitle));
		eleTitle.click();
		return this;
	}
	
	@FindBy(how = How.ID, using = "customer_firstname")
	WebElement eleFirstName;
	
	public SignInPage enterFirstName() {
		eleFirstName.sendKeys("Test");
		return this;
	}
	
	@FindBy(how = How.ID, using = "customer_lastname")
	WebElement eleLastName;
	
	public SignInPage enterLastName() {
		eleLastName.sendKeys("User");
		return this;
	}
	
	@FindBy(how = How.ID, using = "passwd")
	WebElement elePassword;
	
	public SignInPage enterPassword() {
		elePassword.sendKeys("password123");
		return this;
	}
	
	@FindBy(how = How.ID, using = "days")
	WebElement eleDay;
	
	public SignInPage selectDay() {
		select = new Select(eleDay);
		select.selectByValue("27");
		return this;
	}
	
	@FindBy(how = How.ID, using = "months")
	WebElement eleMonth;
	
	public SignInPage selectMonth() {
		select = new Select(eleMonth);
		select.selectByValue("5");
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "years")
	WebElement eleYear;
	
	public SignInPage selectYear() {
		select = new Select(eleYear);
		select.selectByValue("1984");
		return this;
	}
	
	@FindBy(how = How.ID, using="address1")
	WebElement eleAddress;
	
	public SignInPage enterAddress() {
		eleAddress.sendKeys("Kolathur");
		return this;
	}
	
	@FindBy(how = How.ID, using="city")
	WebElement eleCity;
	
	public SignInPage enterCity() {
		eleCity.sendKeys("Chennai");
		eleCity.sendKeys(Keys.TAB);
		return this;
	}
	
	@FindBy(how = How.ID, using="id_state")
	WebElement eleState;
	
	public SignInPage selectState() {
		select = new Select(eleState);
		select.selectByVisibleText("Alabama");
		return this;
	}
	
	@FindBy(how = How.ID, using="postcode")
	WebElement elePostcode;
	
	public SignInPage enterPostcode() {
		elePostcode.sendKeys("75402");
		return this;
	}
	
	@FindBy(how = How.ID, using="phone_mobile")
	WebElement eleMobileNumber;
	
	public SignInPage enterMobileNumber() {
		eleMobileNumber.sendKeys("1608126799");
		return this;
	}
	
	@FindBy(how = How.ID, using="alias")
	WebElement eleAddressAlias;
	
	public SignInPage enterAddressAlias() {
		eleAddressAlias.sendKeys("Test");
		return this;
	}
	
	@FindBy(how = How.ID, using="submitAccount")
	WebElement eleRegister;
	
	public MyAccountPage clickRegister() {
		eleRegister.click();
		return new MyAccountPage();
	}
	
}
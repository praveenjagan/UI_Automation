package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UtilsMethods {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PRAVEEN/Jar/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Store";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("The Title of the Page "+actualTitle+ " is displayed Successfully");
		}
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}

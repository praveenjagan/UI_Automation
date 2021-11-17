package utils;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class UtilsMethods {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static String emailAddress;
	public Actions action;

	@BeforeTest
	public void extentReport() {
		String reportPath = System.getProperty("user.dir") + "\\reports\\TestResults.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Your Logo Automation Test Execution Report");
		reporter.config().setDocumentTitle("YOUR LOGO REPORT");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation Tester", "Praveen");
	}

	@Parameters({ "URL" })
	@BeforeMethod
	public void launchBrowser(String urlName) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/PRAVEEN/Jar/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(urlName);
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Store";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("The Title of the Page " + actualTitle + " is displayed Successfully");
		}
	}

	public static String userCreation() {
		Random random = new Random();
		int userNumber = random.nextInt(1000);
		emailAddress = "username" + userNumber + "@yourlogo.com";
		System.out.println("The User name is: " + emailAddress);
		return emailAddress;
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}

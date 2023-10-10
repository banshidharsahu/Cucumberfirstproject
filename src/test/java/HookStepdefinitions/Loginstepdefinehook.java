package HookStepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage;
import pagefactory.Loginpagefactory;

public class Loginstepdefinehook

{
	WebDriver driver;
	Loginpagefactory factory;
	HomePage home;

	@Given("user on login page")
	public void user_on_login_page() throws InterruptedException {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(1000);
	}

	@When("provide userid and password in text field")
	public void provide_userid_and_password_in_text_field()

	{
		factory = new Loginpagefactory(driver);
		factory.userId("student");
		factory.password("Password123");

	}

	@And("click on Login button")
	public void click_on_login_button()

	{
		factory.login();

	}

	@Then("user navigated to homepage successfully")
	public void user_navigated_to_homepage_successfully() {
		home = new HomePage(driver);
		home.homepageValidate();
		home.logouts();
	}

	///// SETUP METHOD FOR BROWER AND CHROME OPEN
	@Before(order = 2)
	public void setup() {

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		System.out.println("Setup runed second before senario");
	}

	@Before(order = 1)
	public void setupfirst() {
		// System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");

		/// Priviusly I have did above but now useing below as mismatch chrome vertion and driver vertion
		/// as per google they proviing one chromme vertion for testing purpose.
		/// below is the step
		System.setProperty("webdriver.chrome.driver",
				"D:/OBDX _Version/22.1.0.3.0/CucumberjavaSelenium/Driver/chromedriver.exe");
		/// below chromeOption step we used incase of test chrome used for automation testing scritpt
		ChromeOptions option = new ChromeOptions();
		option.setBinary("D:/OBDX _Version/22.1.0.3.0/CucumberjavaSelenium/testChromeBrowser/chrome.exe");

		driver = new ChromeDriver(option);
		System.out.println("Setup runed first before senario");
	}

	@After
	public void close() {
		driver.close();
	}

}

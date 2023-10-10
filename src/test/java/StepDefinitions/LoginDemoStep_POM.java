package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PagesPOM.loginpagePOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoStep_POM {
	WebDriver driver = null;
	loginpagePOM obj;

	@Given("brower got open")
	public void brower_got_open()

	{
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
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}

	@And("User open login page")
	public void user_open_login_page() throws InterruptedException

	{

		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(1000);
	}

	@When("^User entered (.*) and (.*)$")
	public void user_entered_username_and_password(String username, String password) throws InterruptedException

	{
		obj = new loginpagePOM(driver);

		obj.enterUsername(username);
		obj.enterPasssword(password);
		Thread.sleep(2000);
	}

	@And("click on login button")
	public void click_on_login_button()

	{
		obj.clicklogin();
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page()

	{

	}

}

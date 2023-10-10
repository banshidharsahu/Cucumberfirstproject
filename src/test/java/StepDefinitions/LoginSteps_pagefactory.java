package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage;
import pagefactory.Loginpagefactory;

public class LoginSteps_pagefactory

{
	WebDriver driver;

	Loginpagefactory loginpage;
	HomePage home;

	@Given("brower got opened")
	public void brower_got_opened()

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

	@And("User going to open login page")
	public void user_going_to_open_login_page() throws InterruptedException

	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(1000);
	}

	@When("^User enter (.*) and (.*)$")
	public void user_enter_username_and_password(String userid, String password)

	{
		loginpage = new Loginpagefactory(driver);

		loginpage.userId(userid);
		loginpage.password(password);

	}

	@And("click on submit button")

	public void click_on_submit_button()

	{
		loginpage.login();
	}

	@Then("user should navigate to home page")

	public void user_should_navigate_to_home_page()

	{
		home = new HomePage(driver);
		home.homepageValidate();
		home.logouts();
	}

}

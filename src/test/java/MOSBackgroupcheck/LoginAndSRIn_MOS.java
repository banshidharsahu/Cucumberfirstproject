package MOSBackgroupcheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.MoS_LoginAndHome;

public class LoginAndSRIn_MOS

{
	WebDriver driver;

	MoS_LoginAndHome mosloginhome;

	/// Bckgroup
	@Given("user in login link page and click on login link")
	public void user_in_login_link_page_and_click_on_login_link() {
		System.setProperty("webdriver.chrome.driver",
				"D:/OBDX _Version/22.1.0.3.0/CucumberjavaSelenium/Driver/chromedriver.exe");
		/// below chromeOption step we used incase of test chrome used for automation testing scritpt
		ChromeOptions option = new ChromeOptions();
		option.setBinary("D:/OBDX _Version/22.1.0.3.0/CucumberjavaSelenium/testChromeBrowser/chrome.exe");

		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("https://support.us.oracle.com/oip/faces/index.jspx");
		mosloginhome = new MoS_LoginAndHome(driver);
		mosloginhome.loginlink();

	}

	@When("user enter user id and password")
	public void user_enter_user_id_and_password() {
		mosloginhome.username("banshidhar.sahu@oracle.com");
		mosloginhome.passwords("Ba#Sa@juju10");
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		mosloginhome.signIn();
		Thread.sleep(3000);
		mosloginhome.iAgree();
		Thread.sleep(3000);
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() throws InterruptedException {
		System.out.println("I am in home page with background");
	}

	/// Scenario 1
	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		System.out.println("I am first Scenario home page");
	}

	@When("user click on sign out link")
	public void user_click_on_sign_out_link() throws InterruptedException

	{
		mosloginhome.signOut();
		Thread.sleep(2000);
		driver.quit();

	}

	/// Scenario2
	@Given("user in home page")
	public void user_in_home_page() {
		System.out.println("I am secod time scenario home page");
	}

	@When("click on Hashbord tab")
	public void user_in_Dashbord() throws InterruptedException {
		mosloginhome.dashbord();
		Thread.sleep(7000);
	}

	@Then("User Navigate to Active SR page and click")
	public void SRclick()

	{
		mosloginhome.srNo();
	}

}

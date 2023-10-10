package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch

{
	WebDriver driver;

	@Given("brower opened")
	public void brower_opened()

	{
		System.out.println("Brower successfully open");
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

	}

	@And("User on Google search page")
	public void user_on_google_search_page() throws Exception {
		System.out.println("get Google search Bar");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
	}

	@When("User entered text on serach box")
	public void user_entered_text_on_serach_box() {
		System.out.println("Entered Data successfully");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("LinkedList Data structure");

	}

	@And("hit enter")
	public void hit_enter() {
		System.out.println("Finally hit entered");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);
	}

	@Then("user navigate to search result")
	public void user_navigate_to_search_result() {
		System.out.println("Get the search result");
		driver.getPageSource().contains("Linked List Data Structure");
	}

}

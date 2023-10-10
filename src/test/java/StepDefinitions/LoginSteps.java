package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user in login page successfully");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("successfully entered user and password");
	}

	@And("clicks on ligin button")
	public void clicks_on_ligin_button() {
		System.out.println("clicked on button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("dashboard page successfully");
	}
}

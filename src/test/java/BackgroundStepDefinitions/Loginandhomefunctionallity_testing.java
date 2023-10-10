package BackgroundStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginandhomefunctionallity_testing

{
	/// URL FOR LOGIN TEST https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	/// That is background means for common login code and method
	@Given("user is on login page")
	public void user_on_login_page() throws InterruptedException

	{

	}

	@When("provide user id and password")
	public void provide_user_id_and_password()

	{

	}

	@And("click on login button")
	public void click_on_login_button()

	{

	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
	}

	/// This Scenario 1
	@When("user click on wesly tester")
	public void user_click_on_wesly_tester() {
	}

	@Then("validate Logout link is there")
	public void validate_logout_link_is_there() {
	}

	/// This is scenario 2
	@When("user click on Admin tab")
	public void user_click_on_admin_tab() {
	}

	@Then("validate Reset button is there or not")
	public void validate_reset_button_is_there_or_not() {
	}

}

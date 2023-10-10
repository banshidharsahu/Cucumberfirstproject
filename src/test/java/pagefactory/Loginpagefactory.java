package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagefactory {
	@FindBy(xpath = "//input[@ID='username']")
	WebElement txt_userid;

	@FindBy(xpath = "//input[@ID='password']")
	WebElement txt_pass;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement btn_submit;

	WebDriver driver;

	public Loginpagefactory(WebDriver driver1)

	{
		this.driver = driver1;

		/// initialise the element for that need to user initElements of pagefactory class, then only when ever this
		/// class will call any where all webelement will inisialised

		PageFactory.initElements(driver1, this); /// here we can also wtite class name .class intead of this

	}

	public void userId(String userid)

	{
		txt_userid.sendKeys(userid);

	}

	public void password(String userpass) {
		txt_pass.sendKeys(userpass);

	}

	public void login() {
		btn_submit.click();

	}

}

package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div//h1[text()='Logged In Successfully']")
	WebElement titalesname;

	@FindBy(xpath = "//div//a[text()='Log out']")
	WebElement logoutclick;

	WebDriver driver;

	public HomePage(WebDriver driver1)

	{
		this.driver = driver1;

		/// initialise the element for that need to user initElements of pagefactory class, then only when every this
		/// class will call any where all wen]belent will inisialised

		PageFactory.initElements(driver1, this); /// here we can also wtite class name .class intead of this
	}

	public void homepageValidate() {
		titalesname.isDisplayed();
	}

	public void logouts()

	{
		logoutclick.click();
	}

}

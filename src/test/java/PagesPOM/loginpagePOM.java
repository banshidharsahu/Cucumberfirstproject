package PagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpagePOM {
	public WebDriver driver;

	private By txt_username = By.xpath("//input[@ID='username']");
	private By txt_password = By.xpath("//input[@ID='password']");
	private By btn_login = By.xpath("//button[@id='submit']");

	public loginpagePOM(WebDriver driver) /// This constructer is used every time when ever any instance or oject
											/// created for this class
	/// any where
	{
		this.driver = driver;
	}

	public void enterUsername(String username)

	{

		driver.findElement(txt_username).sendKeys(username); // here you can privide hread coded data but I am providing
																// dynamic way
	}

	public void enterPasssword(String password)

	{
		driver.findElement(txt_password).sendKeys(password); // here you can privide hread coded data but I am providing
																// dynamic way
	}

	public void clicklogin()

	{
		driver.findElement(btn_login).click(); // here you can privide hread coded data but I am
												// providing
												// dynamic way
	}

	/// Also you can write all action in a single method like bellow

	// public void enterPasssword(String username, String password)
	//
	// {
	// driver.findElement(txt_username).sendKeys(username);
	// driver.findElement(txt_password).sendKeys(password);
	// driver.findElement(btn_login).click();
	// }
}

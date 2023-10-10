package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoS_LoginAndHome {
	@FindBy(xpath = "//a[@id='login']")
	WebElement link_login;

	@FindBy(xpath = "//input[@type='text']")
	WebElement txt_uname;

	@FindBy(xpath = "//input[@type='password']")
	WebElement txt_pass;
	@FindBy(xpath = "//span[text()='Sign In']")
	WebElement btn_signin;

	@FindBy(xpath = "//button[text()='I AGREE']")
	WebElement btn_Iagree;

	@FindBy(xpath = "//a[text()='Sign Out']")
	WebElement btn_signout;

	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement tab_dashbord;
	@FindBy(xpath = "//a[text()='3-33755948361']")
	WebElement link_SRno;

	WebDriver driver;

	public MoS_LoginAndHome(WebDriver driver1)

	{
		this.driver = driver1;

		/// initialise the element for that need to user initElements of pagefactory class, then only when ever this
		/// class will call any where all webelement will inisialised

		PageFactory.initElements(driver1, this); /// here we can also wtite class name .class intead of this
	}

	public void loginlink() {
		link_login.click();

	}

	public void username(String userid) {
		txt_uname.sendKeys(userid);

	}

	public void passwords(String upass) {
		txt_pass.sendKeys(upass);

	}

	public void signIn() {
		btn_signin.click();

	}

	public void iAgree() {
		btn_Iagree.click();

	}

	public void signOut() {
		btn_signout.click();

	}

	public void dashbord() {
		tab_dashbord.click();

	}

	public void srNo() {
		link_SRno.click();

	}

}

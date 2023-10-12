package JayaFrameworkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractclasses.CommonUtiltiy;

public class LoginPage extends CommonUtiltiy {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Using Page Factory
	@FindBy(id="userEmail")
	WebElement username;
	@FindBy(id="userPassword") WebElement password;
	@FindBy(id="login") WebElement loginButton;
	
	public void Homepage(String Usernamevalue, String Passwordvalue)
	{
		WaitforElementPresence(username);
		username.sendKeys(Usernamevalue);
		password.sendKeys(Passwordvalue);
		loginButton.click();
		return;
	}
	
	public void gotoPage()
	{
		driver.get("https://rahulshettyacademy.com/client");
		return;
	}
	
	
	
	

}

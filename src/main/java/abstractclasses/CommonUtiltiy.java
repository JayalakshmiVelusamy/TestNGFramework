package abstractclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtiltiy {

	WebDriver driver;
	
	public CommonUtiltiy(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public void WaitforElementPresence(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));		
		return;
	}
	
	public void Click(WebElement element)
	{
		
		return;
	}

}

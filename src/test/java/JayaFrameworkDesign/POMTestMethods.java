package JayaFrameworkDesign;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMTestMethods {

	@Test
	public void loginPage() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");	
		driver.manage().window().maximize();
		LoginPage LP = new LoginPage(driver);
		LP.LoginintoPage("jaya123@gmail.com", "Jayavelu123!@#");

	}

}

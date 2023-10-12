package JayaFrameworkDesign.TestComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeMethod;

import JayaFrameworkDesign.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public LoginPage LP;
	public WebDriver InitializeBrowser() throws IOException
	{
		Properties proper = new Properties();
		FileInputStream filevalue = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Globalvariables.properties");
		proper.load(filevalue);
		String browservalue = proper.getProperty("browser");
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	@BeforeMethod
	
	public LoginPage landonapplication(String username,String password) throws IOException
	{
		InitializeBrowser();
		LP = new LoginPage(driver);
		LP.gotoPage();
		return LP;	
	
	}
	
	@AfterGroups
	public void TearDown()
	{
		//It will close the browser after the execution of cases
		driver.close();
	}
	
	
	

}

package JayaFrameworkDesign.Test;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import JayaFrameworkDesign.LoginPage;
import JayaFrameworkDesign.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMTestMethods extends BaseTest {

	@Test
	public void loginPage() throws IOException {
		// TODO Auto-generated method stub			
		
		LP.Homepage("jaya123@gmail.com", "Jayavelu123!@#");

	}

}

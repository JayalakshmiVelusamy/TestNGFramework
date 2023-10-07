package JayaFrameworkDesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcomWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("test");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.username.sendKeys("jaya123@gmail.com");
		loginpage.password.sendKeys("Jayavelu123!@#");
		loginpage.loginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'mb-3')]")));
		List<WebElement> product = driver.findElements(By.xpath("//div[contains(@class,'mb-3')]"));
		
		
		
	}

}

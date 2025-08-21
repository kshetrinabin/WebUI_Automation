package base_setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages_pom.login_page;
import pages_pom.registration_page;

public class base_setup {
	
	protected WebDriver driver;
	private String base_url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
	protected registration_page objRegistration_page;
	protected login_page objLogin_page;
	
	@BeforeClass
	public void initial_setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		objRegistration_page = new registration_page(driver);
		objLogin_page = new login_page(driver);
		
		
	}
	
	@AfterClass
	public void driver_quit() {
		
		driver.quit();
		
	}
	

}

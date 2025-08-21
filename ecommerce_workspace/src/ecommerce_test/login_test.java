package ecommerce_test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base_setup.base_setup;
import pages_pom.login_page;

public class login_test extends base_setup {
	
	
	private String base_url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
//	login_page objLogin_page;
	
	@Test(priority = 6)
	public void navigate_LoginUrl() {
//		objLogin_page = new login_page(driver);
		driver.get(base_url);
		
	}
	
	@Test(priority = 7)
	public void invalid_email() {
//		objLogin_page = new login_page(driver);
		objLogin_page.enter_email("jahsa@gm");
		objLogin_page.enter_password("gsh@123");
		objLogin_page.click_loginBtn();
		
		String expect_msg = " Warning: No match for E-Mail Address and/or Password.";
		assertTrue(objLogin_page.getEmailError().contains(expect_msg));
		
		
	}
	
	@Test(priority = 8)
	public void invalid_password() {
//		objLogin_page = new login_page(driver);
		objLogin_page.enter_email("jahsa@gmail.com");
		objLogin_page.enter_password("gsh@1");
		objLogin_page.click_loginBtn();
		
		String expect_msg = " Warning: No match for E-Mail Address and/or Password.";
		assertTrue(objLogin_page.getPasswordError().contains(expect_msg));
		
	}
	
	public void valid_login() {
//		objLogin_page = new login_page(driver);
		objLogin_page.enter_email("jahsa@gmail.com");
		objLogin_page.enter_password("gsh@123");
		objLogin_page.click_loginBtn();
		
	}
}

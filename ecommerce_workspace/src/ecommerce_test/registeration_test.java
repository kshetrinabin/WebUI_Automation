package ecommerce_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_setup.base_setup;
import pages_pom.registration_page;

public class registeration_test extends base_setup {
	
//	registration_page objRegistration_page;
	
//	@BeforeMethod
//	public void navigate_registerPage() throws InterruptedException {
//		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
////		objRegistration_page = new registration_page(driver);
////		objRegistration_page.click_registerBtn();
//
//		
//	}
	
	@BeforeMethod
	public void empty_lname() throws InterruptedException {
//		objRegistration_page = new registration_page(driver);
		objRegistration_page.enter_firstname("ghsdg");
		objRegistration_page.enter_email("mymom777@gmail.com");
		objRegistration_page.enter_phonenumber(938289329);
		objRegistration_page.enter_password("gsh@123");
		objRegistration_page.enter_cpassword("gsh@123");
		objRegistration_page.click_radioBtn();
		objRegistration_page.click_checkBox();
		objRegistration_page.click_continueBtn();
		
		String expect_msg = "Last Name must be between 1 and 32 characters!";
		System.out.println(expect_msg);
		assertTrue(objRegistration_page.getLastnameError().contains(expect_msg));
		
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 1)
	public void invalid_email() throws InterruptedException {
//		objRegistration_page = new registration_page(driver);
		objRegistration_page.enter_firstname("ghsdg");
		objRegistration_page.enter_lname("yjsdj");
		objRegistration_page.enter_email("test456@.com");
		objRegistration_page.enter_phonenumber(938289329);
		objRegistration_page.enter_password("gsh@123");
		objRegistration_page.enter_cpassword("gsh@123");
		objRegistration_page.click_radioBtn();
		objRegistration_page.click_checkBox();
		objRegistration_page.click_continueBtn();
		
		String expect_msg = "E-Mail Address does not appear to be valid!";
		assertTrue(objRegistration_page.getEmailError().contains(expect_msg));

		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void exist_email() throws InterruptedException {
//		objRegistration_page = new registration_page(driver);
		objRegistration_page.enter_firstname("ghsdg");
		objRegistration_page.enter_lname("yjsdj");
		objRegistration_page.enter_email("kavinthapa177@gmail.com");
		objRegistration_page.enter_phonenumber(938289329);
		objRegistration_page.enter_password("gsh@123");
		objRegistration_page.enter_cpassword("gsh@123");
		objRegistration_page.click_radioBtn();
		objRegistration_page.click_checkBox();
		objRegistration_page.click_continueBtn();
		
		String expect_msg = " Warning: E-Mail Address is already registered!";
		assertTrue(objRegistration_page.getExistEmailError().contains(expect_msg));
		

		Thread.sleep(5000);
		
	}
	@Test(priority = 3)
	public void password_notmatch() throws InterruptedException {
//		objRegistration_page = new registration_page(driver);
		objRegistration_page.enter_firstname("ghsdg");
		objRegistration_page.enter_lname("yjsdj");
		objRegistration_page.enter_email("mymom777@gmail.com");
		objRegistration_page.enter_phonenumber(938289329);
		objRegistration_page.enter_password("gsh@1");
		objRegistration_page.enter_cpassword("gsh@123");
		objRegistration_page.click_radioBtn();
		objRegistration_page.click_checkBox();
		objRegistration_page.click_continueBtn();
		
		String expect_msg = "Password confirmation does not match password!";
		assertTrue(objRegistration_page.getPasswordError().contains(expect_msg));
		

		Thread.sleep(5000);
		
	}
	
	@Test(priority = 4)
	public void valid_register() {
//		objRegistration_page = new registration_page(driver);
		objRegistration_page.enter_firstname("ghsdg");
		objRegistration_page.enter_lname("yjsdj");
		objRegistration_page.enter_email("mymom777@gmail.com");
		objRegistration_page.enter_phonenumber(938289329);
		objRegistration_page.enter_password("gsh@123");
		objRegistration_page.enter_cpassword("gsh@123");
		objRegistration_page.click_radioBtn();
		objRegistration_page.click_checkBox();
		objRegistration_page.click_continueBtn();
		
		String expect_msg = "Your Account Has Been Created!";
		assertTrue(objRegistration_page.getSuccessMsg().contains(expect_msg));
		
	}
	
	@Test(priority = 5)
	public void after_successFlow() {
//		objRegistration_page = new registration_page(driver);
		objRegistration_page.clickSuccessBtn();
		objRegistration_page.click_logout();
		
		assertTrue(objRegistration_page.getLogoutMsg().contains("Account Logout"));
		objRegistration_page.clickAftCbtn();
		
		
	}
	
	

}

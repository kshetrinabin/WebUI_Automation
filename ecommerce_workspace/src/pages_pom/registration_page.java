package pages_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class registration_page {
	
	 private WebDriver driver;
	 
	 public registration_page(WebDriver driver) {
		 this.driver = driver;
	 }
	 
	 By register_btn = By.xpath("//a[@class='btn btn-primary']");
	 By first_name = By.id("input-firstname");
	 By last_name = By.id("input-lastname");
	 By email_field = By.id("input-email");
	 By telephone_field = By.xpath("//input[@name='telephone']");
	 By password_field = By.cssSelector("input#input-password");
	 By cpassword_field = By.cssSelector("input#input-confirm");
	 By radio_btn = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
	 By check_box = By.xpath("//input[@name='agree']");
	 By continue_btn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
	 
	 //------error_element-------//
	 
	 By lastname_error = By.xpath("//*[@id=\"account\"]/div[3]/div/div");
	 By email_error = By.xpath("//*[@id=\"account\"]/div[4]/div/div");
	 By password_error = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div");
	 By emailExist_error = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	 
	 // ---successmsg_text----///
	 By successMsg = By.xpath("//*[@id=\"content\"]/h1");
	 By success_continue = By.xpath("//*[@id=\"content\"]/div/div/a");
	 
	 //-------Logout_flow-------//
	 By btn = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	 
	 //---------AfterLogout-------------------------------------------------//
	 
	 By aftlogout_msg = By.xpath("//*[@id=\"content\"]/h1");
	 By cbtn_aftlogout = By.xpath("//*[@id=\"content\"]/div/div/a");
	 
	 //----------------------------------------------------------------------------------------//
	 
	 public void click_registerBtn() {
			driver.findElement(register_btn).click();
		}
	 
	 public void enter_firstname(String fname) {
		 driver.findElement(first_name).clear();
		 driver.findElement(first_name).sendKeys(fname);
		 
	 }
	 public void enter_lname(String lname) {
		 driver.findElement(last_name).clear();
		 driver.findElement(last_name).sendKeys(lname);
	 }
	 public void enter_email(String email) {
		 driver.findElement(email_field).clear();
		 driver.findElement(email_field).sendKeys(email);
	 }
	 public void enter_phonenumber(int phone) {
		 driver.findElement(telephone_field).clear();
		 driver.findElement(telephone_field).sendKeys(""+phone);
		
	}
	 public void enter_password(String password) {
		 driver.findElement(password_field).clear();
		 driver.findElement(password_field).sendKeys(password);
		
	}
	 public void enter_cpassword(String cpassword) {
		 driver.findElement(cpassword_field).clear();
		 driver.findElement(cpassword_field).sendKeys(cpassword);
		
	}
	 public void click_radioBtn() {
		 driver.findElement(radio_btn).click();
		
	}
	 public void click_checkBox() {
		 driver.findElement(check_box).click();
		
	}
	 public void click_continueBtn() {
		 driver.findElement(continue_btn).click();
		
	}
	
	public String getLastnameError() {
		return driver.findElement(lastname_error).getText();
		
	}
	public String getEmailError() {
		return driver.findElement(email_error).getText();
		
	}
	
	public String getPasswordError() {
		return driver.findElement(password_error).getText();
	}
	public String getExistEmailError() {
		return driver.findElement(emailExist_error).getText();
	}
	public String getSuccessMsg() {
		return driver.findElement(successMsg).getText();
	}
	public void clickSuccessBtn() {
		driver.findElement(success_continue).click();
		
	}
	public void click_logout() {
		
		Select logout_Btn = new Select(driver.findElement(btn));
		logout_Btn.selectByIndex(4);
	}
	
	public String getLogoutMsg() {
		return driver.findElement(aftlogout_msg).getText();
	}
	public void clickAftCbtn() {
		driver.findElement(cbtn_aftlogout).click();
	}
}


	
	

	







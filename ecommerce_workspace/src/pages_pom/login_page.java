package pages_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class login_page {
	
	WebDriver driver;
//	public String login_url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
	
	public login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-email") WebElement email_field;
	@FindBy(id = "input-password") WebElement password_field;
	@FindBy(xpath = "//input[@value='Login']") WebElement login_btn;
	
	@FindBy(xpath = "//*[@id=\"account-login\"]/div[1]") WebElement email_error;
	@FindBy(xpath = "//*[@id=\"account-login\"]/div[1]") WebElement password_error;
	
	public void enter_email(String email) {
		email_field.clear();
		email_field.sendKeys(email);
		
	}
	public void enter_password(String password) {
		password_field.clear();
		password_field.sendKeys(password);
	}
	public void click_loginBtn() {
		login_btn.click();
	}
	
	public String getEmailError() {
		return email_error.getText();
	}
	
	public String getPasswordError() {
		return password_error.getText();
	}
	

}
	





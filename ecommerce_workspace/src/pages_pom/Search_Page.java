package pages_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	
	WebDriver driver;
	
	public Search_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']") WebElement search_field;
	@FindBy(xpath = "//img[@title='iMac']") WebElement item_image;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img") WebElement rItem_image;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]/span") WebElement rItemAdd_cart;
	@FindBy(css = "button#button-cart") WebElement secondCart_btn;
	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]") WebElement cart_sucesmsg;
	@FindBy(xpath = "//span[@id='cart-total']") WebElement ctotal_Btn;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong") WebElement checkout_btn;
	
	public void Search_Item(String itename) {
		search_field.clear();
		search_field.sendKeys(itename +Keys.ENTER);
		
	}
	public void ItemCard_Click() {
		item_image.click();
		
	}
	public void RItem_Click() {
		rItem_image.click();
	}
	public void SItem_Click() {
		secondCart_btn.click();
		
	}
	public void RItemAdd_ToCart() {
		rItemAdd_cart.click();
		
	}
	public String getCart_Sucsmsg() {
		
		return cart_sucesmsg.getText();
		
	}
	
	public void CTotal_BtnClick() {
		ctotal_Btn.click();
		
	}
	public void Checkout_Item() {
		
		checkout_btn.click();
		
	}

}

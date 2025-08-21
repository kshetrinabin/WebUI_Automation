package ecommerce_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_setup.base_setup;
import pages_pom.Search_Page;

public class SearchItem_Test extends base_setup  {
	
	Search_Page objSearch_Page;
	String search_url = "https://naveenautomationlabs.com/opencart/index.php?route=common/home";
	
	@Test(priority = 9)
	public void ValidSearchItem() throws InterruptedException {
		
		objSearch_Page = new Search_Page(driver);
		driver.get(search_url);
		objSearch_Page.Search_Item("mac");
		
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 10)
	public void FisrtItem_AddToCart() {
		objSearch_Page = new Search_Page(driver);
		objSearch_Page.ItemCard_Click();
		objSearch_Page.SItem_Click();
		
		String expect_msg = "Success: You have added iMac to your shopping cart!";
		System.out.println(objSearch_Page.getCart_Sucsmsg());
		assertTrue(objSearch_Page.getCart_Sucsmsg().contains(expect_msg));
		
		
	}
	
	@Test(priority = 11)
	public void SecondItem_AddToCart() throws InterruptedException {
		objSearch_Page = new Search_Page(driver);
		objSearch_Page.RItem_Click();
		objSearch_Page.RItemAdd_ToCart();
		
		String expect_msg = "Success: You have added iMac to your shopping cart!";
		assertTrue(objSearch_Page.getCart_Sucsmsg().contains(expect_msg));
		
		System.out.println(objSearch_Page.getCart_Sucsmsg() +"\n" + expect_msg);
		
		Thread.sleep(5000);
		
	}
//	
	@AfterMethod
	public void Checkout_Item() {
		objSearch_Page = new Search_Page(driver);
		objSearch_Page.CTotal_BtnClick();
		objSearch_Page.Checkout_Item();
		
	}

}

package ECOM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ECOM.base.testbase;

public class Dashboardpage extends testbase {
	@FindBy(css="#wpbody-content > div.wrap > h1")WebElement pagetitle;
	@FindBy(id="menu-posts")WebElement postss ;
	@FindBy(linkText = "Products")WebElement productss;
	
	// initializing page objects
	public Dashboardpage() {
		PageFactory.initElements(driver, this);
	}
	
	//verifying title
	public boolean verifytitle() {
		return pagetitle.isDisplayed();
	}
	//clicking Productspage
	public Productspage clickproducts() {
		productss.click();
		return new Productspage();
	}
	}

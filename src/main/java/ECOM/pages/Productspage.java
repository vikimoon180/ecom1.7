package ECOM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ECOM.base.testbase;

public class Productspage extends testbase {
	@FindBy(css="a.wp-first-item current")WebElement allproducts;
	@FindBy(linkText = "Add New")WebElement addnw;
	@FindBy(linkText = "Categories")WebElement categoriess;
	@FindBy(linkText = "Tags")WebElement tagss;
	@FindBy(linkText = "Attributes")WebElement atributes;
	@FindBy(css="#wpbody-content > div.wrap > h1")WebElement pagetitle;
	
	//initializing page objects
	public Productspage() {
		PageFactory.initElements(driver, this);
	}
	//verifying page title
	public boolean verifypagetitle() {
		return pagetitle.isDisplayed();
	}
	//
	public Addnewproductpage clickaddnew() {
		addnw.click();
		return new Addnewproductpage();
	}

}

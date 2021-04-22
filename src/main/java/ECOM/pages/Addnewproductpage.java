package ECOM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ECOM.base.testbase;
import ECOM.util.Commonutility;

public class Addnewproductpage extends testbase {
	@FindBy(css="a.current")WebElement addnew;
	@FindBy(css="h1.wp-heading-inline")WebElement title;
	@FindBy(css="input#title")WebElement productname;
	@FindBy(xpath="/html/body")WebElement description;
	@FindBy(css="input#_regular_price")WebElement reglrprice;
	@FindBy(css="input#_sale_price")WebElement salepricee;
	@FindBy(css="a#set-post-thumbnail")WebElement setimage;
	@FindBy(css="#__wp-uploader-id-1")WebElement clickk;
	
	//initializing page objects
	public Addnewproductpage() {
		PageFactory.initElements(driver, this);
	}
	//verifying page title
		public boolean verifypagetitle() {
			return title.isDisplayed();
		}
	//clicking addnew
		public void clickaddnew() {
			addnew.click();
		}
		// entering datas in add new
		public void addnewdata() {
			productname.sendKeys("mercedes");
			description.sendKeys("its a high speed and highly safe car to drive");
			reglrprice.sendKeys("1700000");
			salepricee.sendKeys("1500000");
			setimage.click();
			Commonutility.mouseclick(clickk);
			Commonutility.upload();
			
		}
	

}

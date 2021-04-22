package ECOM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ECOM.base.testbase;

public class Homepage extends testbase {
	@FindBy(css="input#user_login") WebElement usrname;
	@FindBy(css="input#user_pass")WebElement pword;
	@FindBy(css="input#wp-submit")WebElement signin;
	@FindBy(linkText="Powered by WordPress")WebElement logo;
	
	//initilaizing page objects
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	//verifying logo
	public boolean pagelogo() {
		return logo.isDisplayed();
		
	}
	

	//login using properties data
	public Dashboardpage login(String username,String password)
	{
		usrname.sendKeys(username);
		pword.sendKeys(password);
		signin.click();
		return new Dashboardpage();
		
	}
	
	
}

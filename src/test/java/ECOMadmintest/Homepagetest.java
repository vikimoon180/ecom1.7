package ECOMadmintest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ECOM.base.testbase;
import ECOM.pages.Homepage;

public class Homepagetest extends testbase {
	Homepage homepage;
	
	public Homepagetest() {
		super();
	
	}
	@BeforeMethod
	public void setup() 
	{
		initialization();
		homepage=new Homepage();
		
	}
	@Test
	public void verifylogo() {
		boolean pagelogo=homepage.pagelogo();
		Assert.assertTrue(pagelogo);
	}
	
	@Test
	public void Logintest() {
		homepage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}

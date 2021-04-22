package ECOMadmintest;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ECOM.base.testbase;
import ECOM.pages.Dashboardpage;
import ECOM.pages.Homepage;


public class Dashboardpagetest extends testbase {
	
	Dashboardpage dashboardpage;
	Homepage homepage;
	
	public  Dashboardpagetest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new Homepage();
		dashboardpage=homepage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void verifytitle() {
		boolean titleverify=dashboardpage.verifytitle();
		Assert.assertTrue(titleverify);
		
	}
	@AfterMethod
	public void teardown(){
		driver.close();
	}
	

}

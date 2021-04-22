package ECOMadmintest;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ECOM.base.testbase;
import ECOM.pages.Addnewproductpage;
import ECOM.pages.Dashboardpage;
import ECOM.pages.Homepage;
import ECOM.pages.Productspage;

public class Addnewproductpagetest extends testbase {
	Addnewproductpage addnewproductpage;
	Dashboardpage dashboardpage;
	Homepage homepage;
	Productspage productspage;
	
	public Addnewproductpagetest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new Homepage();
		dashboardpage = homepage.login(prop.getProperty("username"), prop.getProperty("password"));
		productspage = dashboardpage.clickproducts();
		addnewproductpage=productspage.clickaddnew();
	}
	
	@Test
	public void clickaddnew() {
		addnewproductpage=productspage.clickaddnew();

	}
	@Test
	public void verifytitle() {
		
		Assert.assertTrue(addnewproductpage.verifypagetitle());
	}
	@Test
	public void addproductdetails() {
		addnewproductpage.addnewdata();
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}


}

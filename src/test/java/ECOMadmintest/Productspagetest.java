package ECOMadmintest;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ECOM.base.testbase;
import ECOM.pages.Dashboardpage;
import ECOM.pages.Homepage;
import ECOM.pages.Productspage;

public class Productspagetest extends testbase {
	Productspage productspage;
	Dashboardpage dashboardpage;
	Homepage homepage;

	public Productspagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new Homepage();
		dashboardpage = homepage.login(prop.getProperty("username"), prop.getProperty("password"));
		productspage = dashboardpage.clickproducts();

	}

	// clicking add products
	@Test
	public void clickproducts() {

		productspage = dashboardpage.clickproducts();
	}

	@Test
	public void verifytitle() {

		Assert.assertTrue(productspage.verifypagetitle());
	}

	// tear down
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}

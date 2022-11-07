package bank_demo.testCases;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

import bank_demo.pageObjects.AddCustomer;
import bank_demo.pageObjects.LoginPage;
import net.bytebuddy.utility.RandomString;

public class AddCustomerTest extends BaseClass {

	@Test
	public void AddCustomerFunc() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(Username); //username
		lp.setPwd(Password); //password
		lp.setLoginBtn();
		
		//addcustomer
		AddCustomer addC = new AddCustomer(driver);
		addC.clickAddCustomerLink();
		
		addC.setCustomerName("Test");
		addC.clickGender();
		addC.setTextArea("abc");
		addC.setCity("col");
		addC.setState("test");
		addC.setPin("root");
		addC.setMobileNo("654647");
		addC.setEmail("sample@gmail.com");
		addC.setPassword("ppp");
		addC.clickSubmit();
		
		Thread.sleep(3000);
		
		//get the page title
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res == true) {
			
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}
	
}

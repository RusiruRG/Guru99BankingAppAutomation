package bank_demo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import bank_demo.pageObjects.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void loginTest() {
		
		//login page object
		LoginPage LoginT = new LoginPage(driver);
		LoginT.setUsername(Username); //username
		LoginT.setPwd(Password); //password
		
		LoginT.setLoginBtn();
		
		//verify the login functionality
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}

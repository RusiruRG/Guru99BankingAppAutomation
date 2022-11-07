package bank_demo.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bank_demo.pageObjects.LoginPage;
import bank_demo.utilities.XLUtils;

public class LoginDDT extends BaseClass {

	@Test(dataProvider="LoginData")
	public void LoginDDT(String usrName, String pwd) {
		
		LoginPage LogP = new LoginPage(driver);
		LogP.setUsername(usrName);
		LogP.setPwd(pwd);
		LogP.setLoginBtn();
		
		if(isAlertPresent() == true) {
			
			driver.switchTo().alert().accept(); //accept the alert
			driver.switchTo().defaultContent(); // direct to the main page
			Assert.assertTrue(false);
		}
		else {
			
			Assert.assertTrue(true);
			LogP.clickLogOutBtn();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent() {
		
		try {
			
			driver.switchTo().alert();
			return true;
		}catch(NoAlertPresentException e) {
			
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException {
		
		//set the path
		String path = System.getProperty("user.div")+"src/test/java/bank_demo/testData/LoginData.xlsx";
		
		//no of rows and columns
		int rownum = XLUtils.getRowCount(path, "sheet1");
		int colnum = XLUtils.getCellCount(path, "sheet1", 1);
		
		//2d array for store rows and columns
		String loginData[][] = new String[rownum][colnum];
		
		for(int i=1;i<=rownum; i++) {
			
			for(int j=0;j<colnum;j++) {
				//loginData[i-1][j] = XLUtils.getCellData(path,"sheet1",i,j);
			}
		}
		return loginData;
	}
}

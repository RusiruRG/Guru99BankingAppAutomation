package bank_demo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//webdriver object
	WebDriver driver;
	
	//username field - login page
	By Username = By.name("uid");
	
	//password field - login page
	By Password = By.name("password");
	
	//submit  button - login page
	By submitBtn = By.name("btnLogin");
	
	//reset button - login page
	By resetBtn = By.name("btnReset");
	
	//log out button
	By logoutBtn = By.xpath("/html/body/div[3]/div/ul/li[15]/a");
	
	
	//login page constructor
	public LoginPage(WebDriver rdriver) {
		
		driver = rdriver;
	}
	
	//operations
	
	//username
	public void setUsername(String UsrName) {
		
		driver.findElement(Username).sendKeys(UsrName);
	}
	
	//password
	public void setPwd(String pwd) {
		
		driver.findElement(Password).sendKeys(pwd);
	}
	
	//login button
	public void setLoginBtn() {
		
		driver.findElement(submitBtn).click();
	}
	
	//log out button
	public void clickLogOutBtn() {
		
		driver.findElement(logoutBtn).click();
	}
}

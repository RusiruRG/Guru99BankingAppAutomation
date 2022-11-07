package bank_demo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomer {

	//webdriver
	WebDriver driver;
	
	//add new customer link
	By addNewCus = By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	
	//customer name
	By cusName = By.name("name");
	
	//gender
	By gender = By.name("rad1");
	
	//calendar
	By calendar = By.id("dob");
	
	//text area
	By textarea = By.name("addr");
	
	//city
	By city = By.name("city");
	
	//state
	By state = By.name("state");
	
	//pin number
	By pinNo = By.name("pinno");
	
	//mobile no
	By mobileNo = By.name("telephoneno");
	
	//email
	By email = By.name("emailid");
	
	//password
	By password = By.name("password");
	
	//submit button
	By submitBtn = By.name("sub");
	
	//constructor
	public AddCustomer(WebDriver d) {
		
		driver = d;
	}
	
	//operations
	
	//add customer link
	public void clickAddCustomerLink() {
		
		driver.findElement(addNewCus).click();
	}
	
	//customer name
	public void setCustomerName(String cName) {
		
		driver.findElement(cusName).sendKeys(cName);
	}
	
	//gender
	public void clickGender() {
		
		driver.findElement(gender).click();
	}
	
	//calender
	
	
	//text area
	public void setTextArea(String text) {
		
		driver.findElement(textarea).sendKeys(text);
	}
	
	//city
	public void setCity(String ct) {
		
		driver.findElement(city).sendKeys(ct);
	}
	
	//state
	public void setState(String st) {
		
		driver.findElement(state).sendKeys(st);
	}
	
	//pin
	public void setPin(String p) {
		
		driver.findElement(pinNo).sendKeys(p);
	}
	
	//mobile no
	public void setMobileNo(String mNo) {
		
		driver.findElement(mobileNo).sendKeys(mNo);
	}
	
	//email
	public void setEmail(String em) {
		
		driver.findElement(email).sendKeys(em);
	}
	
	//password
	public void setPassword(String pwd) {
		
		driver.findElement(password).sendKeys(pwd);
	}
	
	//submit
	public void clickSubmit() {
		
		driver.findElement(submitBtn).click();
	}

}

package bank_demo.testCases;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import bank_demo.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();

	public String baseURL = readConfig.getBrowseURL();
	public String Username = readConfig.getUsername();
	public String Password = readConfig.getPassword();
	public static WebDriver driver; 
	
	public static Logger log;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		
		if(br.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
	
		else if(br.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();
		}
		
		driver.get(baseURL);
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}

package bank_demo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configurations/config.properties");
		
		try {
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);
		}catch(Exception e) {
			
			System.out.println("Exception is : " + e.getMessage());
		}
	}
		
		//site name
		public String getBrowseURL() {
			
			String appUrl = pro.getProperty("baseURL");
			return appUrl;
		}
		
		//username 
		public String getUsername() {
			
			String username = pro.getProperty("Username");
			return username;
		}
		
		//password
		public String getPassword() {
			
			String password = pro.getProperty("Password");
			return password;
		}
		
		//chromepath
		public String getChromePath() {
			
			String chrome = pro.getProperty("chromepath");
			return chrome;
		}
		
		//chromepath
		public String getFirefoxPath() {
					
			String firefox = pro.getProperty("firefoxpath");
			return firefox;
		}
		
		
	}


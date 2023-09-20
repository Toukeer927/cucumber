package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseClass{
	
	@Before //Cucumber Before Hook
	public void setupDriver() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdtoukeer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
//		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	}

	@After // Cucumber After hook
	public  void quitDriver() throws Exception {
		driver.quit();
	}


}

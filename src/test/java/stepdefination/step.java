package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;
import base.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObject.objectPom;

public class step extends BaseClass{
	objectPom obj =new objectPom();
	Hooks d=new Hooks();
		@Given("^User open chrome$")
	public void user_open_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdtoukeer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d.setupDriver();
		//driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	    
	}

	@Then("^Search for Amazon$")
	public void search_for_Amazon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Amazon");
	driver.findElement(By.xpath("/html/body")).click();
		Thread.sleep(500);
	   
	}

	@Then("^user click on to login button$")
	public void user_click_on_to_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//		driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
	}

	@Given("^User click on create account$")
	public void user_click_on_create_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
	}

	@Then("^user enter username$")
	public void user_enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("ap_customer_name")).sendKeys("admin");
		driver.findElement(obj.userNameLocator).sendKeys("admin");

	}

	@Then("^user enter mobile number$")
	public void user_enter_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(obj.userMobileLocator).sendKeys("9848392019");
	}

	@Then("^user enter optional Email$")
	public void user_enter_optional_Email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(obj.userEmailLocator).sendKeys("naga121@gmail.com");
	}

	@Then("^user enter password$")
	public void user_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(obj.passwordLocator).sendKeys("Admin@123");
	}

	@Then("^user click on the continue button$")
	public void user_click_on_the_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(obj.loginButtonLocator).click();
		Thread.sleep(500);
		
		d.quitDriver();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("^User open chrome$")
//	public void user_open_chrome() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdtoukeer\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//	}
//
//	@Then("^Search for Amazon$")
//	public void search_for_Amazon() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Amazon");
//		driver.findElement(By.xpath("/html/body")).click();
//		Thread.sleep(5000);	
//	   
//	}
//
//	@Then("^user click on to login button$")
//	public void user_click_on_to_login_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//	    driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
//	   // driver.quit();
//	}
//	
//	
//	
//	
//	@Given("^User click on create account$")
//	public void user_click_on_create_account() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
//	}
//
//	@Then("^user enter username$")
//	public void user_enter_username() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(obj.userNameLocator).sendKeys("admin");
//	}
//
//	@Then("^user enter mobile number$")
//	public void user_enter_mobile_number() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(obj.userMobileLocator).sendKeys("9848392019");
//	   	}
//
//	@Then("^user enter optional Email$")
//	public void user_enter_optional_Email() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(obj.userEmailLocator).sendKeys("admin@Gmail.com");
//	}
//
//	@Then("^user enter password$")
//	public void user_enter_password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(obj.passwordLocator).sendKeys("Admin@123");
//
//	}
//
//	@Then("^user click on the continue button$")
//	public void user_click_on_the_continue_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(obj.passwordLocator).click();
//	}
//	
	
	
	
	
	
	
	
	
	
	
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdtoukeer\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//		
//	}
//	
//	
//
//	@When("^title of Login Page is Free CRM$")
//	public void title_of_Login_Page_is_Free_CRM() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//String title = driver.getTitle();
//		
//		System.out.println(title);
//		
//		Assert.assertEquals("Your store. Login", title);
//	}
//
//	@Then("^User enters username and   Password$")
//	public void user_enters_username_and_Password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
////		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
////		driver.findElement(By.id("Password")).sendKeys("admin");
//		driver.findElement(obj.userNameLocator).sendKeys("admin@yourstore.com");
//		driver.findElement(obj.passwordLocator).sendKeys("admin");
//		
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//
//	@Then("^User Clicks on Login button$")
//	public void user_Clicks_on_Login_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(obj.loginButtonLocator).submit();
//		//driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
//	}

	
	
	
	
	
	
	
	
	
	

}

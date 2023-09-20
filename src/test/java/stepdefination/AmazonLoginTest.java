package stepdefination;

import org.openqa.selenium.By;

import base.BaseClass;
import base.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.objectPom;

public class AmazonLoginTest extends BaseClass {
	
		objectPom obj =new objectPom();
		Hooks d=new Hooks();


		@Given("^Open Chrome and navigate to Login page$")
		public void open_Chrome_and_navigate_to_Login_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			d.setupDriver();
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		}

		@When("^valid \"([^\"]*)\" and \"([^\"]*)\" is entered$")
		public void valid_and_is_entered(String username, String password) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	        
			driver.findElement(By.id("ap_password")).sendKeys(password);
		}

		@Then("^User should be logged in successfully$")
		public void user_should_be_logged_in_successfully() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

		}
		
}

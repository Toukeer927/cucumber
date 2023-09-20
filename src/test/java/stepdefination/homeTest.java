package stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;
import base.Hooks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homeTest extends BaseClass  {
	Hooks d=new Hooks();
	
	
	@When("^user open Amazon$")
	public void user_open_Amazon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.setupDriver();
	  driver.get("https://amazon.in/");
	}

	@Then("^user verify logo of Amazon$")
	public void user_verify_logo_of_Amazon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag=driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("^user search for deals$")
	public void user_search_for_deals() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("deals");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("^user click on latest deal$")
	public void user_click_on_latest_deal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/a/img")).click();
	}

	
	
	
//
//@When("^user open Amazon$")
//public void user_open_Amazon() throws Throwable {
//    // Write code here that turns the phrase above into concrete actions
//	d.setupDriver();
//   driver.get("https://amazon.in/");
//}
//
//@Then("^user verify logo of Amazon$")
//public void user_verify_logo_of_Amazon() throws Throwable {
//    // Write code here that turns the phrase above into concrete actions
//	boolean flag=driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
//	Assert.assertTrue(flag);
//}
//
//@When("^user open deals$")
//public void user_open_deals() throws Throwable {
//    // Write code here that turns the phrase above into concrete actions
//	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
//}
//
//@Then("^user must be on deals page$")
//public void user_must_be_on_deals_page() throws Throwable {
//    // Write code here that turns the phrase above into concrete actions
//	String title = driver.getTitle();
//	System.out.println(title);
//		
//		String actualTitle=driver.getTitle();
//		String expectedTitle="log in or sign up";
//		
//		
//		Assert.assertEquals(actualTitle,expectedTitle);
//}

}

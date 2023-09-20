package pageObject;

import org.openqa.selenium.By;

public class objectPom {
	
	public By userNameLocator = By.id("ap_customer_name");
	public By userMobileLocator = By.xpath("//*[@id=\"ap_phone_number\"]");
	public By userEmailLocator = By.xpath("//*[@id=\"ap_email\"]");
	public By passwordLocator = By.xpath("//*[@id=\"ap_password\"]");
	public By loginButtonLocator = By.xpath("//*[@id=\"continue\"]");


}

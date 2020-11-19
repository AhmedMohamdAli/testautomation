package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageBase {

	public loginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath ="//input[@placeholder='Password']" )
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;

	
	
	public void LoginToUpm(String user,String Pass) {
		
		username.sendKeys(user);
		password.sendKeys(Pass);
		loginButton.click();
	}

}

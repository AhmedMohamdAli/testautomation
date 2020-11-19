package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.loginPage;

public class LoginPageTest extends TestBase {
	

	
	loginPage loginPageObject;
	
	
	@Test (priority = 1)
	public void adminCanLogin() {		
		loginPageObject=new loginPage(driver);
		loginPageObject.LoginToUpm("admin","12345678");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}


	}


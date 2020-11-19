package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.Dashboards;
import Pages.loginPage;

public class DashBoardsTest extends TestBase {



	Dashboards dash;
	loginPage loginPageObject;

	
	@Test (priority = 1)
	public void adminCanLogin() {		
		loginPageObject=new loginPage(driver);
		loginPageObject.LoginToUpm("admin","12345678");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}
	
	
	@Test (priority = 2)
	public void changeTheme() {
		dash=new Dashboards(driver);
		dash.switchDark();
		dash.addDashBoard();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}




}

package Tests;


import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Dashboards;
import Pages.loginPage;
import Pages.manageDashboardPage;

public class manageDashboardTest extends TestBase {


	loginPage loginPageObject;
	Dashboards dashboardObject;
	manageDashboardPage manageDBobject;


	@Test
	public void addNewDashboard() throws InterruptedException {	
		loginPageObject=new loginPage(driver);
		loginPageObject.LoginToUpm("admin", "12345678");
		dashboardObject=new Dashboards(driver);
		dashboardObject.addDashBoard();
		Thread.sleep(3000);		
		manageDBobject=new manageDashboardPage(driver);
		manageDBobject.newDashBoard("neodemo9");
		dashboardObject.findDB("neo");
		Assert.assertTrue(dashboardObject.matchedresult.getText().contains("neo"));
	}




}

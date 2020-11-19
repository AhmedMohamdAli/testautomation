package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;


	@BeforeSuite
	public void startDriver() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("http://192.168.45.36:8080/");

	}

	//@AfterSuite
	/*public void stopDriver() {
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.quit();
	}*/


}

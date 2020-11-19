package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class manageDashboardPage extends PageBase {

	public manageDashboardPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[@id='wrapper']/div[@id='page-content-wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement DashName;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submitBtn;


	public void newDashBoard(String name) {

		DashName.sendKeys(name);
		submitBtn.click();
	}
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboards extends PageBase {

	public Dashboards(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[2]/ul[2]/li[3]/div[1]/i[1]")
	public WebElement Dark;

	@FindBy(xpath = "//button[@id='addDashboard']")
	public WebElement addDash;

	@FindBy(linkText = "Dashboard")
	public WebElement dashButton;
	
	@FindBy(xpath="//body/div[@id='container']/div[@id='wrapper']/div[@id='page-content-wrapper']/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement checkDashboards;
	
	@FindBy(xpath = "//body/div[@id='container']/div[@id='wrapper']/div[@id='page-content-wrapper']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement SearchDBbox;
	
	
	@FindBy(xpath = "//mark[@class='matched-word ']")
	public WebElement matchedresult;
	
	public void switchDark() {

		Dark.click();

	}


	public void addDashBoard() {
		addDash.click();
		dashButton.click();
	}


	public void findDB(String dashname) {
		checkDashboards.click();
		SearchDBbox.sendKeys(dashname);
		SearchDBbox.click();
	}
}


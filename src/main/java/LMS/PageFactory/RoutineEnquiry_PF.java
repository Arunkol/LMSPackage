package LMS.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RoutineEnquiry_PF {
	WebDriver driver;

	@FindAll(@FindBy(how = How.XPATH, using = "//section[@class='tab']/ul[1]/li/div[@class='bg-color']/div"))
	@CacheLookup
	public List<WebElement> rowCountsForElements;
	
	@FindBy(how = How.NAME, using = "businessType")
	@CacheLookup
	public WebElement business_dropDown;
	
	@FindBy(how = How.NAME, using = "circleType")
	@CacheLookup
	public WebElement circle_dropDown;

	@FindBy(how = How.NAME, using = "taxType")
	@CacheLookup
	public WebElement tax_dropDown;
	
	@FindBy(how = How.NAME, using = "stateType")
	@CacheLookup
	public WebElement state_dropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Container']//ul[1]/li/div/div[6]//select")
	@CacheLookup
	public WebElement status_dropDown;
	
	@FindBy(how = How.NAME, using = "legislation")
	@CacheLookup
	public WebElement legislation_textBox;
	
	// Constructor is required as every page needs a base driver to find web
		// elements
		public RoutineEnquiry_PF(WebDriver driver) {
			this.driver = driver;
		}
}

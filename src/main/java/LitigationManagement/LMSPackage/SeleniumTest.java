package LitigationManagement.LMSPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import Helper.CommonMethods;
import LMS.PageFactory.RoutineEnquiry_PF;

public class SeleniumTest {
	public static void main(String args[]) {
		WebDriver driver;
		try {
			String workingDirectory = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", workingDirectory + "\\Config\\Driver\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("start-maximized");
			options.addArguments("--js-flags=--expose-gc");
			options.addArguments("--enable-precise-memory-info");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-default-apps");
			options.addArguments("--enable-automation");
			options.addArguments("test-type=browser");
			options.addArguments("disable-infobars");
			options.addArguments("disable-extensions");
			options.setExperimentalOption("useAutomationExtension", false);

			driver = new ChromeDriver(options);

			// driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// driver.manage().window().maximize();
			driver.get("http://10.31.101.105:7000");
			Thread.sleep(3000);

			driver.findElement(By.xpath("//ul[@class='sidebar-menu']//li[1]/a")).click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("//div[@class='row']//a")).click();
			Thread.sleep(3000);

			// Business

			driver.findElement(By.xpath("//*[@id='Container']//h4[1]")).click();
			Thread.sleep(1000);
			// driver.quit();
			RoutineEnquiry_PF RoutineEnquiry;
			RoutineEnquiry = PageFactory.initElements(driver, RoutineEnquiry_PF.class);
			// List<WebElement> listSize = RoutineEnquiry.rowCountsForElements;
			System.out.println(RoutineEnquiry.business_dropDown);

			CommonMethods.interactWithDropDown(RoutineEnquiry.business_dropDown);
			CommonMethods.interactWithDropDown(RoutineEnquiry.circle_dropDown);
			CommonMethods.interactWithDropDown(RoutineEnquiry.state_dropDown);
			CommonMethods.interactWithDropDown(RoutineEnquiry.tax_dropDown);
			CommonMethods.interactWithDropDown(RoutineEnquiry.status_dropDown);
			CommonMethods.passTextInTextBox(RoutineEnquiry.legislation_textBox, "test text");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

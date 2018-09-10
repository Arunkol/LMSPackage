package Helper;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public static void passTextInTextBox( WebElement txtBox, String textToBePassed){
		txtBox.sendKeys(textToBePassed);
	}
	
	public static void interactWithDropDown( WebElement business_dropDown){
		Select dropDown= new Select (business_dropDown);
		dropDown.selectByIndex(randomDropDownIndex(dropDown));
	}
	
	public static void interactWithButton( WebElement element){
		element.click();
	}
	
	public static WebElement getParentElement(WebElement ele){
		WebElement parent = ele.findElement(By.xpath(".."));
		return (parent);
	}
	
	public static String getValueFromTextBox(WebElement ele){
		String txtBoxValue= ele.getAttribute("value");
		return (txtBoxValue);
	}
	
	public static int randomDropDownIndex(Select dropDown) {
		Random rand = new Random();
		//Generating random number between 1 and max value of drop down options
		int min = 1;
		List<WebElement> items = dropDown.getOptions();
		int max = items.size();
		int Rvalue = rand.nextInt(max-min) + min;
		System.out.println("Selected Random number: "+Rvalue);
		return Rvalue;
		}
}

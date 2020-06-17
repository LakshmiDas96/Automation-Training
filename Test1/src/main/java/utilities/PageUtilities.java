package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
public class PageUtilities {
	WebDriver driver;
	
	
	public static WebElement waitForElementToBeClickable(WebDriver driver,int time,WebElement elementToBeLoaded) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded)); 
		return element;
		
	}
	
	public static WebElement visibilityOfElement(WebDriver driver,WebElement visibleElement,int Time) {
		  WebDriverWait wait=new WebDriverWait(driver, Time);
		 WebElement element= wait.until(ExpectedConditions.visibilityOf(visibleElement)); 
		 return element;
	 }

}

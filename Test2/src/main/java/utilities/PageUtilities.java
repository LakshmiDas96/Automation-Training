package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
	WebDriver driver;
	public static WebElement waitforElementTobeClickable(WebDriver driver,WebElement elementToBeLoaded,int Time) {
		WebDriverWait wait=new WebDriverWait(driver,Time);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		return element;
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class HomePage extends PageUtilities {
	WebDriver driver;
	
	   public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	@FindBy(xpath="//a[@href='//www.phptravels.net']/small[1]")
	WebElement button;
	@FindBy(xpath="//a[@title='home']")
	WebElement home;
	@FindBy(xpath="//iframe[@id='lo-cs-frame']")
	WebElement iframe;
	@FindBy(xpath="//div[@id='select2-drop-mask']//following::div[1]")
	WebElement destination;
	@FindBy(xpath="//input[@id='checkin']")
	WebElement checkIn;
	@FindBy(xpath="//input[@id='checkout']")
	WebElement checkOut;
	
	public boolean isHomeButtonDisplayed() {
		return(home.isDisplayed());
	}
	  
	
	public void clickButton() {
		PageUtilities.waitForElementToBeClickable(driver, 4, button);
		button.click();
		
	}
	
	public void selectLocation() {
		PageUtilities.visibilityOfElement(driver, destination, 6);
		//destination.click();
		
		destination.sendKeys("united-states/indian-springs");
	}
 
	public void clickDateIcon() {
		PageUtilities.visibilityOfElement(driver, checkOut , 5);
		checkIn.sendKeys("09/07/20");
		checkOut.sendKeys("15/07/20");
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobilesearch {
	
	
	@FindBy (xpath = "(//span[contains(@class,'a-size-medium a-')])[1]")
	private WebElement mobile1;
	
	public Mobilesearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonMobile1() {
		mobile1.click();
	}

}

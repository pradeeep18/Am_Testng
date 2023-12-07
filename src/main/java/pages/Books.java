package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Books {
	
	private WebDriver driver;
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[2]") 
	private WebElement advancesearch;
	
	@FindBy(xpath="//select[@name='field-dateyear']")
	private WebElement dateYear;
	
	@FindBy (xpath="//select[@name='field-dateop']")
	private WebElement dateField;

	@FindBy (xpath="//select[@name='field-datemod']")
	private WebElement dateMonth;
	
	@FindBy (xpath="//input[@name='Adv-Srch-Books-Submit']")
	private WebElement searchbutton;
	
	
	public Books(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnAdvanceSearch() {
		advancesearch.click();
	}
	
	public void selectDateField() {
		Select sel= new Select(dateField);
		sel.selectByVisibleText("After");
	}
	
	public void selectDateYear() {
		Select sel= new Select(dateYear);
		sel.selectByVisibleText("2015");
	}
	
	public void selectDateMonth() {
		Select sel= new Select(dateMonth);
		sel.selectByVisibleText("9");
	}
	public void clickOnSearchButton() {
		searchbutton.click();
	}
}

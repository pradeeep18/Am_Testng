package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderAndFooter {
	
	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement searchbox;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement search;
	
	@FindBy (xpath="//span[@class='icp-nav-link-inner']")
	private WebElement language;
	
	@FindBy (xpath="(//i[@class='icp-radio'])[7]") 
	private WebElement marathi;
	
	@FindBy (xpath="//a[@id='nav-hamburger-menu']")
	private WebElement all;
	
	@FindBy (xpath="(//a[@tabindex='0'])[5]")
	private WebElement bestseller;
	
	@FindBy (xpath="(//a[@tabindex='0'])[6]")
	private WebElement mobile;
	
	@FindBy (xpath="//a[text()='Books'] ")
	private WebElement book;
	
	@FindBy (xpath="(//a[@tabindex='0'])[8]")
	private WebElement customerservice;
	
	@FindBy (xpath="(//a[@tabindex='0'])[9]")
	private WebElement todaysdeal;
	
	@FindBy (xpath="(//a[@tabindex='0'])[10]")
	private WebElement electronics;
	
	@FindBy (xpath="(//a[@tabindex='0'])[11]")
	private WebElement fashion;
	
	@FindBy (xpath="(//a[@tabindex='0'])[12]")
	private WebElement prime;
	
	@FindBy (xpath="(//a[@tabindex='0'])[13]")
	private WebElement newreleases;
	
	public HeaderAndFooter(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driver,10);
	}
	
	public void changeLanguage() {
		act.moveToElement(language).perform();
	}
	
	public void selectMarathi() {
		act.moveToElement(marathi).click().build().perform();
	}
	
	public void sendSearchbox() {
		wait.until(ExpectedConditions.visibilityOf(mobile));
		searchbox.sendKeys("mobile");
	}
	
	public void clickOnSearchButton() {
	search.click();
	}
	
	public void clickonAll() {
		wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(all));
		all.click();
	}
	
	public void clickonBestsellers() {
		bestseller.click();
	}
	
	public void clickonMobile() {
		mobile.click();
	}
	
	public void clickonBook() {
		book.click();
	}
	
	public void clickonCustomerSerivce() {
		customerservice.click();
	}
	
	public void clickonTodaysdeal() {
		todaysdeal.click();
	}
	
	public void clickonElectronics() {
		electronics.click();
	}
	
	public void clickonFashion() {
		fashion.click();
	}
	
	public void clickonPrime() {
		prime.click();
	}
	
	public void clickonNewreleases() {
		newreleases.click();
	}	
}

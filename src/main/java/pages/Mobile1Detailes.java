package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobile1Detailes {
	
	
	
	@FindBy (xpath="//p[text()='8GB RAM + 128GB Storage']")
	private WebElement storage1;
	
	@FindBy (xpath="//p[text()='8GB RAM + 256GB Storage']")
	private WebElement storage2;
	
	@FindBy (xpath="(//img[@class='imgSwatch'])[1]")
	private WebElement borapurple;
	
	@FindBy (xpath="(//img[@class='imgSwatch'])[2]")
	private WebElement graphite;

	@FindBy (xpath="(//img[@class='imgSwatch'])[3]")
	private WebElement pink;
	
	@FindBy (xpath="//select[@name='quantity']")
	private WebElement qty;
	
	@FindBy (xpath="(//div[@id='buyBoxAccordion']//i)[1]")
	private WebElement withExchange;
	
	@FindBy (xpath="(//i[contains(@class,'a-icon a-accordion-radio a-icon-')])[2]")
	private WebElement withoutExchange;
	
	public Mobile1Detailes(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Storage8and128() {
		boolean result=storage1.isSelected();
		System.out.println(result);
	}
	public boolean withExchangeIsSelected() {
		boolean result=withExchange.isSelected();
		return result;
	}
	public boolean clickWithExchange() throws InterruptedException {
		withExchange.click();
		Thread.sleep(2000);
		boolean result=withExchange.isSelected();
		return result;
	}
	
	public boolean withoutExchangeIsSelected() {
		boolean result=withoutExchange.isSelected();
		return result;
	}

}

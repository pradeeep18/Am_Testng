package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HeaderAndFooter;
import pages.Mobile1Detailes;
import pages.Mobilesearch;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\seleiunm\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		driver.get("https://www.amazon.in/");
		
		HeaderAndFooter headerAndFooter=new HeaderAndFooter(driver);
		Mobilesearch mobilesearch= new Mobilesearch(driver);
		headerAndFooter.changeLanguage();
		headerAndFooter.selectMarathi();
		
		headerAndFooter.clickonAll();	
		headerAndFooter.clickonBestsellers();
		
		
		headerAndFooter.sendSearchbox();
		headerAndFooter.clickOnSearchButton();
		mobilesearch.clickonMobile1();
		
		
		ArrayList<String> add= new ArrayList (driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		
		Mobile1Detailes mobile1Detailes=new Mobile1Detailes(driver);
		
		mobile1Detailes.withoutExchangeIsSelected();

		
		

	}

}

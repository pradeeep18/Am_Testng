package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserSetup.baseBrowser;
import pages.HeaderAndFooter;
import pages.Mobile1Detailes;
import pages.Mobilesearch;

public class Verify_Search_MobilePage extends baseBrowser {
	
	private WebDriver driver;
	private HeaderAndFooter headerAndFooter;
	private Mobilesearch mobilesearch;
	private Mobile1Detailes mobile1Detailes;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser (String browserName) {
		if(browserName.equals("Chrome")) {
			driver=openChromeBrowser();
		}
		if(browserName.equals("Edge")) {
			driver=openEdgeBrowser();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void objectPOMClass() {
		headerAndFooter= new HeaderAndFooter(driver);
		mobilesearch= new Mobilesearch(driver);
		mobile1Detailes= new Mobile1Detailes(driver);
	}
	
	@BeforeMethod 
	public void openURL() {
		driver.get("https://www.amazon.in/");	
	}
	
	@Test
	public void verifyWithoutExchangeIsSelected() throws InterruptedException {
		headerAndFooter.sendSearchbox();
		headerAndFooter.clickOnSearchButton();
		mobilesearch.clickonMobile1();
		ArrayList<String> add= new ArrayList (driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		
		//boolean result =mobile1Detailes.withExchangeIsSelected();
//		boolean result = mobile1Detailes.clickWithExchange();
//		Assert.assertTrue(result);
		boolean result = mobile1Detailes.withoutExchangeIsSelected();
		Assert.assertTrue(result);
		
	}
	
	@AfterClass
	public void removeObject() {
		headerAndFooter=null;
		mobilesearch=null;
		mobile1Detailes=null;
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	    driver=null;
	    System.gc();
	}
}

package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserSetup.baseBrowser;
import pages.HeaderAndFooter;

public class VerifyHeaderOfMainPage extends baseBrowser {
	
	private WebDriver driver;
	private HeaderAndFooter headerAndFooter;
	
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
		headerAndFooter=new HeaderAndFooter(driver);
	}
	
	@BeforeMethod
	public void getURL() {
		driver.get("https://www.amazon.in/");
		 
	}
	
	@Test (priority=1)
	public void verifyAllTab() {
		headerAndFooter.clickonAll();
		driver.navigate().back();
	}
	
	@Test (priority=2)
	public void verifyBestSellerTab() {
		headerAndFooter.clickonBestsellers();
		driver.navigate().back();
	}
	@Test (priority=3)
	public void verifyBookTab() {
		headerAndFooter.clickonBook();
		driver.navigate().back();
	}
	@Test (priority=4)
	public void verifyCustomerServiceTab() {
		headerAndFooter.clickonCustomerSerivce();
		driver.navigate().back();
	}
	
	@AfterClass
	public void romoveObject() {
		headerAndFooter=null;	
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver=null;
		System.gc();
	}
}

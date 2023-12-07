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
import pages.Books;
import pages.HeaderAndFooter;

public class verifyBooksAdvanceSearch extends baseBrowser{
	private WebDriver driver;
	private HeaderAndFooter headerAndFooter;
	private Books books;
	
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
	public void objectClass() {
		headerAndFooter= new HeaderAndFooter(driver);
		books=new Books(driver);
	}
	
	@BeforeMethod
	public void openURL() {
		driver.get("https://www.amazon.in/");	
	}
	
	@Test
	public void verifyAdvanceSearch() {
		headerAndFooter.clickonBook();
		books.clickOnAdvanceSearch();
		books.selectDateField();
		books.selectDateMonth();
		books.selectDateYear();
		books.clickOnSearchButton();
	}
	
	@AfterClass
	public void removeObject() {
		headerAndFooter=null;
		books=null;
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver=null;
		System.gc();
	}
	
}

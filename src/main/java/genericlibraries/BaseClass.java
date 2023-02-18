package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.Homepage;
import pompages.SelemniumTrainingPage;
import pompages.SkillraryDemoAPPpage;
import pompages.contactUsPage;
import pompages.corejavaForSeleniumPage;
import pompages.corejavavideopage;
import pompages.testingPage;

public class BaseClass {

	protected proprertiesfileUtility property;
	protected ExcelUtility excel;
	protected WebDriverutility web ;
	protected WebDriver driver;
	protected Homepage home;
	protected SkillraryDemoAPPpage skillrarydemoapp;
	protected SelemniumTrainingPage selenium;
	protected testingPage testing;
	protected corejavaForSeleniumPage coreJava;
	protected corejavavideopage javavideo;
	protected contactUsPage contact;
	protected long time;
	
	//@BeforeSuite
		//@BeforeTest
		@BeforeClass 
		public void classConfiguration() {
			 property = new proprertiesfileUtility();
			 excel = new ExcelUtility();
			 web = new WebDriverutility();
			 
			 property.propertiFileInitilization(IConstantPath.PROPERTIES_FILE_PATH);
			 excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		}
		@BeforeMethod
		public void methodConfiguration(){
			  time=Long.parseLong(property.fetchproperty("timeouts"));
			driver= web.openApplication(property.fetchproperty("browser"), property.fetchproperty("url"), time);
			
			home = new Homepage(driver);
			
			Assert.assertTrue(home.getLogo().isDisplayed());
			
			skillrarydemoapp= new SkillraryDemoAPPpage(driver);
			selenium = new SelemniumTrainingPage(driver);
			coreJava = new corejavaForSeleniumPage(driver);
			testing= new testingPage(driver);
			contact = new contactUsPage(driver);
		}
		
			
			
		
		
		
		@AfterMethod
		public void methodTearDown() {
			web.childBrowser();
		}
		@AfterClass
		public void classTearDown() {
			excel.closeexcel();
		}
		//@AfterTest
		//@AfterSuite
}

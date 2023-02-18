package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FirstTest extends   BaseClass {
	
	@Test
	public void firsttest()
	
	{
		SoftAssert soft =new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoAPP();
		web.childBrowser();
		soft.assertTrue(skillrarydemoapp.getPageHeader().isDisplayed());
		
		skillrarydemoapp.mouseHoverToCourse(web);
		skillrarydemoapp.clickSeleniumTraing();
		soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
		selenium.doubleClickplusButton(web);
		selenium.clickAddToCart();
		web.handlealert();
		web.ExplicitWait(time, selenium.getIdemAddedMessage());
		web.takesScreenShot();
		soft.assertTrue(selenium.getIdemAddedMessage().isDisplayed());
		
		soft.assertAll();
		
		
		
		
	}

	 
}

package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class ThirdTest extends BaseClass {

	@Test
	public void thirdTest()
	{
		SoftAssert soft=new SoftAssert();
		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getPageHeader(), "CORE JAVA FOR SELENIUM");
		
		coreJava.clickcoreJavaForSeleniumlink();
		soft.assertEquals(javavideo.getPageHeader(), "Core Java For Selenium Training");
		
		javavideo.clickClosecookies();
		web.switchToFrame();
		javavideo.clickPlayButton();
		javavideo.clickPauseButton();
		web.SwitchBackToFrame();
		javavideo.clickaddWishList();
		
		soft.assertAll();
	}
	
}

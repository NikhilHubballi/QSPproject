package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class SecondTest extends BaseClass{

	@Test
	public  void secondTest()
	{
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoAPP();
		web.childBrowser();
		soft.assertTrue(skillrarydemoapp.getPageHeader().isDisplayed());
		
		skillrarydemoapp.seleniumCategory(web, 1);
		soft.assertEquals(testing.getPageHeader(), "Testing");
		web.draganadDrop(testing.getSeleniumImage(), testing.getCartArea());
		web.scrollToElement(testing.getfacebookIcon());
		
				}
}

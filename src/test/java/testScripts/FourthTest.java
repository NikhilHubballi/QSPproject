package testScripts;


import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FourthTest extends BaseClass
{
	
@Test
 public  void fourthTest()
	{
		
	
	SoftAssert soft =new SoftAssert();
	
	home.clickGears();
	home.clickSkillrarydemoAPP();
	web.childBrowser();
	soft.assertTrue(skillrarydemoapp.getPageHeader().isDisplayed());
	web.scrollToElement(skillrarydemoapp.getContactUs());
	skillrarydemoapp.clickContactUs();
	
	soft.assertTrue(contact.getpageHeader().isDisplayed());
	List<String> data=excel.fetchDataFromExcel("sheet1");
	contact.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
	soft.assertAll();
			
	
	
	
	}

}

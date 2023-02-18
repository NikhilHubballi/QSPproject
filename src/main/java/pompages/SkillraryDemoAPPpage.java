package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverutility;

public class SkillraryDemoAPPpage {

	@FindBy(xpath = "//div[@class='navbar-header']")
	private  WebElement pageHeader;
	@FindBy (id = "course")
	private WebElement courseTab;
	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	@FindBy(name = "addresstype")
	private WebElement categorydropdown;
	@FindBy (xpath = "//a[text()='Contact Us']")
	private WebElement contactUSLink;
	
	//Initialization
	
	public SkillraryDemoAPPpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getPageHeader()
	{
		return pageHeader;
		
	}
	public void mouseHoverToCourse(WebDriverutility web)
	{
	web.mousehovering(courseTab);
	}
	public void clickSeleniumTraing()
	{
		seleniumTrainingLink.click();
	}
	public void seleniumCategory(WebDriverutility web,int index) {
		
		web.dropdown(categorydropdown, index);
	}
	public  void clickContactUs() {
		contactUSLink.click();
	}
	public WebElement getContactUs() {
		return contactUSLink;
		
	}
	
	
}

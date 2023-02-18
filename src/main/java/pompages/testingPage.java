package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class testingPage {
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageHeader;

	@FindBy(id = "Selenium Training")
	private WebElement seleniumTraing;
	
	@FindBy(id = "cartArea")
	private WebElement cartArea;
	@FindBy(xpath = "//footer[@class='main-footer']/descendant::i[@class='fa fa-facebook']")
	private WebElement facebook;
	
	//Initialization
	public testingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	//Utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
		
	}
	public WebElement getSeleniumImage()
	{
		return getSeleniumImage();
		
	}
	
	public WebElement getCartArea()
	{
		return cartArea;
	}
	public WebElement getfacebookIcon() {
		return facebook;
		
	}
	public void clickFaceookIcon()
	{
		facebook.click();

	}
}


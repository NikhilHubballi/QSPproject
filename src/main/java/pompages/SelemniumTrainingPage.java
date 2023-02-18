package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverutility;

public class SelemniumTrainingPage {

	//Declaration
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id = "add")
	private WebElement plusButton;
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[@id='callout']/span")
	private WebElement itemaddeMessag;
	
	
	//Initialization
	public SelemniumTrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	//Utiliztion
	
	public String getPageHeader()
	{
		return pageHeader.getText();
		
	}
	public void doubleClickplusButton(WebDriverutility web)
	
	{
		web.doubleclickonElement(plusButton);
	}
	public void clickAddToCart() {
	
		addToCartButton.click();
	}
	public WebElement getIdemAddedMessage() {
		
		return itemaddeMessag;
			
	}
}

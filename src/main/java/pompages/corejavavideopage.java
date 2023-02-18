package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corejavavideopage {
@FindBy(xpath = "//h")
private WebElement pageHeader;
@FindBy (xpath = "//button[@aria_label='Play']")
private WebElement playButton;
@FindBy(xpath = "//button[@aria-label='Pause']")
private WebElement pauseButton;
@FindBy(xpath = "//span[text()='Add To Whishlist']")
private WebElement addwishListTab;
@FindBy(xpath = "//a[@class='close_cookies']")
private WebElement closecookies;

// initialization
public corejavavideopage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//utilization
	 public String getPageHeader() {
		 return pageHeader.getText();
	 }
	 public void clickPlayButton() {
		 playButton.click();
	 }
	 public void clickPauseButton() {
		 pauseButton.click();
	 }
	 public void clickaddWishList() {
		 addwishListTab.click();
	 }
	 public void clickClosecookies()
	 {
		 closecookies.click();
	 }
}


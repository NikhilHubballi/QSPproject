package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage {

	@FindBy(xpath="//img[contains(src,'contactus')]")
	private WebElement pageheader;
	@FindBy(name="name")
	private WebElement fullnameTF;
	@FindBy (name="sender")
	private WebElement emailTF;
	@FindBy(name="subject")
	private WebElement subjectTF;
	@FindBy(name="message")
	private WebElement messageTextArea;
	@FindBy(xpath="//button[@text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	//initialization
	public contactUsPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		}
	//utilization
	public WebElement getpageHeader() {
		return pageheader;
	}
	public void submitDetails(String name,String email,String Subject,String message) {
		fullnameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(Subject);
		messageTextArea.sendKeys(message);
		sendUsMailButton.click();
	}
}
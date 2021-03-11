package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopMenuArea extends BasePage {
	//Settings
	@FindBy(css = "#settings")
	private WebElement settingsBtn;
	@FindBy(css = "#loading")
	private WebElement loading;

	public TopMenuArea(WebDriver driver) {
		super(driver);
	}

	public void openSettings() {
		click(settingsBtn);
		sleep(1000);
	}

	void waitForLoading() {
		waitVisibilityOf(loading);
		waitInVisibilityOf(loading);
	}
	
	
	//Validation
	public String getSettingsName() {
		return getText(settingsBtn);
	}

}

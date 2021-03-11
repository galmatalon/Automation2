package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SettingsPage extends TopMenuArea {
	@FindBy(css = "[name='lang']")
	private WebElement languagesSelect;
	@FindBy(css = "[value='Submit changes']")
	private WebElement submitChangesBtn;
	
	public SettingsPage(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Input Examples: he = hebrew , en = English
	 */
	public void setLanguage(String language) {
		//WebElement languagesSelect = driver.findElement(By.cssSelector("gal"));
		Select s = new Select(languagesSelect);
		s.selectByValue(language);
		click(submitChangesBtn);
		sleep(4000);
	}

}

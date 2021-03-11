package pageobjects;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	Actions action;
	String mainWindow; // keep the main window name
	WebDriverWait wait; 

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, 15); 
	}

	protected void fillText(WebElement el, String text) {
		highlightElement(el, "yellow");
		el.clear();
		el.sendKeys(text);
	}

	protected void click(WebElement el) {
		highlightElement(el, "yellow");
		sleep(200);
		el.click();
	}

	protected String getText(WebElement el) {
		highlightElement(el, "orange");
		return el.getText();
	}

	//Overloading
	void alertOK(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	
	void alertOK() {
		driver.switchTo().alert().accept();
	}
	
	String getAttribute(WebElement el, String key) {
		return el.getAttribute(key);
	}
	
	void moveToElement(WebElement el) {
		action.moveToElement(el).build().perform();
	}
	
	void moveToNewWindow() {
		mainWindow = driver.getWindowHandle();
		Set<String> list = driver.getWindowHandles();
		//move to new window
		for (String win : list) {
			driver.switchTo().window(win);
		}
	}
	
	void moveToMainWindow() {
		driver.close();
		driver.switchTo().window(mainWindow);
	}
		
	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void waitVisibilityOf(WebElement el) {
		wait.until(ExpectedConditions.visibilityOf(el));
	}
	
	public void waitInVisibilityOf(WebElement el) {
		wait.until(ExpectedConditions.invisibilityOf(el));
	}

	private void highlightElement(WebElement element, String color) {
		//keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "background-color:" + color + ";" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Change the style 
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);",
				element);

		// Change the style back after few miliseconds
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);

	}

}

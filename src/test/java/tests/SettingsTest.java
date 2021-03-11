package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.SettingsPage;
import pageobjects.TasksPage;

public class SettingsTest extends BaseTest{

	@Test
	public void tc01_changeLanguage() {
		TasksPage tsp = new TasksPage(driver);
		tsp.openSettings();
		
		SettingsPage sp = new SettingsPage(driver);
		sp.setLanguage("he");
		
		tsp = new TasksPage(driver);
		String actual = tsp.getSettingsName();
		Assert.assertEquals(actual, "1������");
	}
	
	
}

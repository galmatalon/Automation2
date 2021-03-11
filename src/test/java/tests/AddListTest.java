package tests;

import org.testng.annotations.Test;

import pageobjects.TasksPage;

public class AddListTest extends BaseTest{
	
	@Test(description = "Choose one of the lits")
	public void tc00_chooseListFromKabab() {
		TasksPage tsp = new TasksPage(driver);
		tsp.chooseListFromMenu("Gal888");
	}
	
	@Test
	public void tc01_addList() {
		TasksPage tsp = new TasksPage(driver);
		tsp.addNewList("Gal888");
		tsp.chooseList1("Gal888");
	}
	
	@Test
	public void tc02_addTask() {
		TasksPage tsp = new TasksPage(driver);
		tsp.addSimpleTask("Need to call someone...");
	}
}

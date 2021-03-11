package tests;

import org.testng.annotations.Test;

import pageobjects.TasksPage;

public class AddAndDeleteTaskTest extends BaseTest{

	@Test(description = "add task and delete it")
	public void tc01_addTask() {
		TasksPage tsp = new TasksPage(driver);
		tsp.addSimpleTask("Gal 333");
		
		tsp.deleteTask("Gal 333");
	}
	
	
}

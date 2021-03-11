package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.TasksPage;

public class AddSimpleTaskTest extends BaseTest{

	@Test(dataProvider = "getData")
	public void tc01_addTask(String name1,String name2) {
		TasksPage tsp = new TasksPage(driver);
		tsp.addNewList(name1);
		tsp.chooseList(name1);
		tsp.renameList(name1, name2);
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object[][] getData(){
		//read from excel -- > Obeject[][]
		String[][] names = {
				{"gal1","gal2"},
				{"gal3","gal4"},
				{"gal5","gal6"}
		};
		return names;
	}
	
	
}

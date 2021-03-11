package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends TopMenuArea {

	@FindBy(css = "#task")
	private WebElement taskField;
	@FindBy(css = "#newtask_submit")
	private WebElement addTaskBtn;
	@FindBy(css = ".mtt-tabs-add-button span")
	private WebElement addNewListBtn;
	@FindBy(css = "li[id^='list_'] span")
	private List<WebElement> listOfList;
	//list menu options
	@FindBy(css = "#btnRenameList")
	private WebElement listMenuRenameBtn;
	@FindBy(css = "#btnDeleteList")
	private WebElement listMenuDeleteBtn;
	@FindBy(css = ".list-action")
	private List<WebElement> listOfMenuBtn;
	@FindBy(css = "#lists li>a")
	private List<WebElement> listOfList2;

	//kabab menu
	@FindBy(css = "#tabs_buttons span")
	private WebElement kababMenuBtn;
	@FindBy(css = "#slmenucontainer a")
	private List<WebElement> kababMenuList;
	
	//main list options
	@FindBy(css = "#tasklist>li")
	private List<WebElement> tasksList;
	@FindBy(css = "#cmenu_delete")
	private WebElement tasksMenuDeleteBtn;
	
	public TasksPage(WebDriver driver) {
		super(driver);
	}

	public void addSimpleTask(String name) {
		fillText(taskField, name);
		click(addTaskBtn);
		waitForLoading();
	}

	public void addNewList(String name) {
		click(addNewListBtn);
		alertOK(name);
		waitForLoading();
	}

	public void chooseList(String name) {
		for (WebElement el : listOfList) {
			String listName = getText(el);
			if (listName.equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}

	public void chooseList1(String name) {
		for (WebElement el : listOfList) {
			String listName = getText(el);
			if (listName.equalsIgnoreCase(name)) {
				click(el);
				click(el.findElement(By.xpath("../div")));
				break;
			}
		}
	}

	public void chooseList(String name, String option) {
		for (WebElement el : listOfList2) {
			String listName = getAttribute(el, "title");
			if (listName.equalsIgnoreCase(name)) {
				click(el); //choose list
				WebElement menuBtn = el.findElement(By.cssSelector(".list-action"));
				click(menuBtn);
				//choose from menu
				switch (option) {
				case "delete":
					click(listMenuDeleteBtn);
					alertOK();
					break;

				default:
					break;
				}
			}
		}
	}

	public void renameList(String name,String newName) {
		WebElement listMenuBtn = driver.findElement(By.cssSelector("[title='"+ name + "']>.list-action"));
		click(listMenuBtn);
		click(listMenuRenameBtn);
		alertOK(newName);
	}

	public void renameList(String newName) {
		for (WebElement el : listOfMenuBtn) {
			if (el.isDisplayed()) {
				click(el);
				break;
			}
		}
		click(listMenuRenameBtn);
		alertOK(newName);
	}

	public void chooseListFromMenu(String name) {
		click(kababMenuBtn);
		for (WebElement el : kababMenuList) {
			if (getText(el).equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}
	
	public void deleteTask(String name) {
		for (WebElement el : tasksList) {
			WebElement taskEl = el.findElement(By.cssSelector(".task-title"));
			String taskName = getText(taskEl);
			if (taskName.equalsIgnoreCase(name)) {
				//mouse hover
				moveToElement(taskEl);
				
				//menu btn
				WebElement menuEl = el.findElement(By.cssSelector(".taskactionbtn"));
				click(menuEl);
				sleep(1000);
				click(tasksMenuDeleteBtn);
				alertOK();
			}
		}
	}
	
	
	
}

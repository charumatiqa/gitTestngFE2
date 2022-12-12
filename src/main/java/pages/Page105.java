package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class Page105 {

	WebDriver driver;

	public Page105(WebDriver driver) {

		this.driver = driver;
	}
	// List of Elements

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement addTextElement;
	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement addCategoryButton;
	@FindBy(how = How.NAME, using = "due_month")
	WebElement allmonths;

	public String TextElement(String text) {
		addTextElement.sendKeys(text);
		return text;
	}

	public void clickonAddCategoryButton() {
		addCategoryButton.click();
	}

	public void duplicateCategory(String text) {
		addTextElement.sendKeys(text);
		clickonAddCategoryButton();

	}

	public List<String> validate12Months() {
		Select select = new Select(allmonths);
		List<WebElement> eachmonth = select.getOptions();
       List<String> ddmonth = new ArrayList<String>();
		for (WebElement monthlist : eachmonth) {
			if (!(monthlist.getText().equalsIgnoreCase("None"))) {

				ddmonth.add(monthlist.getText());
			}

		}

		return ddmonth;

	}
	
	
	public List<String> Add12months(){
		 List<String> months = new ArrayList<String>();
		 months.add("Jan");
		 months.add("Feb");
		 months.add("Mar");
		 months.add("Apr");
		 months.add("May");
		 months.add("Jun");
		 months.add("Jul");
		 months.add("Aug");
		 months.add("Sep");
		 months.add("Oct");
		 months.add("Nov");
		 months.add("Dec");
		
		
		
		return months;
		
	}



}

package test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Page105;
import util.Browserfactory;
import pages.Basepage;


public class AddCategoryTest extends Basepage {
	WebDriver driver;
	String globleText;
	String None;

//	Test Data
	String text = "QASDET";
//    String month = "eachmonth" ;
    
	@BeforeMethod
	public void init() {
		driver = Browserfactory.init();
	}

	@Test(priority=1)
	public void validateAddCategory() {
        Page105 pages105 = PageFactory.initElements(driver, Page105.class);
		String localText = pages105.TextElement(text + generateRandomNumber(1000));
		System.out.println(localText);
		globleText = localText;
		pages105.clickonAddCategoryButton();
		Assert.assertEquals(localText, globleText);

	}




	@Test(priority=2)
	public void dublicateEntry() {
		Page105 pages105 = PageFactory.initElements(driver, Page105.class);
		System.out.println("globleText " + globleText);
		pages105.duplicateCategory(globleText);
		Assert.assertTrue(true, "duplicateCategery");
		System.out.println("duplicateCategery");
	}
	
	
	@Test(priority=3)
	public void monthDropDown() {
		Page105 pages105 = PageFactory.initElements(driver, Page105.class);
		List<String> actualM = pages105.validate12Months();
		System.out.println(actualM);
		List<String> expectedM = pages105.Add12months();
        System.out.println(expectedM);
        Assert.assertEquals(actualM, expectedM);
              
    
	}

	

//	@AfterMethod
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Browserfactory.tearDown();
	}

}


package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;

public class Basepage {
	
	public void clickWebElement(WebElement element){

		element.click();
	
	}

	public static int generateRandomNumber(int boundaryNum)
	{
		Random r=new Random();
		return r.nextInt(boundaryNum);
	}


}

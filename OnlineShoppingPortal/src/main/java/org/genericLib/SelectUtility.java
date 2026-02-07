package org.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	
	//To Select An Option By its visible Text
	public void selectByVisibleTextMethod(WebElement dropdownElement, String visibleText)
	
	{
		Select sel = new Select(dropdownElement);
		sel.selectByVisibleText(visibleText);
	}

}

package org.testPackage;

import org.genericLib.BaseClass;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddToCart_001_Test extends BaseClass {
	
	@Test
	public void addToCartMethod() 
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(cpp.getProdaddedToCartMsg().isDisplayed(),true, "Product is not added to cart");

	}
}

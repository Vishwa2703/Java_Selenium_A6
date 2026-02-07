package org.testPackage;

import org.genericLib.BaseClass;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(org.genericLib.MyListener.class)
public class TC_BuyProduct_003_Test extends BaseClass  {
	
	@Test
	public void buyProductMethod()
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(cpp.getProdaddedToCartMsg().isDisplayed(),true, "Product is not added to cart");
		
		bp.getShoppingCartLink().click();
		ShoppingCartPage scp1 = new ShoppingCartPage(driver);
		scp1.getSmartphoneItem().click();
		scp1.getSmartphoneLink().click();
		scp1.getCheckoutButton().click();
		
	}
	

}

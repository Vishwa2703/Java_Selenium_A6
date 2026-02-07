package org.testPackage;

import org.genericLib.BaseClass;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_RemoveProdFromCart_002_Test extends BaseClass{
	@Test
	public void removeProductFromCart() throws InterruptedException {
		 BasePage bp = new BasePage(driver);
		 bp.getElectronicsLink().click();
		 
		 ElectronicsPage ep= new ElectronicsPage(driver);
		 ep.getCellPhonesLink().click();
		 
		 CellPhonesPage cpp =new CellPhonesPage(driver);
		 cpp.getCellPhoneAddToCartButton().click();
		 
		 SoftAssert sa =new SoftAssert();
		 sa.assertEquals(cpp.getProdaddedToCartMsg().isDisplayed(),true ,"Product is not added to cart !");
		 
		 bp.getShoppingCartLink().click();
		 
		 ShoppingCartPage scp =new ShoppingCartPage(driver);
		 scp.removeSmartphone();
		 
		 try
		 {
			 if(scp.getSmartphoneLink().isDisplayed())
			 {
				 Reporter.log("Product is not remove from cart!", true);
			 }
		 }
		catch(Exception e) 
		 
			 {
				 Reporter.log("Product is remove from car! ", true);
			 }
		finally 
		 {
			Reporter.log("The Test case is executed Successfully!", true);
		 }
		 
		 sa.assertAll(); 	 
	}

}

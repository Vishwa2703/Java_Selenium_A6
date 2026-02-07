package org.pomRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement billingAddressCountryDD;
	@FindBy(id = "BillingNewAddress_City") private WebElement CityTB;
	@FindBy(id = "BillingNewAddress_Address1") private WebElement Address1TB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement Pincode1TB;
	@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement PhoneNumberTB;
	@FindBy(xpath = "//input[@onclick ='Billing.save()']") private WebElement billingAddressContinueButton;
			
	

}

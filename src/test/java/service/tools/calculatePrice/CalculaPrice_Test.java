package service.tools.calculatePrice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class CalculaPrice_Test {
	
	private WebDriver driver;
	CalculaPricePage calculaPricePage;

	@Before
	public void setUp() throws Exception {
		calculaPricePage = new CalculaPricePage(driver);
		driver = calculaPricePage.chromeDriverConnection();
		calculaPricePage.visit("https://qa.ciencuadras.com/"); 
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		calculaPricePage.propertyLocation();
		calculaPricePage.propertyInformation(BasicData.TYPE_PROPERTY_C, BasicData.TRANSACTION_TYPE_A, BasicData.STRATUM_3);
		calculaPricePage.payThePriceonline(BasicData.TYPE_DOCUMENT_CC);
		calculaPricePage.payFinish(BasicData.DISCOUNT_CODE_EMPTY); 
		calculaPricePage.purchaseDetail(BasicData.PAYMENT_TYPE_DEBIT, BasicData.TYPE_DOCUMENT_CC, BasicData.TYPE_PERSON_PN,BasicData.TYPE_BANK_ITAU);
	}

}

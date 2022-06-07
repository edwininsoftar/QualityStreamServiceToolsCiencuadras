package service.tools.requestAppraisal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class RequestAppraisal_Test {
	
	private WebDriver driver;
	RequestAppraisalPage recuestAppraisalPage;

	@Before
	public void setUp() throws Exception {
		recuestAppraisalPage = new RequestAppraisalPage(driver);
		driver = recuestAppraisalPage.chromeDriverConnection();
		recuestAppraisalPage.visit("https://qa.ciencuadras.com/"); 
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		recuestAppraisalPage.appraise(BasicData.APPRAISAL_FROM);
		recuestAppraisalPage.requestForm(BasicData.TYPE_PROPERTY_A, BasicData.ESTATE_STATUS_U, BasicData.STATE_OF_THE_PROPERTY_T, BasicData.TYPE_PARKING_C, BasicData.TYPE_DEPOSIT_P);
		recuestAppraisalPage.billingForm(BasicData.TYPE_DOCUMENT_CC, BasicData.HOME_VISIT_N);
		recuestAppraisalPage.payFinish(BasicData.DISCOUNT_CODE_EMPTY);
		recuestAppraisalPage.purchaseDetail(BasicData.PAYMENT_TYPE_DEBIT, BasicData.TYPE_DOCUMENT_CC, BasicData.TYPE_PERSON_PN, BasicData.TYPE_BANK_ITAU);
	}

}

package service.tools.calculatePrice;

import java.util.Set;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CalculaPricePage extends BasicWrap{
	
	public CalculaPricePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	public void propertyLocation() throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorCalculatePrice.LOCATOR_X);
			click(LocatorCalculatePrice.LOCATOR_BUTTON_CALCULA_PRICE);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			type(BasicData.CITY, LocatorCalculatePrice.LOCATOR_CITY);
			Thread.sleep(5000);	
			WebElement ct = driver.findElement(LocatorCalculatePrice.LOCATOR_CITY);
			ct.sendKeys(Keys.DOWN);
			ct.sendKeys(Keys.ENTER);
			type(BasicData.ADDRESS,LocatorCalculatePrice.LOCATOR_ADDRESS);
			Thread.sleep(5000);	
			type(BasicData.ADDRESS_ADD,LocatorCalculatePrice.LOCATOR_ADDRESS_ADD);
			click(LocatorCalculatePrice.LOCATOR_CHECK_MAP);
			click(LocatorCalculatePrice.LOCATOR_BUTTON_CONTINUE);
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
	}
	
	public void propertyInformation(String TypeProperty, String TransactionType, String stratum) {
		try {
			Thread.sleep(8000);	
			click(LocatorCalculatePrice.LOCATOR_TYPE_PROPERTY);
			Thread.sleep(8000);	
			if(BasicData.TYPE_PROPERTY_C.equals(TypeProperty)) {
				click(LocatorCalculatePrice.LOCATOR_HOUSE);
			}
			if(BasicData.TYPE_PROPERTY_A.equals(TypeProperty)) {
				click(LocatorCalculatePrice.LOCATOR_APARTMENT);
			}
			if(BasicData.TRANSACTION_TYPE_A.equals(TransactionType)) {
				click(LocatorCalculatePrice.LOCATOR_RENT);
			}
			if(BasicData.TRANSACTION_TYPE_V.equals(TransactionType)) {
				click(LocatorCalculatePrice.LOCATOR_SALE);
			}
			if(BasicData.STRATUM_1.equals(stratum)) {
				click(LocatorCalculatePrice.LOCATOR_STRATUM_1);
			}
			if(BasicData.STRATUM_2.equals(stratum)) {
				click(LocatorCalculatePrice.LOCATOR_STRATUM_2);
			}
			if(BasicData.STRATUM_3.equals(stratum)) {
				click(LocatorCalculatePrice.LOCATOR_STRATUM_3);
			}
			if(BasicData.STRATUM_4.equals(stratum)) {
				click(LocatorCalculatePrice.LOCATOR_STRATUM_4);
			}
			if(BasicData.STRATUM_5.equals(stratum)) {
				click(LocatorCalculatePrice.LOCATOR_STRATUM_5);
			}
			if(BasicData.STRATUM_6.equals(stratum)) {
				click(LocatorCalculatePrice.LOCATOR_STRATUM_6);
			}
			Thread.sleep(5000);	
			WebElement ar = driver.findElement(LocatorCalculatePrice.LOCATOR_AREA);
			ar.clear(); 
			type(BasicData.AREA, LocatorCalculatePrice.LOCATOR_AREA);
			Thread.sleep(5000);	
			WebElement an = driver.findElement(LocatorCalculatePrice.LOCATOR_ANTIQUITY);
			an.clear();
			type(BasicData.ANTIQUITY, LocatorCalculatePrice.LOCATOR_ANTIQUITY);
			Thread.sleep(5000);			
			for(int i=0;i<BasicData.PARKING_LESS;i++) {
				click(LocatorCalculatePrice.LOCATOR_PARKING_LESS);
			}
			for(int i=0;i<BasicData.PARKING_MORE;i++) {
				click(LocatorCalculatePrice.LOCATOR_PARKING_MORE);
			}
			for(int i=0;i<BasicData.TOILETS_LEST;i++) {
				click(LocatorCalculatePrice.LOCATOR_TOILETS_LESS);
			}
			for(int i=0;i<BasicData.TOILETS_MORE;i++) {
				click(LocatorCalculatePrice.LOCATOR_TOILETS_MORE);
			}
			for(int i=0;i<BasicData.ROOMS_LESS;i++) {
				click(LocatorCalculatePrice.LOCATOR_ROOMS_LESS);
			}
			for(int i=0;i<BasicData.ROOMS_MORE;i++) {
				click(LocatorCalculatePrice.LOCATOR_ROOMS_MORE);
			}
			for(int i=0;i<BasicData.BALCONIES_MORE;i++) {
				click(LocatorCalculatePrice.LOCATOR_BALCONIES_MORE);
			}
			for(int i=0;i<BasicData.TERRACE_MORE;i++) {
				click(LocatorCalculatePrice.LOCATOR_TERRACE_MORE);
			}
			for(int i=0;i<BasicData.DEPOSIT_MORE;i++) {
				click(LocatorCalculatePrice.LOCATOR_DEPOSIT_MORE);
			}
			for(int i=0;i<BasicData.ELEVATORS_MORE;i++) {
				click(LocatorCalculatePrice.LOCATOR_ELEVATORS_MORE);
			}
			click(LocatorCalculatePrice.LOCATOR_BUTTON_CONTINUE_TWO);
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payThePriceonline(String identityDocument) {
		try {
			Thread.sleep(5000);	
			type(BasicData.NAMES, LocatorCalculatePrice.LOCATOR_NAMES );
			type(BasicData.SURNAMES, LocatorCalculatePrice.LOCATOR_SURNAMES);
			click( LocatorCalculatePrice.LOCATOR_IDENTITY_DOCUMENT);
			if(BasicData.TYPE_DOCUMENT_CC.equals(identityDocument)) {
				click(LocatorCalculatePrice.LOCATOR_CC);
			}
			if(BasicData.TYPE_DOCUMENT_NIT.equals(identityDocument)) {
				click(LocatorCalculatePrice.LOCATOR_NIT);
			}
			if(BasicData.TYPE_DOCUMENT_CE.equals(identityDocument)) {
				click(LocatorCalculatePrice.LOCATOR_CE);
			}
			type(BasicData.ID_NUMBER, LocatorCalculatePrice.LOCATOR_ID_NUMBER);
			type(BasicData.EMAIL, LocatorCalculatePrice.LOCATOR_EMAIL);
			type(BasicData.EMAIL,LocatorCalculatePrice.LOCATOR_CONFIRM_EMAIL);
			type(BasicData.PHONE,LocatorCalculatePrice.LOCATOR_PHONE);
			Thread.sleep(5000);	
			click(LocatorCalculatePrice.LOCATOR_BUTTON_CONTINUE_THREE);
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payFinish(String DiscountCode) {
		try {
			Thread.sleep(50000);
			if(BasicData.DISCOUNT_CODE.equals(DiscountCode)) {
				type(BasicData.DISCOUNT_CODE,LocatorCalculatePrice.LOCATOR_BOND);
				click(LocatorCalculatePrice.LOCATOR_APLIC);
			}else {
				type(BasicData.DISCOUNT_CODE_EMPTY,LocatorCalculatePrice.LOCATOR_BOND);
			}
			click(LocatorCalculatePrice.LOCATOR_BUTTON_PAY_FINISH);
			Thread.sleep(8000);
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void purchaseDetail(String PayMentType, String TypeDocument, String TypePerson,String TypeBank) {
		try {
			Thread.sleep(8000);
			click(LocatorCalculatePrice.LOCATOR_COOKIES);
			Thread.sleep(8000);
			if(BasicData.PAYMENT_TYPE_DEBIT.equals(PayMentType)) {
				click(LocatorCalculatePrice.LOCATOR_DEBIT_CARD);
				Thread.sleep(3000);
				type(BasicData.HOLDER_NAME, LocatorCalculatePrice.LOCATOR_HOLDER_NAME_D);
				type(BasicData.CARD_NUMBER, LocatorCalculatePrice.LOCATOR_CARD_NUMBER_D);
				type(BasicData.MONTH_CARD,LocatorCalculatePrice.LOCATOR_MONTH_CARD_D);
				type(BasicData.YEAR_CARD, LocatorCalculatePrice.LOCATOR_YEAR_CARD_D);
				type(BasicData.CVV, LocatorCalculatePrice.LOCATOR_CVVD);
				Thread.sleep(8000);
				click(LocatorCalculatePrice.LOCATOR_PAYMENT_D);
			}
			if(BasicData.PAYMENT_TYPE_CREDIT.equals(PayMentType)) {
				click(LocatorCalculatePrice.LOCATOR_CREDIT_CARD);
				Thread.sleep(3000);
				type(BasicData.HOLDER_NAME, LocatorCalculatePrice.LOCATOR_HOLDER_NAME_C);
				type(BasicData.CARD_NUMBER,LocatorCalculatePrice.LOCATOR_CARD_NUMBER_C);
				type(BasicData.MONTH_CARD,LocatorCalculatePrice.LOCATOR_MONTH_CARDC);
				type(BasicData.YEAR_CARD,LocatorCalculatePrice.LOCATOR_YEAR_CARD_C);
				type(BasicData.CVV,LocatorCalculatePrice.LOCATOR_CVVC);
				Thread.sleep(8000);
				click(LocatorCalculatePrice.LOCATOR_DUES);
				Thread.sleep(8000);
				click(LocatorCalculatePrice.LOCATOR_FIVE);
				Thread.sleep(8000);
				click(LocatorCalculatePrice.LOCATOR_PAYMENTC);
			}
			if(BasicData.PAYMENT_TYPE_PSE.equals(PayMentType)) {
				click(LocatorCalculatePrice.LOCATOR_PSE);
				Thread.sleep(3000);
				click(LocatorCalculatePrice.LOCATOR_TYPE_DOCUMENT_P);
				Thread.sleep(8000);
				if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
					click(LocatorCalculatePrice.LOCATOR_CC_P);
				}
				if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
					click(LocatorCalculatePrice.LOCATOR_CE_P);
				}
				if(BasicData.TYPE_DOCUMENT_CP.equals(TypeDocument)) {
					click(LocatorCalculatePrice.LOCATOR_CP_P);
				}
				if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
					click(LocatorCalculatePrice.LOCATOR_NIT_P);
				}
				if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
					click(LocatorCalculatePrice.LOCATOR_TI_P);
				}
				click(LocatorCalculatePrice.LOCATOR_TYPE_PERSON);
				Thread.sleep(8000);
				if(BasicData.TYPE_PERSON_PN.equals(TypePerson)) {
					click(LocatorCalculatePrice.LOCATOR_PN);
				}
				if(BasicData.TYPE_PERSON_PJ.equals(TypePerson)) {
					click(LocatorCalculatePrice.LOCATOR_PJ);
				}
				click(LocatorCalculatePrice.LOCATOR_BANK);
				Thread.sleep(8000);
				if(BasicData.TYPE_BANK_CAJA_SOCIAL.equals(TypeBank)) {
					click(LocatorCalculatePrice.LOCATOR_CAJA_SOCIAL);
				}
				if(BasicData.TYPE_BANK_ITAU.equals(TypeBank)) {
					click(LocatorCalculatePrice.LOCATOR_ITAU);
				}
				Thread.sleep(8000);
				click(LocatorCalculatePrice.LOCATOR_PAYMENT_P);
				Thread.sleep(10000);
			}
			Thread.sleep(5000);
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}

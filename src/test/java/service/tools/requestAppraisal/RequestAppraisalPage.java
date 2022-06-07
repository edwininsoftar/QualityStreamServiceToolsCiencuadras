package service.tools.requestAppraisal;

import java.util.Set;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;
import service.tools.calculatePrice.LocatorCalculatePrice;

public class RequestAppraisalPage extends BasicWrap {

	public RequestAppraisalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void appraise(String AppraisalFrom) throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorRequestAppraisal.LOCATOR_X);
			click(LocatorRequestAppraisal.LOCATO_BUTTON_APPRAISE);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			if(BasicData.APPRAISAL_FROM.equals(AppraisalFrom)) {
				Thread.sleep(8000);
				click(LocatorRequestAppraisal.LOCATOR_BUTTON_COLOMBIA);
				type(BasicData.CITY, LocatorRequestAppraisal.LOCATOR_CITY);
				Thread.sleep(8000);	
				WebElement ciu = driver.findElement(LocatorRequestAppraisal.LOCATOR_CITY);
				ciu.sendKeys(Keys.DOWN);
				ciu.sendKeys(Keys.ENTER);
				Thread.sleep(8000);	
				click(LocatorRequestAppraisal.LOCATOR_CONFIRM);
				Thread.sleep(8000);	
				click(LocatorRequestAppraisal.LOCATOR_CONTINUE);
			}
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
	
	public void requestForm(String TypeProperty, String StateStatus, String StateOfTheProperty, String TypeParking, String TypeDeposit)  throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(LocatorRequestAppraisal.LOCATOR_TYPE_PROPERTY);
			if(BasicData.TYPE_PROPERTY_A.equals(TypeProperty)) {
				click(LocatorRequestAppraisal.LOCATOR_APARTMENT);
			}
			if(BasicData.TYPE_PROPERTY_C.equals(TypeProperty)) {
				click(LocatorRequestAppraisal.LOCATOR_HOUSE);
			}
			type(BasicData.ADDRESS, LocatorRequestAppraisal.LOCATOR_ADDRESS);
			type(BasicData.ADDRESS_ADD,LocatorRequestAppraisal.LOCATOR_ADDRES_ADD);
			type(BasicData.SALE, LocatorRequestAppraisal.LOCATOR_SALE);
			type(BasicData.ZONE_A, LocatorRequestAppraisal.LOCATOR_ZONE);
			type(BasicData.ENROLLMENT, LocatorRequestAppraisal.LOCATOR_ENROLLMENT);
			if(BasicData.ESTATE_STATUS_N.equals(StateStatus)) {
				click(LocatorRequestAppraisal.LOCATOR_ESTATE_STATUS);
				click(LocatorRequestAppraisal.LOCATOR_NEW);
				if(BasicData.STATE_OF_THE_PROPERTY_O.equals(StateOfTheProperty)) {
					click(LocatorRequestAppraisal.LOCATOR_BUILDING_UNDER_CONSTRUCTION);
				}
				if(BasicData.STATE_OF_THE_PROPERTY_T.equals(StateOfTheProperty)) {
					click(LocatorRequestAppraisal.LOCATOR_FINISHED_PROPERTY);
				}
			}
			if(BasicData.ESTATE_STATUS_U.equals(StateStatus)) {
				click(LocatorRequestAppraisal.LOCATOR_ESTATE_STATUS);
				click(LocatorRequestAppraisal.LOCATOR_USED);
			}
			
			if(BasicData.PARKING_MORE != 0) {
				for(int i=0;i<BasicData.PARKING_MORE;i++) {
					click(LocatorRequestAppraisal.LOCATOR_PARKING);
				}
				if(BasicData.TYPE_PARKING_C.equals(TypeParking)) {
					click(LocatorRequestAppraisal.LOCATOR_PARKING_COMMUNAL);
				}
				if(BasicData.TYPE_PARKING_P.equals(TypeParking)) {
					click(LocatorRequestAppraisal.LOCATOR_PARKING_PRIVATE);
				}
				if(BasicData.TYPE_PARKING_E.equals(TypeParking)) {
					click(LocatorRequestAppraisal.LOCATOR_PARKING_EXCLUSIVE);
				}
			}
			if(BasicData.DEPOSIT != 0) {
				for(int i=0;i<BasicData.DEPOSIT;i++) {
					click(LocatorRequestAppraisal.LOCATOR_DEPOSIT);
				}
				Thread.sleep(5000);
				if(BasicData.TYPE_DEPOSIT_C.equals(TypeDeposit)) {
					click(LocatorRequestAppraisal.LOCATOR_DEPOSIT_COMMUNAL);
				}
				if(BasicData.TYPE_DEPOSIT_P.equals(TypeDeposit)) {
					click(LocatorRequestAppraisal.LOCATOR_DEPOSIT_PRIVATE);
				}
				if(BasicData.TYPE_DEPOSIT_E.equals(TypeDeposit)) {
					click(LocatorRequestAppraisal.LOCATOR_DEPOSIT_EXCLUSIVE);
				}
			}
			Thread.sleep(8000);
			click(LocatorRequestAppraisal.LOCATOR_BUTTON_CONTINUE);
		} catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void billingForm(String TypeDocument, String HomeVisit) {
		try {
			Thread.sleep(8000);
			type(BasicData.EMAIL, LocatorRequestAppraisal.LOCATOR_EMAIL);
			click(LocatorRequestAppraisal.LOCATOR_TYPE_DOCUMENT);
			if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
				click(LocatorRequestAppraisal.LOCATOR_CC);
			}
			if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
				click(LocatorRequestAppraisal.LOCATOR_NIT);
			}
			if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
				click(LocatorRequestAppraisal.LOCATOR_EXTRANJERIA);
			}
			if(BasicData.TYPE_DOCUMENT_CP.equals(TypeDocument)) {
				click(LocatorRequestAppraisal.LOCATOR_PASAPORTE);
			}
			type(BasicData.DOCUMENT, LocatorRequestAppraisal.LOCATOR_IDENTIFICATION);
			WebElement na = driver.findElement(LocatorRequestAppraisal.LOCATOR_NAME);
			na.clear();
			type(BasicData.NAME, LocatorRequestAppraisal.LOCATOR_NAME);
			type(BasicData.PHONE, LocatorRequestAppraisal.LOCATOR_PHONE);
			if(BasicData.HOME_VISIT_S.equals(HomeVisit)) {
				click(LocatorRequestAppraisal.LOCATOR_HOME_VISIT);
			}
			if(BasicData.HOME_VISIT_N.equals(HomeVisit)){
				type(BasicData.NAME_TWO, LocatorRequestAppraisal.LOCATOR_NAME_LASTNAME);
				type(BasicData.PHONE_TWO, LocatorRequestAppraisal.LOCATOR_PHONE_TWO);
				type(BasicData.EMAIL_TWO, LocatorRequestAppraisal.LOCATOR_EMAIL_TWO);
			}
			type(BasicData.OWNER_NAME, LocatorRequestAppraisal.LOCATOR_OWNER_NAME);
			type(BasicData.OWNER_PHONE, LocatorRequestAppraisal.LOCATOR_OWNER_PHONE);
			type(BasicData.OWNER_EMAIL, LocatorRequestAppraisal.LOCATOR_OWNER_EMAIL); 
			click(LocatorRequestAppraisal.LOCATOR_PAY);
		} catch (NoSuchElementException e) {
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
	
	public void purchaseDetail(String PaymentType, String TypeDocument, String TypePerson, String TypeBank) {
		try {
			Thread.sleep(8000);
			click(LocatorRequestAppraisal.LOCATOR_COOKIES);
			Thread.sleep(8000);
			if(BasicData.PAYMENT_TYPE_DEBIT.equals(PaymentType)) {
				click(LocatorRequestAppraisal.LOCATOR_DEBIT_CARD);
				type(BasicData.HOLDER_NAME, LocatorRequestAppraisal.LOCATOR_HOLDER_NAME_D);
				type(BasicData.CARD_NUMBER, LocatorRequestAppraisal.LOCATOR_CARD_NUMBER_D);
				type(BasicData.MONTH_CARD, LocatorRequestAppraisal.LOCATOR_MONTH_CARD_D);
				type(BasicData.YEAR_CARD, LocatorRequestAppraisal.LOCATOR_YEAR_CARD_D);
				type(BasicData.CVV, LocatorRequestAppraisal.LOCATOR_CVV_D);
				Thread.sleep(8000);
				click(LocatorRequestAppraisal.LOCATOR_PAYMENT_D);
			}
			if(BasicData.PAYMENT_TYPE_CREDIT.equals(PaymentType)) {
				click(LocatorRequestAppraisal.LOCATOR_CREDIT_CARD);
				type(BasicData.HOLDER_NAME, LocatorRequestAppraisal.LOCATOR_HOLDER_NAME_C);
				type(BasicData.CARD_NUMBER, LocatorRequestAppraisal.LOCATOR_CARD_NUMBER_C);
				type(BasicData.MONTH_CARD, LocatorRequestAppraisal.LOCATOR_MONTH_CARD_C);
				type(BasicData.YEAR_CARD, LocatorRequestAppraisal.LOCATOR_YEAR_CARD_C);
				type(BasicData.CVV, LocatorRequestAppraisal.LOCATOR_CVVC);
				Thread.sleep(8000);
				click(LocatorRequestAppraisal.LOCATOR_DUES);
				Thread.sleep(8000);
				click(LocatorRequestAppraisal.LOCATOR_FIVE);
				Thread.sleep(8000);
				click(LocatorRequestAppraisal.LOCATOR_PAYMENT_C);
			}
			if(BasicData.PAYMENT_TYPE_PSE.equals(PaymentType)) {
				click(LocatorRequestAppraisal.LOCATOR_PSE);
				click(LocatorRequestAppraisal.LOCATOR_TYPE_DOCUMENT_P);
				Thread.sleep(8000);
				if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
					click(LocatorRequestAppraisal.LOCATOR_CC);
				}
				if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
					click(LocatorRequestAppraisal.LOCATOR_CE);
				}
				if(BasicData.TYPE_DOCUMENT_CP.equals(TypeDocument)) {
					click(LocatorRequestAppraisal.LOCATOR_CC_P);
				}
				if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
					click(LocatorRequestAppraisal.LOCATOR_NIT_P );
				}
				if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
					click(LocatorRequestAppraisal.LOCATOR_TI);
				}
				click(LocatorRequestAppraisal.LOCATOR_TYPE_PERSON);
				Thread.sleep(8000);
				if(BasicData.TYPE_PERSON_PN.equals(TypePerson)) {
					click(LocatorRequestAppraisal.LOCATOR_PN);
				}
				if(BasicData.TYPE_PERSON_PJ.equals(TypePerson)) {
					click(LocatorRequestAppraisal.LOCATOR_PJ);
				}
				click(LocatorRequestAppraisal.LOCATOR_BANK);
				Thread.sleep(8000);
				if(BasicData.TYPE_BANK_CAJA_SOCIAL .equals(TypeBank)) {
					click(LocatorRequestAppraisal.LOCATOR_CAJA_SOCIAL);
				}
				if(BasicData.TYPE_BANK_ITAU.equals(TypeBank)) {
					click(LocatorRequestAppraisal.LOCATOR_ITAU);
				}
				Thread.sleep(8000);
				click(LocatorRequestAppraisal.LOCATOR_PAYMENT_P);
				Thread.sleep(10000);
				click(LocatorRequestAppraisal.LOCATOR_PSE_CHECK_POLICY);
				click(LocatorRequestAppraisal.LOCATOR_PSE_CHECK_TERMS);
				click(LocatorRequestAppraisal.LOCATOR_FOLLOW);
			}
		} catch (NoSuchElementException e) {
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

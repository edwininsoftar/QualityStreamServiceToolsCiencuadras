package service.tools.requestAppraisal;

import org.openqa.selenium.By;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularBinding;
import com.paulhammant.ngwebdriver.ByAngularOptions;

public class LocatorRequestAppraisal {

	//Solicitud avaluo
	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATO_BUTTON_APPRAISE = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[1]/div/div[2]/a");
	public static final By LOCATOR_BUTTON_COLOMBIA = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[1]/a");
	public static final By LOCATOR_BUTTON_CALCULATE_PRICE = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	public static final By LOCATOR_CITY = By.name("ciudad");
	public static final By LOCATOR_CONFIRM = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-check-coverage/div/div[2]/div[2]/button");
	public static final By LOCATOR_CONTINUE = By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-coverage/div/div[3]/div/button");
	// Formato de solicitud
	public static final By LOCATOR_TYPE_PROPERTY = By.cssSelector("div[class=\"mat-form-field-infix ng-tns-c121-6\"]");
	public static final By LOCATOR_APARTMENT = By.xpath("//*[@id=\"mat-option-6\"]/span");
	public static final By LOCATOR_HOUSE = By.xpath("//*[@id=\"mat-option-7\"]/span");
	public static final By LOCATOR_ADDRESS = By.id("mat-input-2");
	public static final By LOCATOR_ADDRES_ADD = By.id("mat-input-3");
	public static final By LOCATOR_SALE = By.id("mat-input-4");
	public static final By LOCATOR_ZONE = By.id("mat-input-5");
	public static final By LOCATOR_ENROLLMENT = By.id("mat-input-6");
	public static final By LOCATOR_ESTATE_STATUS = By.cssSelector("div[class=\"mat-select-arrow ng-tns-c165-15\"]");
	public static final By LOCATOR_NEW = By.xpath("//*[@id=\"mat-option-2\"]/span");
	public static final By LOCATOR_USED = By.xpath("//*[@id=\"mat-option-3\"]/span");
	public static final By LOCATOR_BUILDING_UNDER_CONSTRUCTION = By.xpath("//*[@id=\"mat-radio-2\"]/label/span[1]/span[1]");
	public static final By LOCATOR_FINISHED_PROPERTY = By.xpath("//*[@id=\"mat-radio-3\"]/label/span[1]/span[1]");
	public static final By LOCATOR_PARKING = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-appraisal-register/div/div[1]/form/div[2]/div[1]/div[1]/div/button[2]");
	public static final By LOCATOR_PARKING_COMMUNAL = By.xpath("/html/body/app-root/app-appraisal-coverage/section[2]/app-stepper/mat-horizontal-stepper/div[2]/div[2]/app-appraisal-register/div/div[1]/form/div[2]/div[1]/div[2]/mat-radio-group/mat-radio-button[1]/label/span[1]/span[1]");
	public static final By LOCATOR_PARKING_PRIVATE = By.xpath("/html/body/app-root/app-appraisal-coverage/section[2]/app-stepper/mat-horizontal-stepper/div[2]/div[2]/app-appraisal-register/div/div[1]/form/div[2]/div[1]/div[2]/mat-radio-group/mat-radio-button[2]/label/span[1]/span[1]");
	public static final By LOCATOR_PARKING_EXCLUSIVE = By.xpath("/html/body/app-root/app-appraisal-coverage/section[2]/app-stepper/mat-horizontal-stepper/div[2]/div[2]/app-appraisal-register/div/div[1]/form/div[2]/div[1]/div[2]/mat-radio-group/mat-radio-button[3]/label/span[1]/span[1]");
	public static final By LOCATOR_DEPOSIT = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-appraisal-register/div/div[1]/form/div[2]/div[2]/div[1]/div/button[2]");
	public static final By LOCATOR_DEPOSIT_COMMUNAL = By.xpath("/html/body/app-root/app-appraisal-coverage/section[2]/app-stepper/mat-horizontal-stepper/div[2]/div[2]/app-appraisal-register/div/div[1]/form/div[2]/div[2]/div[2]/mat-radio-group/mat-radio-button[1]/label/span[1]/span[1]");
	public static final By LOCATOR_DEPOSIT_PRIVATE = By.xpath("/html/body/app-root/app-appraisal-coverage/section[2]/app-stepper/mat-horizontal-stepper/div[2]/div[2]/app-appraisal-register/div/div[1]/form/div[2]/div[2]/div[2]/mat-radio-group/mat-radio-button[2]/label/span[1]/span[1]");
	public static final By LOCATOR_DEPOSIT_EXCLUSIVE = By.xpath("/html/body/app-root/app-appraisal-coverage/section[2]/app-stepper/mat-horizontal-stepper/div[2]/div[2]/app-appraisal-register/div/div[1]/form/div[2]/div[2]/div[2]/mat-radio-group/mat-radio-button[3]/label/span[1]/span[1]");
	public static final By LOCATOR_BUTTON_CONTINUE = ByAngular.buttonText("Continuar");
	// Formulario de facturación
	public static final By LOCATOR_EMAIL = By.id("mat-input-9");
	public static final By LOCATOR_TYPE_DOCUMENT = By.cssSelector("div[class=\"mat-select-arrow ng-tns-c165-20\"]");
	public static final By LOCATOR_CC = By.xpath("//*[@id=\"mat-option-32\"]/span");
	public static final By LOCATOR_NIT = By.xpath("//*[@id=\"mat-option-33\"]/span");
	public static final By LOCATOR_EXTRANJERIA = By.xpath("//*[@id=\"mat-option-34\"]/span");
	public static final By LOCATOR_PASAPORTE = By.xpath("//*[@id=\"mat-option-35\"]/span");
	public static final By LOCATOR_IDENTIFICATION = By.id("mat-input-10");
	public static final By LOCATOR_NAME = By.id("mat-input-11");
	public static final By LOCATOR_PHONE = By.id("mat-input-12");
	public static final By LOCATOR_HOME_VISIT = By.id("mat-slide-toggle-1");
	public static final By LOCATOR_NAME_LASTNAME = By.id("mat-input-21");
	public static final By LOCATOR_PHONE_TWO = By.id("mat-input-22");
	public static final By LOCATOR_EMAIL_TWO = By.id("mat-input-23");
	public static final By LOCATOR_OWNER_NAME = By.id("mat-input-16");
	public static final By LOCATOR_OWNER_PHONE = By.id("mat-input-17");
	public static final By LOCATOR_OWNER_EMAIL = By.id("mat-input-18");
	public static final By LOCATOR_PROCESSING_PERSONAL_DATA = By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]");
	public static final By LOCATOR_PAY = By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-user-info/div/div/form/div[4]/button[2]");
	// Pago y descuento ciencuadras
	public static final By LOCATOR_BOND = By.cssSelector("input[formcontrolname=\"discount\"]");
	public static final By LOCATOR_APLIC = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	public static final By LOCATOR_BUTTON_PAY_FINISH = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	// Datos de pago cliente
	public static final By LOCATOR_COOKIES = ByAngular.buttonText("Aceptar");
	// datos tarjeta debito
	public static final By LOCATOR_DEBIT_CARD = By.xpath("//*[@id=\"mat-radio-3\"]/label/div[1]/div[1]");
	public static final By LOCATOR_HOLDER_NAME_D = By.id("mat-input-11");
	public static final By LOCATOR_CARD_NUMBER_D = By.id("mat-input-13");
	public static final By LOCATOR_MONTH_CARD_D = By.id("mat-input-14");
	public static final By LOCATOR_YEAR_CARD_D = By.id("mat-input-15");
	public static final By LOCATOR_CVV_D = By.id("mat-input-16");
	public static final By LOCATOR_PAYMENT_D = By.xpath("//*[@id=\"formulario_card-debit\"]/div[2]/button");
	// datos tarjeta credito
	public static final By LOCATOR_CREDIT_CARD = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-panel-description/div/div[1]/mat-radio-button/label/div[2]");
	public static final By LOCATOR_HOLDER_NAME_C = By.id("mat-input-5");
	public static final By LOCATOR_CARD_NUMBER_C = By.id("mat-input-7");
	public static final By LOCATOR_MONTH_CARD_C = By.id("mat-input-8");
	public static final By LOCATOR_YEAR_CARD_C = By.id("mat-input-9");
	public static final By LOCATOR_CVVC = By.id("mat-input-10");
	public static final By LOCATOR_DUES = ByAngularBinding.id("mat-select-3");
	public static final By LOCATOR_FIVE = ByAngularOptions.id("mat-option-6");
	public static final By LOCATOR_PAYMENT_C = By.xpath("//*[@id=\"formulario_card-credit\"]/div[2]/button");
	// datos PSE
	public static final By LOCATOR_PSE = By.xpath("//*[@id=\"mat-radio-4\"]/label/div[1]/div[1]");
	public static final By LOCATOR_TYPE_DOCUMENT_P = By.name("documentType");
	public static final By LOCATOR_CC_P = ByAngularOptions.id("mat-option-38");
	public static final By LOCATOR_CE = ByAngularOptions.id("mat-option-39");
	public static final By LOCATOR_CP = ByAngularOptions.id("mat-option-40");
	public static final By LOCATOR_NIT_P = ByAngularOptions.id("mat-option-41");
	public static final By LOCATOR_TI = ByAngularOptions.id("mat-option-42");
	public static final By LOCATOR_TYPE_PERSON = By.name("personType");
	public static final By LOCATOR_PN = ByAngularOptions.id("mat-option-0");
	public static final By LOCATOR_PJ = ByAngularOptions.id("mat-option-1");
	public static final By LOCATOR_BANK = By.name("bank");
	public static final By LOCATOR_ITAU = ByAngularOptions.id("mat-option-53");
	public static final By LOCATOR_CAJA_SOCIAL = ByAngularOptions.id("mat-option-46");
	public static final By LOCATOR_PAYMENT_P = By.xpath("//*[@id=\"pay-pse\"]/form/div[2]/button");
	// datos de pago PSE
	public static final By LOCATOR_PSE_CHECK_POLICY = By.id("chkPolicy");
	public static final By LOCATOR_PSE_CHECK_TERMS = By.id("chkTerminos");
	public static final By LOCATOR_FOLLOW = By.id("btnIngresar");
}

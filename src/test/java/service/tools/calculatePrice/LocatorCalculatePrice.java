package service.tools.calculatePrice;

import org.openqa.selenium.By;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularBinding;
import com.paulhammant.ngwebdriver.ByAngularOptions;

import service.tools.certificateRequest.LocatorCertificateRequet;

public class LocatorCalculatePrice extends LocatorCertificateRequet {

	// Formulario ubicación del inmueble
	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_BUTTON_CALCULA_PRICE = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	public static final By LOCATOR_CITY = By.id("mat-input-0");
	public static final By LOCATOR_ADDRESS = By.id("mat-input-1");
	public static final By LOCATOR_ADDRESS_ADD = By.id("mat-input-2");
	public static final By LOCATOR_CHECK_MAP = By.id("mat-checkbox-1");
	public static final By LOCATOR_BUTTON_CONTINUE = By.cssSelector("button[class=\"btn button rounded secondary\"]");
	// Información del inmueble
	public static final By LOCATOR_TYPE_PROPERTY = By.id("mat-select-0");
	public static final By LOCATOR_APARTMENT = By.id("mat-option-0");
	public static final By LOCATOR_HOUSE = By.id("mat-option-1");
	public static final By LOCATOR_RENT = By.id("mat-button-toggle-2-button");
	public static final By LOCATOR_SALE = By.id("mat-button-toggle-3-button");
	public static final By LOCATOR_STRATUM_1 = By.id("mat-button-toggle-4-button");
	public static final By LOCATOR_STRATUM_2 = By.id("mat-button-toggle-5-button");
	public static final By LOCATOR_STRATUM_3 = By.id("mat-button-toggle-6-button");
	public static final By LOCATOR_STRATUM_4 = By.id("mat-button-toggle-7-button");
	public static final By LOCATOR_STRATUM_5 = By.id("mat-button-toggle-8-button");
	public static final By LOCATOR_STRATUM_6 = By.id("mat-button-toggle-9-button");
	public static final By LOCATOR_AREA = By.id("mat-input-3");
	public static final By LOCATOR_ANTIQUITY = By.id("mat-input-4");
	public static final By LOCATOR_PARKING_LESS = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[1]/div/button[1]");
	public static final By LOCATOR_PARKING_MORE = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[1]/div/button[2]");
	public static final By LOCATOR_TOILETS_LESS = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[2]/div/button[1]");
	public static final By LOCATOR_TOILETS_MORE = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[2]/div/button[2]");
	public static final By LOCATOR_ROOMS_LESS = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[3]/div/button[1]");
	public static final By LOCATOR_ROOMS_MORE = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[3]/div/button[2]");
	public static final By LOCATOR_BALCONIES_MORE = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[4]/div/button[2]");
	public static final By LOCATOR_TERRACE_MORE = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[5]/div/button[2]");
	public static final By LOCATOR_DEPOSIT_MORE = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[6]/div/button[2]");
	public static final By LOCATOR_ELEVATORS_MORE = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[7]/div/button[2]");
	public static final By LOCATOR_BUTTON_CONTINUE_TWO = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[2]");
	// Formulario paga el precio en linea
	public static final By LOCATOR_NAMES = By.id("mat-input-12");
	public static final By LOCATOR_SURNAMES = By.id("mat-input-13");
	public static final By LOCATOR_IDENTITY_DOCUMENT = By.id("mat-select-2");
	public static final By LOCATOR_CC = By.id("mat-option-2");
	public static final By LOCATOR_NIT = By.id("mat-option-3");
	public static final By LOCATOR_CE = By.id("mat-option-4");
	public static final By LOCATOR_ID_NUMBER = By.id("mat-input-14");
	public static final By LOCATOR_EMAIL = By.id("mat-input-15");
	public static final By LOCATOR_CONFIRM_EMAIL = By.id("mat-input-16");
	public static final By LOCATOR_PHONE = By.id("mat-input-17");
	public static final By LOCATOR_BUTTON_CONTINUE_THREE = By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[2]");
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
	public static final By LOCATOR_CVVD = By.id("mat-input-16");
	public static final By LOCATOR_PAYMENT_D = By.xpath("//*[@id=\"formulario_card-debit\"]/div[2]/button");
	// datos tarjeta credito
	public static final By LOCATOR_CREDIT_CARD = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-panel-description/div/div[1]/mat-radio-button/label/div[2]");
	public static final By LOCATOR_HOLDER_NAME_C = By.id("mat-input-5");
	public static final By LOCATOR_CARD_NUMBER_C = By.id("mat-input-7");
	public static final By LOCATOR_MONTH_CARDC = By.id("mat-input-8");
	public static final By LOCATOR_YEAR_CARD_C = By.id("mat-input-9");
	public static final By LOCATOR_CVVC = By.id("mat-input-10");
	public static final By LOCATOR_DUES = ByAngularBinding.id("mat-select-3");
	public static final By LOCATOR_FIVE = ByAngularOptions.id("mat-option-6");
	public static final By LOCATOR_PAYMENTC = By.xpath("//*[@id=\"formulario_card-credit\"]/div[2]/button");
	// datos PSE
	public static final By LOCATOR_PSE = By.id("mat-radio-4");
	public static final By LOCATOR_TYPE_DOCUMENT_P = By.name("documentType");
	public static final By LOCATOR_CC_P = ByAngularOptions.id("mat-option-38");
	public static final By LOCATOR_CE_P = ByAngularOptions.id("mat-option-39");
	public static final By LOCATOR_CP_P = ByAngularOptions.id("mat-option-40");
	public static final By LOCATOR_NIT_P = ByAngularOptions.id("mat-option-41");
	public static final By LOCATOR_TI_P = ByAngularOptions.id("mat-option-42");
	public static final By LOCATOR_TYPE_PERSON = By.name("personType");
	public static final By LOCATOR_PN = ByAngularOptions.id("mat-option-0");
	public static final By LOCATOR_PJ = ByAngularOptions.id("mat-option-1");
	public static final By LOCATOR_BANK = By.name("bank");
	public static final By LOCATOR_ITAU = ByAngularOptions.id("mat-option-53");
	public static final By LOCATOR_CAJA_SOCIAL = ByAngularOptions.id("mat-option-46");
	public static final By LOCATOR_PAYMENT_P = By.xpath("//*[@id=\"pay-pse\"]/form/div[2]/button");
}

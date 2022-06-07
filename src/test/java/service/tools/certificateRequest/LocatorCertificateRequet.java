package service.tools.certificateRequest;

import org.openqa.selenium.By;

public class LocatorCertificateRequet {
	
	//Solicita tu certificado 
	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_BUTTON_CERTIFICATE_REQUEST = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[3]/div/div[1]/div/div[2]/a");
	public static final By LOCATOR_ZONE_SELECT = By.id("mat-input-0");
	public static final By LOCATOR_PROPERTY_REGISTRATION = By.id("mat-input-2");
	public static final By LOCATOR_RECAPCHAT = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	public static final By LOCATOR_CAPTCHA = By.id("recaptcha-anchor");
	public static final By LOCATOR_BUTTON_CONTINUE = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/ccct-query-zone/div/ccct-query-zone-search/div/form/div[4]/button[2]");
	
}

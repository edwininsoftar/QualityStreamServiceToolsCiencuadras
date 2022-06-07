package service.tools.certificateRequest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasicData;
import base.BasicWrap;

public class CertificateRequestPage extends BasicWrap{
	
	
	
	public CertificateRequestPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void inquiryForm() throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorCertificateRequet.LOCATOR_X);
			click(LocatorCertificateRequet.LOCATOR_BUTTON_CERTIFICATE_REQUEST);
			Thread.sleep(5000);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			WebElement zn = driver.findElement(LocatorCertificateRequet.LOCATOR_ZONE_SELECT);
			Select sel = new Select(zn);
			sel.selectByVisibleText(BasicData.ZONE);
			type(BasicData.PROPERTY_REGISTRATION,LocatorCertificateRequet.LOCATOR_PROPERTY_REGISTRATION);
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
			ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(LocatorCertificateRequet.LOCATOR_RECAPCHAT));
			ewait.until(ExpectedConditions.elementToBeClickable(LocatorCertificateRequet.LOCATOR_CAPTCHA )).click();
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			click(LocatorCertificateRequet.LOCATOR_BUTTON_CONTINUE);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}

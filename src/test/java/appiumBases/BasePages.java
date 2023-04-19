package appiumBases;

import java.util.List;

import org.openqa.selenium.By;

import appiumCore.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BasePages {

	
	public List<MobileElement> returnBotaoOpcaoClique(String valor) {
		return DriverFactory.getDriver().findElements(By.className(valor));	
	}

	
	public List<MobileElement> returnBotaoOpcaoCliquee(String valor) {
		return DriverFactory.getDriver().findElements(By.className(valor));	
	}

	
	public void escreveSMS(String valor, String sms) {
		DriverFactory.getDriver().findElementByAccessibilityId(valor).sendKeys(sms);
	
	}

	
	public void escreveNumero() {
		DriverFactory.getDriver().pressKey(new KeyEvent(AndroidKey.BUTTON_10));
	}
	
	
}

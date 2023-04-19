package appiumCore;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {

		if (driver == null) {
			try {
				createDriver();
			} catch (MalformedURLException e) {

				e.printStackTrace();
			}
		}

		return driver;
	}

	private static void createDriver() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "Pixel_2");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
	    desiredCapabilities.setCapability("isheadless", true);


		desiredCapabilities.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\PC\\eclipse-workspace\\Automacao_PedePronto_Appium\\src\\test\\resources\\app-debug.apk");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		
	}


	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}

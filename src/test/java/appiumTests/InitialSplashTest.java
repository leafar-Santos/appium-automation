package appiumTests;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import appiumBases.BaseTests;
import appiumCore.DriverFactory;
import appiumPages.InitialSplashPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InitialSplashTest extends BaseTests {

	private AndroidDriver<MobileElement> driver;
	private InitialSplashPage initialSplahs = new InitialSplashPage();

	@Before
	public void startaAppium() throws MalformedURLException {

		driver = DriverFactory.getDriver();
	}

	/*
	 * @After public void quitAppium() { DriverFactory.killDriver(); }
	 */

	@Test
	public void _01mustValidateSplashFirstAccess() throws MalformedURLException, InterruptedException {

		initialSplahs.acessAndValidFirtScreenSplash();

	}

	@Test
	public void _02mustValidateSplashSecondScreen() throws InterruptedException {

		initialSplahs.acessAndValidSecondScreenSplash();
	}

	@Test
	public void _03mustValidateSplashThirdScreen() throws InterruptedException {

		initialSplahs.acessAndValidThirdScreenSplash();
	}

	@Test
	public void _04mustValidateSplashFourthScreen() throws InterruptedException {

		initialSplahs.acessAndValidFourthScreenSplash();
	}

}

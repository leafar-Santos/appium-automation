package appiumBases;

import java.util.List;

import org.junit.After;

import appiumCore.DriverFactory;
import io.appium.java_client.MobileElement;

public class BaseTests extends BasePages {


	public void splash() throws InterruptedException {
		
	
			Thread.sleep(3000);

			List<MobileElement> elementsFirstScreen = returnBotaoOpcaoClique("android.view.View");
			elementsFirstScreen.get(1).click();

			Thread.sleep(1000);
			List<MobileElement> elementsSecondScreen = returnBotaoOpcaoClique("android.view.View");
			elementsSecondScreen.get(3).click();
			
			Thread.sleep(1000);
			List<MobileElement> elementsThirdScreen = returnBotaoOpcaoClique("android.view.View");
			elementsThirdScreen.get(3).click();
			
			Thread.sleep(1000);
			List<MobileElement> elementsFourthScreen = returnBotaoOpcaoClique("android.view.View");
			elementsFourthScreen.get(3).click();
	}
	
	
	/*
	
	@After
	public void quitAppium() {
		DriverFactory.killDriver();
	
	}
	
	*/
}

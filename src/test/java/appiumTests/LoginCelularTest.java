package appiumTests;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runners.MethodSorters;

import appiumBases.BasePages;
import appiumBases.BaseTests;
import appiumCore.DriverFactory;
import appiumPages.LoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginCelularTest extends BaseTests {
	
	private AndroidDriver<MobileElement> driver;
	
	BasePages Login = new BasePages();
	public static String PHONE_NUMBER = "11999999996";
	private static String SMS = "123456";
	private LoginPage login = new LoginPage(); 
	
	
	@Before
	public void startaAppium() throws MalformedURLException, InterruptedException {

		driver = DriverFactory.getDriver();
		splash();
	}

	
	@Test
	public void _01mustClickLoginWithMobileNumber()  throws MalformedURLException, InterruptedException {
			login.clickLoginButton();
	}
	
	@Test

	public void _02mustFillPhoneNumber()  throws MalformedURLException, InterruptedException {
			login. writePhoneNumber(PHONE_NUMBER);
	}
	
	@Test
	public void _03mustVerifySmsCode() throws MalformedURLException, InterruptedException {
		
		Thread.sleep(5000);	
		List<MobileElement> elementsSmsScreen = returnBotaoOpcaoClique("android.view.View");
	
		Assertions.assertEquals("Digite o código de verificação",elementsSmsScreen.get(1).getTagName());
		Assertions.assertEquals("código enviado para  (11) 9 9999-9996",elementsSmsScreen.get(2).getTagName());
		Assertions.assertEquals("O SMS pode demorar alguns segundos para chegar.",elementsSmsScreen.get(3).getTagName());
		Assertions.assertEquals("Aguarde.",elementsSmsScreen.get(4).getTagName());
		
		
		for(MobileElement elementos:  elementsSmsScreen){
			System.out.println(elementos.getTagName());
		}
				
		 ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		 ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		 ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		 ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		 ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
		 ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_6));
	}

	
}

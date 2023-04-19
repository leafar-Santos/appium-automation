package appiumPages;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import appiumBases.BasePages;
import io.appium.java_client.MobileElement;
public class LoginPage extends BasePages {

				
	public void clickLoginButton() throws InterruptedException {
		
		Thread.sleep(3000);	
		List<MobileElement> elementsLoginScreen = returnBotaoOpcaoClique("android.view.View");
	
		Assertions.assertEquals("Entre ou crie uma conta para continuar", elementsLoginScreen.get(0).getTagName());
		Assertions.assertEquals("Continuar com o celular", elementsLoginScreen.get(1).getTagName());	
		elementsLoginScreen.get(1).click();
		
	}

	
	public void writePhoneNumber(String phone) throws InterruptedException {
		Thread.sleep(3000);	
		List<MobileElement> elementsPhoneScreen = returnBotaoOpcaoClique("android.view.View");
		
		/*
		for(MobileElement elementos:  elementsSmsScreen){
			System.out.println(elementos.getText());
			System.out.println(elementos.getTagName());
		}
		*/
		
		Assertions.assertEquals("Vamos lá, qual o seu número de celular?", elementsPhoneScreen.get(1).getTagName());
		Assertions.assertEquals("Você vai receber um código de 6 dígitos para verificação.", elementsPhoneScreen.get(2).getTagName());	
		Assertions.assertEquals("Celular", elementsPhoneScreen.get(3).getTagName());	
		
		
		List<MobileElement> elementsTextFieldPhoneScreen = returnBotaoOpcaoClique("android.widget.EditText");
		
		for(MobileElement elementos:  elementsTextFieldPhoneScreen){
			
			System.out.println(elementos.getTagName());
		}
		
		
		Assertions.assertEquals("(00)   |   00000-0000", elementsTextFieldPhoneScreen.get(0).getText());
	
		elementsTextFieldPhoneScreen.get(0).click();
		elementsTextFieldPhoneScreen.get(0).clear();
		elementsTextFieldPhoneScreen.get(0).sendKeys(phone);
		phone = elementsTextFieldPhoneScreen.get(0).getText();
		//Assertions.assertEquals(phone, "phone");
		
		
		List<MobileElement> elementsButtonScreen = returnBotaoOpcaoClique("android.widget.Button");		
		Assertions.assertEquals("Receber código por SMS", elementsButtonScreen.get(1).getTagName());
		
		elementsButtonScreen.get(1).click();
	
		
	}
	
	public void writeSms(String sms) throws InterruptedException {
		Thread.sleep(5000);	
		List<MobileElement> elementsSmsScreen = returnBotaoOpcaoClique("android.view.View");
		
		
		for(MobileElement elementos:  elementsSmsScreen){
	
			System.out.println(elementos.getTagName());
		}
	
		
		Assertions.assertEquals("Digite o código de verificação",elementsSmsScreen.get(1).getTagName());
		Assertions.assertEquals("código enviado para  (11) 9 9999-9999",elementsSmsScreen.get(2).getTagName());
		Assertions.assertEquals("O SMS pode demorar alguns segundos para chegar.",elementsSmsScreen.get(3).getTagName());
		Assertions.assertEquals("Aguarde.",elementsSmsScreen.get(4).getTagName());
	
		
	}
	
	
}

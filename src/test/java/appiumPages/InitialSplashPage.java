package appiumPages;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import appiumBases.BasePages;
import io.appium.java_client.MobileElement;

public class InitialSplashPage extends BasePages {

	public void acessAndValidFirtScreenSplash() throws InterruptedException {
		
		Thread.sleep(3000);	
		List<MobileElement> elementsFirstScreen = returnBotaoOpcaoClique("android.view.View");
		Assertions.assertEquals("CONHEÇA O APLICATIVO QUE VAI MUDAR A FORMA COMO VOCÊ PEDE!",
				elementsFirstScreen.get(0).getTagName());
		Assertions.assertEquals("Vamos lá", elementsFirstScreen.get(1).getTagName());
		elementsFirstScreen.get(1).click();
	}
	
	public void acessAndValidSecondScreenSplash() throws InterruptedException {
		
		Thread.sleep(5000);
		List<MobileElement> elementsSecondScreen = returnBotaoOpcaoClique("android.view.View");

		Assertions.assertEquals("Aqui você fura fila nos shoppings e eventos", elementsSecondScreen.get(0).getTagName());
		Assertions.assertEquals("Estamos falando da elite, tá?", elementsSecondScreen.get(1).getTagName());
		Assertions.assertEquals(
				"Na Pede Pronto você encontrará Shoppings, praças de alimentação e eventos próximos a você. É só pedir e pronto!",
				elementsSecondScreen.get(2).getTagName());
		Assertions.assertEquals("Próximo", elementsSecondScreen.get(3).getTagName());		
		elementsSecondScreen.get(3).click();
		
	}
	
	
	public void acessAndValidThirdScreenSplash() throws InterruptedException {
		
		Thread.sleep(5000);
		List<MobileElement> elementsThirdScreen = returnBotaoOpcaoClique("android.view.View");

		Assertions.assertEquals("Receba seu pedido sem sair de casa", elementsThirdScreen.get(0).getTagName());
		Assertions.assertEquals("Escolha o restaurante que mais gosta e faça o seu pedido.",
				elementsThirdScreen.get(1).getTagName());
		Assertions.assertEquals("Sua comidinha em instantes na sua casa sem complicações.",
				elementsThirdScreen.get(2).getTagName());
		Assertions.assertEquals("Próximo", elementsThirdScreen.get(3).getTagName());
		elementsThirdScreen.get(3).click();
		
	}

	
	public void acessAndValidFourthScreenSplash() throws InterruptedException {
		
		Thread.sleep(5000);
		List<MobileElement> elementsFourthScreen = returnBotaoOpcaoClique("android.view.View");

		Assertions.assertEquals("Pagar seu pedido ficou mais fácil agora!", elementsFourthScreen.get(0).getTagName());
		Assertions.assertEquals("Faça o pagamento por QR Code.", elementsFourthScreen.get(1).getTagName());
		Assertions.assertEquals(
				"Fácil assim! Você também pode utilizar a Pede Pronto como Carteira Digital! (Confira os estabelecimentos participantes)",
				elementsFourthScreen.get(2).getTagName());
		Assertions.assertEquals("Próximo", elementsFourthScreen.get(3).getTagName());

		elementsFourthScreen.get(3).click();
	
	}
	
}

package br.accenture.page;

import br.accenture.runners.BasePage;

public class SelectPriceOptionPage extends BasePage {

	public void setSilver() {
		clicarCheckXpatch("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
	}
	
	public void setNext() {
		clicarBotao("nextsendquote");
	}
	
}

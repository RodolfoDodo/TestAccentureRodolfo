package br.accenture.runners;

import static br.accenture.runners.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {


	public void escrever(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	
	/********* Radio e Check ************/
	
	public void clicarRadio(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarRadio(String id) {
		clicarRadio(By.id(id));
	}
	

	public void clicarCheck(String name) {
		getDriver().findElement(By.className(name)).click();
	}
	
	public void clicarCheckXpatch(String name) {
		getDriver().findElement(By.xpath(name)).click();
	}

	/********* Combo ************/
	
	public void selecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	/********* Botao ************/
	
	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}
	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}
	
	public void clicarBotaoPorTexto(String texto){
		clicarBotao(By.xpath("//button[.='"+texto+"']"));
	}
	
	/********* Textos ************/
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
	
	public  String obterMensagemXpacth(String texto) {
		return obterTexto(By.xpath(texto));
	}
	
}
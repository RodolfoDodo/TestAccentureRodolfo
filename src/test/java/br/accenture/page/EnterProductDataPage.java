package br.accenture.page;

import org.openqa.selenium.By;

import br.accenture.runners.BasePage;

public class EnterProductDataPage extends BasePage{

	
	public String obterContadorProduct(){
		return obterTexto(By.xpath("//*[@id=\"enterproductdata\"]/span"));
	}
	
	public String obterValor() {
		return obterTexto("counter");
	}
	
	public void setStartDate(String date) {
		escrever("startdate", date);
	}
	
	public void setInsuranceSum(String insurancesum) {
		selecionarCombo("insurancesum", insurancesum);
	}
	
	public void setMeritRating(String meritrating) {
		selecionarCombo("meritrating", meritrating);
	}
	
	public void setDamageInsurance(String damageinsurance) {
		selecionarCombo("damageinsurance", damageinsurance);
	}
	
	public void setProductions() {
		clicarCheckXpatch("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]");
	}
	
	
	public void setCourtesyCar(String courtesycar) {
		selecionarCombo("courtesycar", courtesycar);
	}
	
	public void setNextSelectPriceOption() {
		clicarBotao("nextselectpriceoption");
	}
}

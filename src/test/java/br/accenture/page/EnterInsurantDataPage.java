package br.accenture.page;

import org.openqa.selenium.By;

import br.accenture.runners.BasePage;

public class EnterInsurantDataPage extends BasePage{


	public String obterContadorInsurant(){
		return obterTexto(By.xpath("//*[@id=\"enterinsurantdata\"]/span"));
	}
	
	public void setFistName(String firstName) {
		escrever("firstname", firstName);
	}
	
	public void setLast (String lastName) {
		escrever("lastname", lastName);
	}
	
	public void setDateofBirth(String birth) {
		escrever("birthdate", birth);
	}
	

	public void setGender() {
		clicarCheckXpatch("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
	}
	
	public void setStreetAddress(String address) {
		escrever("streetaddress", address);
	}
	
	public void setCountry(String country) {
		selecionarCombo("country", country);
	}
	
	public void setZipCode (String zipcode) {
		escrever("zipcode", zipcode);
	}
	
	public void setCity(String city) {
		escrever("city", city);
	}
	
	public void setOccupation(String occupation) {
		selecionarCombo("occupation", occupation);
	}
	
	public void setHobbies() {
		clicarCheckXpatch("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]");
	}
	
	public void setWebsite(String website) {
		escrever("website", website);
	}
	
	public void open() {
		subirArquivo();
	}
	
	public void nextnextenterproductdata() {
		clicarBotao("nextenterproductdata");
	}
}

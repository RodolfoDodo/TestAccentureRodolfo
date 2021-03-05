package br.accenture.page;

import org.openqa.selenium.By;

import br.accenture.runners.BasePage;

public class EnterVehicleDataPage extends BasePage{

	public String obterContadorVehicle(){
		return obterTexto(By.className("counter"));
	}
	
	public void setMake(String marca) {
		selecionarCombo("make", marca);
	}
	
	public void setModel(String model) {
		selecionarCombo("model", model);
	}
	
	public void setCapacity (String capacity) {
		escrever("cylindercapacity", capacity);
	}
	
	public void setPerformance (String perfomance) {
		escrever("engineperformance", perfomance);
	}
	

	public void setDatManufacture(String data) {
		escrever("dateofmanufacture", data);
	}
	
	public void setSeats(String seats) {
		selecionarCombo("numberofseats", seats);
	}
	
	public void setRightHandDrive() {
		clicarCheck("ideal-radiocheck-label");
	}
	
	public void setSeatsof(String seatsof) {
		selecionarCombo("numberofseatsmotorcycle", seatsof);
	}
	
	public void setType(String type) {
		selecionarCombo("fuel", type);
	}
	
	public void setPayload(String payload) {
		escrever("payload", payload);
	}
	
	public void setWeight(String weight) {
		escrever("totalweight", weight);
	}
	
	public void setPrice (String price) {
		escrever("listprice", price);
	}
	
	public void setNumber(String number) {
		escrever("licenseplatenumber", number);
	}
	
	public void setMileage(String millage) {
		escrever("annualmileage", millage);
	}
	
	public void setNext() {
		clicarBotao("nextenterinsurantdata");
	}
	
	
}

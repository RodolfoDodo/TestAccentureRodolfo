package br.accenture.steps;



import org.junit.Assert;

import br.accenture.page.EnterInsurantDataPage;
import br.accenture.page.EnterProductDataPage;
import br.accenture.page.EnterVehicleDataPage;
import br.accenture.page.SelectPriceOptionPage;
import br.accenture.page.SendQuotePage;
import br.accenture.runners.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TricentisStep {

	EnterVehicleDataPage enter = new EnterVehicleDataPage();

	EnterInsurantDataPage insurant = new EnterInsurantDataPage();

	EnterProductDataPage product = new EnterProductDataPage();

	SelectPriceOptionPage select = new SelectPriceOptionPage();

	SendQuotePage send = new SendQuotePage();

	@Given("Entra no site {string}")
	public void entra_no_site(String site) {
		DriverFactory.getDriver().get(site);
	}

	@Given("Preencher o formulario aba Enter Vehicle Data e precione next")
	public void preencher_o_formulario_aba_Enter_Vehicle_Data_e_precione_next() {
		enter.setMake("Ford");
		enter.setModel("Moped");
		enter.setCapacity("120");
		enter.setPerformance("55");
		enter.setDatManufacture("01/04/2021");
		enter.setSeats("6");
		enter.setRightHandDrive();
		enter.setSeatsof("3");
		enter.setType("Diesel");
		enter.setPayload("150");
		enter.setWeight("200");
		enter.setPrice("3000");
		enter.setNumber("88");
		enter.setMileage("150");
		enter.setNext();
	}

	@Given("Preencher o formulario aba Enter Insurant Data e precione next")
	public void preencher_o_formulario_aba_Enter_Insurant_Data_e_precione_next() {
		insurant.setFistName("Lucas");
		insurant.setLast("Pereira");
		insurant.setDateofBirth("01/05/1994");
		insurant.setGender();
		insurant.setStreetAddress("Rua Belém");
		insurant.setCountry("Afghanistan");
		insurant.setZipCode("5584884");
		insurant.setCity("Santa luzia");
		insurant.setOccupation("Farmer");
		insurant.setHobbies();
		insurant.setWebsite("https://www.linkedin.com/in/rodolfo-farley-1288a9140/");
		insurant.nextnextenterproductdata();

	}

	@Given("Preencher o formulario aba Enter Product Data e precione nex")
	public void preencher_o_formulario_aba_Enter_Product_Data_e_precione_nex() {
		product.setStartDate("04/09/2021");
		product.setInsuranceSum("5.000.000,00");
		product.setMeritRating("Bonus 1");
		product.setDamageInsurance("No Coverage");
		product.setProductions();
		product.setCourtesyCar("No");
		product.setNextSelectPriceOption();
	}

	@Given("Preencher o formulario aba Select Price Option e precione next")
	public void preencher_o_formulario_aba_Select_Price_Option_e_precione_next() throws InterruptedException {
		select.setSilver();
		select.setNext();
	}

	@Given("Preencher o formulario aba Send Quote e precione next")
	public void preencher_o_formulario_aba_Send_Quote_e_precione_next() {
		send.setEmail("sdfjsdo@gmail.com");
		send.setPhone("315456445684");
		send.setUsername("Lucas");
		send.setPassword("Dodo@940808");
		send.setConfirmPassword("Dodo@940808");
		send.setComments("ddsffsdsd");
		send.setSendEmail();
	}

	@Given("Verificar a mensagem {string} na tela")
	public void verificar_a_mensagem_na_tela(String mensagem) {
		Assert.assertEquals(mensagem, send.obterMensagem());
		send.setOk();
	}

	@When("Preencher o formulario aba Enter Vehicle Data e next {string} {string} {string} {string} {string} {string} {string} {string}")
	public void preencher_o_formulario_aba_Enter_Vehicle_Data_e_next(String make, String performance,
			String manufacture, String seats, String type, String price, String number, String milege) {

		enter.setMake(make);
		enter.setPerformance(performance);
		enter.setDatManufacture(manufacture);
		enter.setSeats(seats);
		enter.setType(type);
		enter.setPrice(price);
		enter.setNumber(number);
		enter.setMileage(milege);
		enter.setNext();
	}

	@When("Preencher o formulario aba Enter Insurant Data e next {string} {string} {string} {string} {string} {string} {string} {string}")
	public void preencher_o_formulario_aba_Enter_Insurant_Data_e_next(String nome, String sobre, String birth,
			String gender, String address, String country, String code, String city) {

		insurant.setFistName(nome);
		insurant.setLast(sobre);
		insurant.setDateofBirth(birth);
		insurant.setGender();
		insurant.setStreetAddress(address);
		insurant.setCountry(country);
		insurant.setZipCode(code);
		insurant.setCity(city);

	}

	@When("Preencher o formulario aba Enter Insurant Data e next {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void preencher_o_formulario_aba_Enter_Insurant_Data_e_next(String nome, String sobre, String birth,
			String gender, String address, String country, String code, String city, String occupation, String hobbies,
			String website) {

		insurant.setFistName(nome);
		insurant.setLast(sobre);
		insurant.setDateofBirth(birth);
		insurant.setGender();
		insurant.setStreetAddress(address);
		insurant.setCountry(country);
		insurant.setZipCode(code);
		insurant.setCity(city);
		insurant.setOccupation(occupation);
		insurant.setHobbies();
		insurant.setWebsite(website);
		insurant.nextnextenterproductdata();
	}

	@When("Preencher o formulario aba Enter Product Data e nex {string} {string} {string} {string} {string} {string}")
	public void preencher_o_formulario_aba_Enter_Product_Data_e_nex(String date, String sum, String rating,
			String insurance, String products, String car) {

		product.setStartDate(date);
		product.setInsuranceSum(sum);
		product.setMeritRating(rating);
		product.setDamageInsurance(insurance);
		product.setProductions();
		product.setCourtesyCar(car);
		product.setNextSelectPriceOption();
	}

	@When("Preencher o formulario aba Send Quote e precione next {string} {string} {string} {string} {string} {string}")
	public void preencher_o_formulario_aba_Send_Quote_e_precione_next(String email, String phone, String userName,
			String password, String confirm, String comments) {

		send.setEmail(email);
		send.setPhone(phone);
		send.setUsername(userName);
		send.setPassword(password);
		send.setConfirmPassword(confirm);
		send.setComments(comments);
		send.setSendEmail();
	}

	@Given("Preencher o formulario Enter Vehicle Data e precione next")
	public void preencher_o_formulario_Enter_Vehicle_Data_e_precione_next(DataTable table) {

		enter.setMake(table.cell(1, 0));
		enter.setPerformance(table.cell(1, 1));
		enter.setDatManufacture(table.cell(1, 2));
		enter.setSeats(table.cell(1, 3));
		enter.setType(table.cell(1, 4));
		enter.setPrice(table.cell(1, 5));
		enter.setNumber(table.cell(1, 6));
		enter.setMileage(table.cell(1, 6));
		enter.setNext();
	}

	@Given("Preencher o formulario Enter Insurant Data e precione next")
	public void preencher_o_formulario_Enter_Insurant_Data_e_precione_next(DataTable table) {

		insurant.setFistName(table.cell(1, 0));
		insurant.setLast(table.cell(1, 1));
		insurant.setDateofBirth(table.cell(1, 2));
		insurant.setGender();
		insurant.setStreetAddress(table.cell(1, 3));
		insurant.setCountry(table.cell(1, 5));
		insurant.setZipCode(table.cell(1, 6));
		insurant.setCity(table.cell(1, 7));
		insurant.setOccupation(table.cell(1, 8));
		insurant.setHobbies();
		insurant.setWebsite(table.cell(1, 10));
		insurant.nextnextenterproductdata();
	}

	@Given("Preencher o formulario Enter Product Data e precione nex")
	public void preencher_o_formulario_Enter_Product_Data_e_precione_nex(DataTable table) {

		product.setStartDate(table.cell(1, 0));
		product.setInsuranceSum(table.cell(1, 1));
		product.setMeritRating(table.cell(1, 2));
		product.setDamageInsurance(table.cell(1, 3));
		product.setProductions();
		product.setCourtesyCar(table.cell(1, 5));
		product.setNextSelectPriceOption();
	}

	@Given("Preencher o formulario Send Quote e precione next")
	public void preencher_o_formulario_Send_Quote_e_precione_next(DataTable table) {

		send.setEmail(table.cell(1, 0));
		send.setPhone(table.cell(1, 1));
		send.setUsername(table.cell(1, 2));
		send.setPassword(table.cell(1, 3));
		send.setConfirmPassword(table.cell(1, 4));
		send.setComments(table.cell(1, 5));
		send.setSendEmail();
	}

	
}

package br.accenture.page;

import org.openqa.selenium.By;

import br.accenture.runners.BasePage;

public class SendQuotePage extends BasePage{

	public String obterContadorSende(){
		return obterTexto(By.xpath("//*[@id=\"sendquote\"]/span"));
	}
	
	
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setPhone(String phone) {
		escrever("phone", phone);
	}
	
	public void setUsername(String username) {
		escrever("username", username);
	}
	
	public void setPassword(String password) {
		escrever("password", password);
	}
	
	public void setConfirmPassword(String confirmpassword) {
		escrever("confirmpassword", confirmpassword);
	}
	
	public void setComments(String Comments) {
		escrever("Comments", Comments);
	}
	
	
	public void setSendEmail() {
		clicarBotao("sendemail");
	}
	
	public String obterMensagem(){
		return obterTexto(By.xpath("/html/body/div[4]/h2"));
	}
	
	public void setOk() {
		clicarBotaoPorTexto("OK");
	}
	
	
}

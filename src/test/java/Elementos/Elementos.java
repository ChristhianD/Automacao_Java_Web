package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By cookies = By.id("onetrust-accept-btn-handler");
	private By abrasuaconta = By.cssSelector(
			"#gatsby-focus-wrapper > header > div > nav > div.sc-tagGq.ghuiff > div > div > span:nth-child(6) > button");
	private By nome = By.id("nome");
	private By telefone = By.id("celular");
	private By email = By.id("email");
	private By cpf = By.id("cpf");
	private By datadenascimento = By.id("dataNascimento");
	private By checkbox = By.cssSelector(
			"body > div.sc-fqkvVR.eMDHOt > div.sc-dtBdUo.eMbyIA > div > form > div.sc-bXCLTC.bVusLg > label");
	private By btncontinuar = By
			.cssSelector("body > div.sc-fqkvVR.eMDHOt > div.sc-dtBdUo.eMbyIA > div > form > button");
	private By validacao = By.xpath("/html/body/div[3]/div[2]/div/p[1]");

	public By getValidacao() {
		return validacao;
	}

	public By getBtncontinuar() {
		return btncontinuar;
	}

	public By getCheckbox() {
		return checkbox;
	}

	public By getCpf() {
		return cpf;
	}

	public By getNome() {
		return nome;
	}

	public By getTelefone() {
		return telefone;
	}

	public By getEmail() {
		return email;
	}

	public By getDatadenascimento() {
		return datadenascimento;
	}

	public By getAbrasuaconta() {
		return abrasuaconta;
	}

	public By getCookies() {
		return cookies;
	}

}

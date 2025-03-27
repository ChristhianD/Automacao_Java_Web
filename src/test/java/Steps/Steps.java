package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que o usuário acesse a url {string}")
	public void que_o_usuário_acesse_a_url(String string) {
		m.abrirnavegador(string);
	}

	@When("aceitar as definições de cookies")
	public void aceitar_as_definições_de_cookies() {

		m.clicar(e.getCookies());

	}

	@When("clique no botão Abra sua conta")
	public void clique_no_botão_abra_sua_conta() throws InterruptedException {

		m.clicar(e.getAbrasuaconta());
		Thread.sleep(2000);
	}

	@When("preencha o formulário")
	public void preencha_o_formulário() throws InterruptedException, IOException {

		m.preencher(e.getNome(), "Sabrina Milena Campos");
		m.preencher(e.getTelefone(), "(98) 98726-3000");
		m.preencher(e.getEmail(), "sabrina_milena_campos@lins.net.br");
		m.preencher(e.getCpf(), "828.109.271-89");
		m.preencher(e.getDatadenascimento(), "10/01/1971");
		Thread.sleep(2000);
		String formulario = "Formulario";
		m.print("./Evidencia/" + formulario + ".png");
	}

	@When("aceite os termos de Politica de Privacidade")
	public void aceite_os_termos_de_politica_de_privacidade() {

		m.clicar(e.getCheckbox());
	}

	@When("clique no botão continuar")
	public void clique_no_botão_continuar() throws InterruptedException {

		m.clicar(e.getBtncontinuar());
		Thread.sleep(2000);

	}

	@Then("o formulário será enviado com sucesso")
	public void o_formulário_será_enviado_com_sucesso() throws IOException, InterruptedException {

		m.validartexto(e.getValidacao(), "Prontinho! Recebemos os seus dados.");
		String confirmEnvio = "Confirmaçao de envio!";
		m.print("./Evidencia/" + confirmEnvio + ".png");
		Thread.sleep(2000);
		m.quit();
	}
}

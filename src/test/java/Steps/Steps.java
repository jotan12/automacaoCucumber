package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Metodos um = new Metodos();
	Elementos dois = new Elementos();

	@Given("^acesse a pagina do banco inter \"([^\"]*)\"$")
	public void acesse_a_pagina_do_banco_inter(String url) throws Throwable {

		um.abrirNavegador(url);
	}

	@Given("^e clique no botao Abra sua conta$")
	public void e_clique_no_botao_Abra_sua_conta() throws Throwable {
		um.pausa(3000);
		um.click(dois.getBtnAbrasuaconta());
	}

	@When("^preencher os dados$")
	public void preencher_os_dados() throws Throwable {
		um.pausa(5000);
		um.preencher(dois.getCampoNome(), "Joaquim Neto");
		um.preencher(dois.getCampoCelular(), "77991213381");
		um.preencher(dois.getCampoEmail(), "jfsn_theface@hotmail.com");
		um.preencher(dois.getCampoCpf(), "04405532532");
		um.preencher(dois.getCampoDatanascimento(), "12/01/1989");

	}

	@When("^e clicar no check box de autorizacao da politica de privacidade$")
	public void e_clicar_no_check_box_de_autorizacao_da_politica_de_privacidade() throws Throwable {
um.pausa(1000);
um.click(dois.getCheckBox());
	}

	@When("^e clicar no botao continuar$")
	public void e_clicar_no_botao_continuar() throws Throwable {
		um.pausa(1000);
		um.click(dois.getBtnContinuar());
	}

	@Then("^aparecera uma tela para baixar o app pra completar a abertura de conta$")
	public void aparecera_uma_tela_para_baixar_o_app_pra_completar_a_abertura_de_conta() throws Throwable {

	}

}


@tag
Feature: Abertura de conta banco inter
  

  @tag1
  Scenario: Abertura nova conta
    Given acesse a pagina do banco inter "https://www.bancointer.com.br/"
    And e clique no botao Abra sua conta
    When preencher os dados
    And e clicar no check box de autorizacao da politica de privacidade
    And e clicar no botao continuar
    Then aparecera uma tela para baixar o app pra completar a abertura de conta



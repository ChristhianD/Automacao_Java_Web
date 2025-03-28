
@tag
Feature: Abertura de conta 

  @tag1
  Scenario: Preenchimento de formulario e envio com sucesso 
   Given que o usuário acesse a url "https://inter.co/"
  When aceitar as definições de cookies
  And clique no botão Abra sua conta
  And preencha o formulário 
  And aceite os termos de Politica de Privacidade 
  And clique no botão continuar
  Then o formulário será enviado com sucesso 

  

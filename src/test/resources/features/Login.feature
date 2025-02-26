#language: pt
#encoding: UTF-8
#Autor: Antonio Santos

@Login
Funcionalidade: Login

@LoginSucesso
	Cenario: Login com sucesso
		Quando o usuario informar no campo username "antonioSantos"
		E o usuario informar no campo password "Teste0**"
		E o usuario acionar o botao login
		Entao o sistema apresenta o usuario logado "antonioSantos"
		
	@LoginInvalido
	Cenario: Login invalido
		Quando o usuario informar no campo username "adsa"
		E o usuario informar no campo password "sdfsdf"
		E o usuario acionar o botao login
		Entao o sistema apresenta a mensagem de erro de login "Invalid username or password!"
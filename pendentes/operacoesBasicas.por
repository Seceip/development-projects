programa
{
	
	funcao inicio()
	{
		inteiro n1, n2, soma, multiplicacao, divisao, subtracao
		cadeia resposta, calculoFinal

		escreva("Olá, por favor digite o primeiro número.")
		leia(n1)

		escreva("Agora digite o segundo número por favor.")
		leia(n2)

		limpa()
		
		escreva("Digite o tipo de operação matemática básica você deseja fazer. Ex: Somar, Subtrair, Multiplicar, Dividir.")
		leia(resposta)

		se (resposta == "Somar")
		{
			soma = n1+n2
			escreva("Você escolheu somar! Então sua resposta é:", soma)
			}
		senao
			se (resposta == "Subtrair") {
				subtracao = n1-n2
				escreva("Você escolheu subtrair! Então sua resposta é:", subtracao)			
			}
		senao
			se(resposta == "Multiplicar") {
				multiplicacao = n1*n2
				escreva("Você escolheu multiplicar! Então sua resposta é:", multiplicacao)
			}
		senao
			se(resposta == "Dividir") {
				divisao = n1/n2
				escreva("Você escolheu dividir! Então sua resposta é:", divisao)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 525; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
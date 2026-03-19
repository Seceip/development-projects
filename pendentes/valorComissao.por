programa
{
	
	funcao inicio()
	{
		real valorVenda, valorComissao
		
		escreva("Olá, irei calcular sua comissão.!\n")
		
		escreva("Por favor, informe o valor de venda do imóvel: ")
		leia(valorVenda)

		limpa()
		se (valorVenda > 200000){
			escreva("O seu corretor fez uma venda acima dos R$ 200.000,00 e portanto sua comissão será de 6% sobre o valor\n")

			valorComissao = valorVenda*0.06
			
			escreva("Valor de comissão do corretor: ", valorComissao)
		} senao {
			escreva("O seu corretor fez uma venda abaixo ou igual a R$ 200.000,00 e portanto sua comissão será de 4% sobre o valor\n")

			valorComissao = valorVenda*0.04
			
			escreva("Valor de comissão do corretor: ", valorComissao)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
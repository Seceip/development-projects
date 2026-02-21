programa
{
	
	funcao inicio()
	{
		real valorAlcool, valorGasolina
	
		escreva("Olá, vou te mostrar o que está valendo mais a pena no momento, Álcool ou Gasolina.\n")
		
		escreva("\n")
		escreva("\n")
		
		escreva("Qual o valor atual do Álcool? ")
		leia(valorAlcool)

		escreva("Qual o valor atual da Gasolina? ")
		leia(valorGasolina)

		se(valorAlcool/valorGasolina-1 > 0.7){
			escreva("A gasolina está valendo mais a pena no momento!!!")
		} senao {
			escreva("O álcool está valendo mais a pena no momento!!!")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 88; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
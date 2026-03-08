programa
{
	
	funcao inicio()
	{
		inteiro qtdNegativo = 0, operacao
		real k[10000000]
		
		escreva("Olá, informe quantas vezes você quer digitar os valores.")
		leia(operacao)
		
			para(inteiro x = 0; x < operacao; x++)
			{
				escreva("\nInforme os valores.")
				leia(k[x])
				se(k[x] < 0)
				{
					qtdNegativo++
				}
			}
		limpa()

		escreva("A quantidade de n° negativos digitados é de: ", qtdNegativo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Graficos
	inclua biblioteca Util --> u
	funcao inicio()
	{
		inteiro contador, contagemPar = 0, contagemImpar = 0, tamanhoArray = 10
		inteiro numeros[10] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		
		escreva("Digite 10 números.\n")
		
		para (contador = 0; contador < tamanhoArray; contador++) 
		{
			escreva("Digite o ", contador+1, "° número: ")
			leia(numeros[contador])

			se (numeros[contador]%2 == 0){
				contagemPar = contagemPar+1
			} senao {
				contagemImpar = contagemImpar+1
			}
		}

		limpa()
		
		escreva("Quantidade de números ímpares: ", contagemImpar)
		escreva("\n")
		escreva("Quantidade de números pares: ", contagemPar)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 250; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
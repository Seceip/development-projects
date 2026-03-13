programa
{

	funcao inicio()
	{
		inteiro n1 , n2 , i, soma=0, mult = 0

		
		escreva("Olá, Digite o primeiro número!")
		leia (n1)
		limpa()

		escreva("Agora digite o segundo número por favor!")
		leia(n2)
		limpa()

		escreva("A soma sucessiva dos números é de: ")
		
		para (i = 0; i < n1; i++)
		{
			soma += n2
			mult = n1 * n2
		}

		faca 
		{
			escreva(n1, "+") // parei aqui
		} enquanto(mult != soma)

		escreva("\nE o valor final é de: ", soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
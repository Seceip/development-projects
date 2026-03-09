programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Olá, você pode digitar um número para verificar se ele é par ou ímpar?")
		leia(numero)

		limpa()
		
		escreva("Hmm.. estou com dificuldade, aguarde.\n")
		

		se (numero %2 == 0) 
		{
		escreva("O número que você digitou é par.")
		}
		senao
		{
		escreva("O número que você digitou é ímpar.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		real n1, n2, operacao
		escreva("Professora! Que bom que você está aqui, vamos lá, fiquei sabendo que você precisa dividir dois números!")
		escreva("\nOk, digite o primeiro número (Tô de olho se você botar 0 em, 0 é o único número que você não pode colocar.")
		leia(n1)
		limpa()
		escreva("Olha olha em! Coloca o segundo por favor.")
		leia(n2)

		se (n1 != 0 e n2 != 0) 
		{
			operacao = n1 / n2
			escreva("Seu resultado supremo é: ", operacao , " .")
		}
		senao faca
		{
			escreva("Prof Prof, não tenta burlar o sistema.")
			escreva("Digita o primeiro número novamente.")
			leia(n1)
			limpa()
			escreva("Digite o segundo número.")
			leia(n2)
		} enquanto(n1 == 0 ou n2 == 0)
			operacao = n1 / n2
			escreva("Seu resultado supremo é: ", operacao , " .")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 193; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
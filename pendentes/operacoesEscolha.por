programa
{
	
	funcao inicio()
	{
		inteiro n1, n2, operacao
		real resultado

		escreva("Olá, digite dois números e depois escolha uma operação matemática.")
		leia(n1)
		leia(n2)

		escreva("Agora digite a operação que você deseja: \n(1) Somar\t(2) Subtrair\n(3) Multiplicar\t(4) Dividir\n\n")
		leia(operacao)

		escolha(operacao) 
		{
			caso 1: escreva("Você escolheu somar, seu resultado é: ", n1+n2)
			pare
			caso 2: escreva("Você escolheu subtrair, seu resultado é:", n1-n2)
			pare
			caso 3: escreva("Você escolheu multiplicar. seu resultado é:", n1*n2)
			pare
			caso 4: escreva("Você escolheu divisão. seu resultado é:", n1/n2)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 639; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
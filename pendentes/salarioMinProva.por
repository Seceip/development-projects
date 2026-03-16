programa
{
	
	funcao inicio()
	{
		real salario, salarioMinimo, calculo
		escreva("Digite o seu salário por favor, para calcularmos quantos salários mínimos você ganha! (Digite com ponto para valor com centavos.)")
		leia(salario)
		limpa()

		escreva("Digite o salário mínimo atual, para o cálculo. (Digite com ponto para valor com centavos.)")
		leia(salarioMinimo)

		calculo = salario / salarioMinimo

		escreva("\nVocê ganha ", calculo, " de salário mínimo.")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
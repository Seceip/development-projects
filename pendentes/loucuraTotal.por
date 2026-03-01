programa
{
	
	funcao inicio()
	{
		real numeroUm, numeroMenos, n1, n2, resultadoCaso
		inteiro operacao
		numeroMenos = 0
		
		escreva("Neste exercicio, nós vamos fazer duas operações ou mais em um algoritimo!")
		
		escreva("\nDigite o primeiro número!")
		leia(n1)
		limpa()
		
		escreva("Digite o segundo número!")
		leia(n2)
		limpa()

		escreva("\nDigite o tipo de operação que você deseja fazer: \nSoma = 1 \tSubtração = 2 \nDivisão = 3 \tMultiplicação = 4 \n Ou digite qualquer outro número para uma operação especial!")
		leia(operacao)

		escolha (operacao) 
		{
			caso 1:
				resultadoCaso = n1 + n2
				escreva("Você escolheu somar, o resultado é: ", resultadoCaso)
			pare
			
			caso 2:
				resultadoCaso = n1 - n2
				escreva("Você escolheu subtrair, o resultado é:", resultadoCaso)
			pare
			
			caso 3:
				resultadoCaso = n1 / n2
				escreva("Você escolheu dividir, o resultado é:", resultadoCaso)
			pare
			
			caso 4:
				resultadoCaso = n1 * n2
				escreva("Você escolheu multiplicar, o resultado é:", resultadoCaso)
			pare
				caso contrario: 
			faca 
			{
			escreva("\n\nDigite os números que você deseja! Lembre-se que o 0 termina a operação.")
			leia(numeroUm)
			numeroMenos = numeroMenos - numeroUm
				se (numeroUm == 0) 
				{
					escreva("\nA soma de todos os valores foi: ", numeroMenos)
				}
			} enquanto (numeroUm != 0) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
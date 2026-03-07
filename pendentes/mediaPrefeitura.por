programa
{
	
	funcao inicio()
	{
		inteiro operacaoSalario, filhos, somaFilhos, mediaFilhos, operacaoFilhos
		real salario, somaSalario, mediaSalario, maiorSalario, percentual

		somaSalario = 0.00
		maiorSalario = 0.00
		somaFilhos = 0
		percentual = 0
		
		escreva("Olá prefeita Suzan, como a senhora é empenhada! Fiquei sabendo da sua nova pesquisa, deixa eu te ajudar.")
		
		faca {
			escreva("\nDigite os salários da população. Lembre-se que 0 termina a operação.")
			leia(salario)
			somaSalario = somaSalario + salario
			se(salario > maiorSalario e salario != 0 ou salario < 0) 
			{
				maiorSalario = salario
			}
				senao
					se(salario == 100 ou salario == 100.00) 
					{
						percentual = percentual++
					}
						senao
						{
							escreva("Digite um valor maior ou igual a zero por favor!")
						}			
		} enquanto(salario != 0)

		escreva("\nQuantos salários você digitou no total prefeita?")
		leia(operacaoSalario)
		limpa()


		faca {
			escreva("\nDigite o número de filhos que cada casal possui.\n0 termina a operação.")
			leia(filhos)
			somaFilhos = somaFilhos + filhos

			se(filhos < 0) 
			{	
				escreva("Digite um valor maior ou igual a zero por favor!")	
			}
		} enquanto(filhos != 0)

		escreva("Quantos valores você digitou para os filhos?")
		leia(operacaoFilhos)
		limpa()
		
		mediaFilhos = somaFilhos / operacaoFilhos
		mediaSalario = somaSalario / operacaoSalario
		
		escreva("A média de salários da população é de: ", mediaSalario, "R$", "\n E o maior salário é de: ", maiorSalario, "R$")
		escreva("\n A média de filhos da população é de: ", mediaFilhos)
		escreva("\nO percentual de pessoas com salário de R$100,00 é de: ", percentual,"%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 980; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
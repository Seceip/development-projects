programa
{
	
	funcao inicio()
	{
		inteiro h, m, hSuperior, mSuperior, fTotal
		real salarioH, salarioM, salarioHB, salarioMB, descontoH, descontoM, restoH, restoM, percaTotal

		faca 
		{
			escreva("\nDigite a quantidade de homens da empresa.")
			leia(h)

			escreva("Digite a quantidade de mulheres da empresa.")
			leia(m)
			limpa()

			escreva("Por favor, insira a quantidade certa de funcionários, que é 30!")
			fTotal = h + m
			limpa()
			
		} enquanto (fTotal !=30)

		escreva("Quantos funcionários do sexo masculino tem um tempo de casa superior à 15 anos?")
		leia(hSuperior)

		escreva("Quantas funcionárias do sexo feminino tem um tempo de casa superior à 10 anos?")
		leia(mSuperior)
		limpa()

		h = h - hSuperior
		m = m - mSuperior

		escreva("Qual é o salário médio dos homens da empresa?")
		leia(salarioH)

		escreva("Qual é o salário médio das mulheres da empresa?")
		leia(salarioM)

		limpa()

		salarioHB = salarioH / hSuperior
		salarioMB = salarioM / mSuperior

		descontoH = salarioHB * (20 / 100)
		descontoM = salarioMB * (25 / 100)

		restoH = h * 5000.00
		restoM = m * 5000.00

		percaTotal = restoH + restoM + descontoH + descontoM
		
		escreva("\nOs funcionários homens com tempo de casa superior a 15 anos são: ", hSuperior, "\nE o tempo de casa das funcionárias mulheres com tempo de casa superior a 10 anos são de: ", mSuperior, "\nO total de funcionários restantes foi \nH: ", h, "\tM:", m)
		escreva("\n\nO valor creditado aos funcionários homens com tempo superior a 15 anos é de: ", descontoH,"R$", "\nE das funcionárias mulheres com tempo superior a 10 anos é de: ", descontoM,"R$")
		escreva("\n\nO total de dinheiro perdido da empresa é de: ", percaTotal, "R$")
		// prof eu não entendi o que está errado.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1757; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
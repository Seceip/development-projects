programa
{
	
	funcao inicio()
	{
		inteiro continua, operacao, qtdDM, qtdDH
		real altH, altM, altSomaH, altSomaM, maiorAlt, menorAlt, mediaAltM, mediaAltT, mediaTotal

		altSomaH = 0
		altSomaM = 0
		maiorAlt = 0
		menorAlt = 0

		
		faca 
		{
			escreva("Olá, digite (1) para calcular a altura dos homens, ou (2) para a altura das mulheres!")
			leia(operacao)

			se(operacao == 1) 
			{
				faca
				{
					escreva("Digite a altura desejada para o cálculo masculino! Digite 0 para parar.")
					leia(altH)
					altSomaH = altSomaH + altH
						se(altH > maiorAlt e altH != 0) 
						{
							maiorAlt = altH
						}
						senao
							se(altH < maiorAlt e altH != 0)
							{
								menorAlt = altH
							}
				} enquanto(altH != 0)	
			}
			senao
				se(operacao == 2) 
				{
					faca
					{
						escreva("Digite a altura desejada para o cálculo feminino! Digite 0 para parar.")
						leia(altM)
						altSomaM = altSomaM + altM
							se(altM > maiorAlt e altM != 0) 
							{
								maiorAlt = altM
							}
							senao
								se(altM < maiorAlt e altM != 0)
								{
									menorAlt = altM
								}
					} enquanto(altM != 0)
				}
			
			escreva("Por fim, digite 0 se deseja fazer o cálculo, ou continue digitando (1) ou (2) para calcular mais alturas!")
			leia(continua)
		} enquanto(continua != 0)

		escreva("Quantas vezes você digitou a altura dos homens?")
		leia(qtdDH)

		escreva("\nE quantas vezes você digitou a altura das mulheres?")
		leia(qtdDM)

		limpa()

		
		mediaTotal = qtdDH + qtdDM
		mediaAltT = (altSomaM + altSomaH) / mediaTotal
		mediaAltM = altSomaM / qtdDM

		
		
		escreva("A altura média das mulheres somando todas foi de: ", mediaAltM,"m", "\nA média total da turma foi de: ", mediaAltT,"m")
		escreva("\nA maior altura da turma foi: ", maiorAlt, "m", "\nA menor altura da turma foi: ", menorAlt, "m")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 669; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
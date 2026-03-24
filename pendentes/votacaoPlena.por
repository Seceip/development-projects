programa
{
	
	funcao inicio()
	{
		inteiro c1, c2, c3, c4, operacao, nulo, branco

		c1 = 0
		c2 = 0
		c3 = 0
		c4 = 0
		nulo = 0
		branco = 0
		
		escreva("Olá, você está votando em um candidato, considere que: \n\n")

		faca 
		{
		escreva("\nCleitin do Pneu (1) \tShaolin Matador de Porco (2) \nRobson Arco-íris (3) \tAlce Barbáro (4) \nPara voto nulo digite (5) \tPara voto em branco digite (6) \nDigite (0) para parar de votar.")
		leia(operacao)
		limpa()

		escolha (operacao)
		{
			caso 1:
				escreva("\nVocê votou no Cleitin do Pneu! Aguarde a contagem de votos...")
				c1 = c1 ++
			pare
			caso 2:
				escreva("\nVocê votou no Shaolin Matador de Porco! Aguarde a contagem de votos...")
				limpa()
				c2 = c2 ++
			pare
			caso 3:
				escreva("\nVocê votou no Robson Arco-íris! Aguarde a contagem de votos...")
				limpa()
				c3 = c3 ++
			pare
			caso 4:
				escreva("\nVocê votou no Alce Bárbaro! Aguarde a contagem de votos...")
				limpa()
				c4 = c4 ++
			pare
			caso 5:
				escreva("\nVocê votou nulo :(")
				limpa()
				nulo = nulo ++
			pare
			caso 6:
				escreva("\nVocê votou em branco, seu voto será direcionado ao candidato com menos pontos! Aguarde a contagem de votos...")
				limpa()
				branco = branco ++
		}
		
		} enquanto(operacao != 0)

		se (c1 > c2 e c1 > c3 e c1> c4)
		{
			escreva("\nO candidato Cleitin do Pneu ganhou a votação! com: ", c1)
			escreva("Os outros candidatos ficaram com: \nShaolin: ", c2, "\t Robson: ", c3, "\nAlce: ", c4)
			escreva("Os votos em branco foram: ", branco)
			escreva("Os votos em nulo foram: ", nulo)
		} 
		senao
			se (c2 > c1 e c2 > c3 e c2> c4)
			{
				escreva("\nO candidato Shaolin Matador de Porco ganhou a votação! com: ", c2)
				escreva("Os outros candidatos ficaram com: \nCleitin: ", c1, "\t Robson: ", c3, "\nAlce: ", c4)
				escreva("Os votos em branco foram: ", branco)
				escreva("Os votos em nulo foram: ", nulo)
			} 
			senao
				se (c3 > c1 e c3 > c2 e c3> c4)
				{
					escreva("\nO candidato Robson do Arco-Íris ganhou a votação! com: ", c3)
					escreva("Os outros candidatos ficaram com: \nCleitin: ", c1, "\tShaolin: ", c2, "\nAlce: ", c4)
					escreva("Os votos em branco foram: ", branco)
					escreva("Os votos em nulo foram: ", nulo)
				} 
				senao
					se (c4 > c1 e c4 > c2 e c4> c3)
					{
						escreva("\nO candidato Alce Bárbaro ganhou a votação! com: ", c4)
						escreva("Os outros candidatos ficaram com: \nCleitin: ", c1, "\tShaolin: ", c2, "\nRobson: ", c3)
						escreva("Os votos em branco foram: ", branco)
						escreva("Os votos em nulo foram: ", nulo)
					}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
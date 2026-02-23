programa
{
	
	funcao inicio()
	{
		inteiro operacao, continua

		escreva("\nBem vinda ao RPG de Mesa de Hogwarts!")
		escreva("\nDigite 1 para continuar, ou 0 para reiniciar!")
		leia(continua)
		limpa()
			se(continua == 1) 
			{
				escreva("\n\n Bom, após a sua luta com o dragão, você tem que achar o tesouro né?.")
				escreva("\n Eita, esqueci o meu percursor mágico lumos m-300! Você vai ter que nos guiar professora Suzan!")
		
				escreva("\n......* Som de coisas se rastejando e grunindo *........\n")
		
				escreva("\n -Tô com medo ;-; *diz um aluno*\n")
			
		escreva("SUZAN, VOCÊ TEME A MORTE? *Diz o Mestre*")
		leia(continua)
		limpa()
			
			se(continua == 1) 
			{
				escreva("\n Nunca duvidei de você professora!", "\n Agora que você conseguiu iluminar a caverna, já vimos que temos 8 passagens para atravessar! Qual é a certa?")
			
		escreva("\nPelo menos elas tem enumerações, do 1 ao 8, ficou mais fácil né prof?! \n\nEspera, Prof? \n PROFESSORA ESPERA POR MIM!! *alguns alunos começam a chorar com medo da morte*\n")
		leia(continua)
				
			se(continua == 1) 
			{
				escreva("\nSuzan, O mestre te faz uma pergunta! Qual caminho você escolhe? \n(1) \t(2) \n(3) \t(4) \n(5) \t(6) \n(7) \t(8)\n")
				leia(operacao)
				limpa()
			
						//P1. P2, P3, P4, P5, P7, P8 SÃO AS QUE IRÃO NOS MATAR.
						//P6 É A CORRETA.
			se(operacao == 6) 
			{
				escreva("CONSEGUIMOS! O TESOURO É NOSSO!!!")
			}
			
				senao
					{
					faca {
							escreva("SUZAN, VOCÊ GUIOU TODOS PARA A MORTE, FIM DE JOGO!\n\n Brincadeirinhaaa! Você tem chance!")
							escreva("\nSuzan, O mestre te faz uma pergunta! Qual caminho você escolhe? \n(1) \t(2) \n(3) \t(4) \n(5) \t(6) \n(7) \t(8)\n")
							leia(operacao)
							limpa()
						} enquanto (operacao != 6) 
							se(operacao == 6) 
							{
								escreva("CONSEGUIMOS! O TESOURO É NOSSO!!!")
							}	
					}
				}
			}
		}
	}
					
}
		
	


				
			
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1891; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
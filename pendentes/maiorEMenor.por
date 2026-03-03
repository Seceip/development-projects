programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro numeroUm, numeroDois, numeroTres, menor, maior

		menor = 0
		maior = 0
		
		escreva("Olá, você pode digitar o primeiro número?")
		leia(numeroUm)

		escreva("Olá, você pode digitar o segundo número?")
		leia(numeroDois)

		escreva("Olá, você pode digitar o terceiro e último número?")
		leia(numeroTres)

		limpa()
		
		escreva("Hmm.. estou com dificuldade, aguarde.\n")
		

		se (numeroUm > numeroDois e numeroUm > numeroTres) 
		{
			maior = numeroUm
			se(numeroDois < numeroTres)
				
				menor = numeroDois

				escreva("O maior número é:", maior)
				escreva("O menor número é:", menor)
		}
					senao
					menor = numeroTres
					
		}

		!!!!!PROFESSORA NAO CONSEGUI TERMINAR ESTE EXERCICIO :(
}

		
		
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 778; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
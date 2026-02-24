programa
{
	
	funcao inicio()
	{
		inteiro n1, soma

		soma = 0

		faca 
		{
			escreva("Olá, irei te ajudar com um cálculo. \n Se você foi um aluno que usou menos que 10 vezes o restaurante, digite 1. \n Se você foi um aluno que usou mais que 10 até 15 vezes o restaurante, digite 2. \n Se você foi um aluno que usou mais de 15 vezes o restaurante, digite 3. \n Digite 0 para parar de somar.")
			leia(n1)
			limpa()
			
		escolha(n1) 
		{
			caso 1:
				escreva("\n\nEste grupo de 10 alunos usaram até 10 vezes.")
				soma = soma + n1
			pare
			caso 2:
				escreva("\n\nEste grupo de 10 alunos usaram entre 10 vezes a 15 vezes.")
				soma = soma + n1
			pare
			caso 3:
				soma = soma + n1
				escreva("\n\nEste grupo de 10 alunos mais que 15 vezes.")
			pare
		}
		} enquanto(n1 != 0)

		escreva("E a soma total foi de que ", soma , "grupos de dez pessoas usaram o restaurante")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 888; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro prova1, prova2
		real faltas

		escreva("Irei calcular as notas de duas provas para verificar se o aluno passou ou não na matéria!")
		leia(prova1)
		leia(prova2)

		escreva("Digite a porcentagem de faltas do aluno!")
		leia(faltas)
		limpa()

		se (prova1 + prova2/2 >= 7 e faltas <= 25) {
			escreva("O aluno foi aprovado!\n", "E ficou com a porcentagem de:", faltas, "%")
			}
		senao
			se(prova1 + prova2/2 < 7 e prova1 + prova2/2 >= 5 e faltas <= 25) {
				escreva("O aluno ficou em exame!\n", "E ficou com a porcentagem de:", faltas, "%")
			}
		senao
			{
				escreva("O aluno foi reprovado!")	
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
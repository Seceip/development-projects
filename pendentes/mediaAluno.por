programa
{
	
	funcao inicio()
	{
		real nota1, nota2, media
		
		
		escreva("Por favor, digite a 1° nota do aluno: ")
		leia(nota1)

		escreva("Por favor, digite a 2° nota do aluno: ")
		leia(nota2)

		media = (nota1+nota2)/2

		limpa()

		escreva("A média do aluno é de: ", media, "\n\n")
		
		se (media>=7){
			escreva("O aluno está aprovado :)")
		} senao se (media<7 e media>=4){
			escreva("O aluno está de exame :/")
		} senao {
			escreva("O aluno está reprovado :(")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 174; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
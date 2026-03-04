programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro contador, tamanhoArray = 5, maior18 = 0, menor18 = 0
		inteiro idades[5] = {1, 1, 1, 1, 1}
		
		escreva("Olá, vou calcular se existem mais alunos maiores ou menos de 18 anos!\n")
		
		para (contador = 0; contador < tamanhoArray; contador++) 
		{
			escreva("Digite a idade do ", contador+1, "° aluno: ")
			leia(idades[contador])

			se (idades[contador] >= 18){
				maior18 = maior18+1
			} senao {
				menor18 = menor18+1
			}
		}

		se (menor18 > maior18){
			escreva("A maioria dos alunos possui menos de 18 anos.")
		} senao se (maior18 > menor18){
			escreva("A maioria dos alunos possui mais de 18 anos")
		} senao {
			escreva("Sua escola está totalmente em equilibrio, Thanos ficaria feliz!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
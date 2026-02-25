programa
{
	
	funcao inicio()
	{

		real peso, altura, calculo, imc
		
	
		escreva("Digite o seu peso por favor!")
		leia(peso)

		limpa()
		escreva("Muito bem! Agora preciso da sua altura por favor. (Digite com ponto ao invés de vírgula)")
		leia(altura)

		calculo = peso / (altura*altura)
		se(calculo < 20) {
			escreva("\nSeu IMC foi calculado e você está Abaixo do peso Ideal, com: " , calculo, " kg/m².")
		}
		senao
			se(calculo >= 20 e calculo <= 25) {
				escreva("\nSeu IMC foi calculado e você está no peso Ideal, com: " , calculo, " kg/m².")
			}
		senao
			se(calculo > 25) {
				escreva("\nSeu IMC foi calculado e você está no Acima do Peso Ideal (TOME CUIDADO!!!), com: " , calculo, " kg/m².")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 730; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
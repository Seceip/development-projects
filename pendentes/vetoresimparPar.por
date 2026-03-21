programa
{
	
	funcao inicio()
	{
		inteiro v1[15], v2[15], v3[15]

		para(inteiro c=0; c<=14; c++)
		{
			escreva("Digite o número da posição: ", c, "°\n")
			leia(v1[c])

			se(v1[c] % 2 == 1)
			{
					v2[c] = v1[c] * 3
			}
			senao
				se(v1[c] % 2 == 0)
				{
					v3[c] = v1[c] * 2
				}
				senao
				{
						v1[c] = v1[c]
				}
		}

		escreva("\nValores digitados:")
		
		para(inteiro c=0; c<=14; c++)
		{
			escreva(v1[c], "|")
		}

		escreva("\nVetor Ímpar:")
		para(inteiro c=0; c<=14; c++)
		{
			escreva(v2[c], "|")
		}

		escreva("\nVetor Par:")
		para(inteiro c=0; c<=14; c++)
		{
			escreva(v3[c], "|")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v1, 6, 10, 2}-{v2, 6, 18, 2}-{v3, 6, 26, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
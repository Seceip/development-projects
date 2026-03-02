programa
{
	//BIBLIOTECAS
    inclua biblioteca Texto --> tex   
    inclua biblioteca Mouse --> m
    inclua biblioteca Util --> u
    inclua biblioteca Teclado --> t
    inclua biblioteca Graficos --> g
    inclua biblioteca Sons --> s
    
     //TAMANHO DA TELA 
    const inteiro LARGURA_JANELA=800
    const inteiro ALTURA_JANELA=600

    //Imagens
    inteiro fundoQuiz = g.carregar_imagem("magicalQuiz.jpg")
    inteiro quizHP = g.carregar_imagem("quizHP.jpg")
    inteiro melhorClasse = g.carregar_imagem("melhorClasse.jpg")
    inteiro quizDrag = g.carregar_imagem("quizDrag.jpg")
    inteiro quizEscolha = g.carregar_imagem("quizEscolha.jpg")
    inteiro quizSatis = g.carregar_imagem("satisf.jpg")
    inteiro quizSisterAP = g.carregar_imagem("sisterAP.jpg")

     //SONS
	inteiro soundSisterAP = s.carregar_som("coldB.mp3")

	//VARIAVEL
	inteiro listaValor[2][2] = {{0, 50},{100, 166}}
	inteiro pontuacaoQ = 0

	
	funcao inicio()
	{
		s.reproduzir_som(soundSisterAP, verdadeiro)
		s.definir_volume(100)
		Montar_Janela_Quiz()
		enquanto(verdadeiro)
		{
			g.desenhar_imagem(0, 0, fundoQuiz)
			g.renderizar()

			se(t.tecla_pressionada(t.TECLA_ESPACO))
			{
				Montar_Janela_Quiz2()
			}
		}
	}

	funcao Montar_Janela_Quiz()
	{
          g.iniciar_modo_grafico(verdadeiro)
          g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
          g.definir_titulo_janela("Magical Quiz")
	}

	funcao Montar_Janela_Quiz2()
	{
          g.iniciar_modo_grafico(verdadeiro)
          g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
          g.definir_titulo_janela("Magical Quiz")

          enquanto(verdadeiro)
		{
			g.desenhar_imagem(0, 0, quizHP)
			g.definir_cor(g.COR_VERMELHO)
			
			
			
			g.desenhar_retangulo(10, 420, 265, 140, verdadeiro, falso)
			g.desenhar_retangulo(310, 420, 245, 140, verdadeiro, falso)
			g.desenhar_retangulo(580, 420, 200, 140, verdadeiro, falso)
			
			g.renderizar()

			se(mouse(10, 420, 265, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
				{
					pontuacaoQ = pontuacaoQ + listaValor[0][1]
					Montar_Janela_Quiz3()
				}
				senao
					se(mouse(319, 420, 245, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
					{
						pontuacaoQ = pontuacaoQ + listaValor[1][1]
						Montar_Janela_Quiz3()
					}
					senao
						se(mouse(580, 420, 200, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
						{
							pontuacaoQ = pontuacaoQ + listaValor[0][0]
							Montar_Janela_Quiz3()
						}
		}
	}
	
	funcao Montar_Janela_Quiz3()
	{
          g.iniciar_modo_grafico(verdadeiro)
          g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
          g.definir_titulo_janela("Magical Quiz")
          

          enquanto(verdadeiro)
		{
			g.desenhar_imagem(0, 0, melhorClasse)

			g.desenhar_retangulo(30, 300, 150, 400, verdadeiro, falso)
			g.desenhar_retangulo(330, 300, 170, 400, verdadeiro, falso)
			g.desenhar_retangulo(625, 300, 150, 215, verdadeiro, falso)

			g.definir_cor(g.COR_VERMELHO)
			g.desenhar_retangulo(625, 530, 150, 55, verdadeiro, falso)
			
			g.renderizar()

			se(mouse(30, 300, 150, 400) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
				{
					pontuacaoQ = pontuacaoQ + listaValor[0][1]
					Montar_Janela_Quiz4()
				}
				senao
					se(mouse(330, 300, 170, 400) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
					{
						pontuacaoQ = pontuacaoQ + listaValor[1][1]
						Montar_Janela_Quiz4()
					}
					senao
						se(mouse(625, 300, 150, 215) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
						{
							pontuacaoQ = pontuacaoQ + listaValor[0][1]
							Montar_Janela_Quiz4()
						}
						senao
							se(mouse(625, 530, 150, 55) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
							{
								pontuacaoQ = pontuacaoQ + listaValor[0][0]
								Montar_Janela_Quiz4()
							}
		}
	}

	funcao Montar_Janela_Quiz4()
	{
          g.iniciar_modo_grafico(verdadeiro)
          g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
          g.definir_titulo_janela("Magical Quiz")

          enquanto(verdadeiro)
		{
			g.desenhar_imagem(0, 0, quizSisterAP)

			g.desenhar_retangulo(30, 460, 110, 100, verdadeiro, falso)
			g.desenhar_retangulo(240, 460, 125, 100, verdadeiro, falso)
			g.desenhar_retangulo(440, 460, 110, 100, verdadeiro, falso)
			g.desenhar_retangulo(620, 460, 140, 100, verdadeiro, falso)

			g.renderizar()

			se(mouse(30, 460, 110, 100) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
				{
					pontuacaoQ = pontuacaoQ + listaValor[0][0]
					Montar_Janela_Quiz5()
				}
				senao
					se(mouse(240, 460, 125, 100) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
					{
						pontuacaoQ = pontuacaoQ + listaValor[0][1]
						Montar_Janela_Quiz5()
					}
					senao
						se(mouse(440, 460, 110, 100) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
						{
							pontuacaoQ = pontuacaoQ + listaValor[1][1]
							Montar_Janela_Quiz5()
						}
						senao
							se(mouse(620, 460, 140, 100) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
							{
								pontuacaoQ = pontuacaoQ + listaValor[1][0]
								Montar_Janela_Quiz5()
							}
		}
	}

	funcao Montar_Janela_Quiz5()
	{
          g.iniciar_modo_grafico(verdadeiro)
          g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
          g.definir_titulo_janela("Magical Quiz")
          
          enquanto(verdadeiro)
		{
			g.desenhar_imagem(0, 0, quizSatis)
			

			
			g.desenhar_retangulo(40, 420, 110, 140, verdadeiro, falso)
			g.desenhar_retangulo(275, 420, 245, 140, verdadeiro, falso)
			g.desenhar_retangulo(580, 420, 240, 140, verdadeiro, falso)

			g.renderizar()

			se(mouse(40, 420, 110, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
				{
					pontuacaoQ = pontuacaoQ + listaValor[0][0]
					Montar_Janela_Quiz6()
				}
				senao
					se(mouse(275, 420, 245, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
					{
						pontuacaoQ = pontuacaoQ + listaValor[1][1]
						Montar_Janela_Quiz6()
					}
					senao
						se(mouse(580, 420, 240, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
						{
							pontuacaoQ = pontuacaoQ + listaValor[0][1]
							Montar_Janela_Quiz6()
						}
		}
	}

	funcao Montar_Janela_Quiz6()
	{
          g.iniciar_modo_grafico(verdadeiro)
          g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
          g.definir_titulo_janela("Magical Quiz")

          enquanto(verdadeiro)
		{
			g.desenhar_imagem(0, 0, quizDrag)

			g.desenhar_retangulo(580, 420, 200, 140, verdadeiro, falso)
			g.desenhar_retangulo(250, 420, 300, 140, verdadeiro, falso)
			g.desenhar_retangulo(5, 420, 220, 140, verdadeiro, falso)

			g.renderizar()

			se(mouse(580, 420, 200, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
				{
					pontuacaoQ = pontuacaoQ + listaValor[0][1]
					Montar_Janela_Quiz7()
				}
				senao
					se(mouse(250, 420, 300, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
					{
						pontuacaoQ = pontuacaoQ + listaValor[1][1]
						Montar_Janela_Quiz7()
					}
					senao
						se(mouse(5, 420, 220, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
						{
							pontuacaoQ = pontuacaoQ + listaValor[1][0]
							Montar_Janela_Quiz7()
						}
		}
	}

	funcao Montar_Janela_Quiz7()
	{
          g.iniciar_modo_grafico(verdadeiro)
          g.definir_dimensoes_janela(LARGURA_JANELA, ALTURA_JANELA)
          g.definir_titulo_janela("Magical Quiz")
          

          enquanto(verdadeiro)
		{
			g.desenhar_imagem(0, 0, quizEscolha)

			g.desenhar_retangulo(15, 420, 220, 140, verdadeiro, falso)
			g.desenhar_retangulo(470, 420, 300, 140, verdadeiro, falso)
			
			g.renderizar()

			se(mouse(15, 420, 220, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
				{
					pontuacaoQ = pontuacaoQ + listaValor[1][0]
					escreva(pontuacaoQ)
				}
				senao
					se(mouse(470, 420, 300, 140) == verdadeiro e m.botao_pressionado(m.BOTAO_ESQUERDO))
					{
						pontuacaoQ = pontuacaoQ + listaValor[1][1]
						escreva("\n", pontuacaoQ)
					}
		}
	}

	funcao logico mouse(inteiro x, inteiro y, inteiro a, inteiro b)
    	{
    		se(m.posicao_x() >= x e m.posicao_y() >= y e m.posicao_x() <= x+a e m.posicao_y() <= y+b)
    		{
    			retorne verdadeiro
    		}
    		senao
    		{
    			retorne falso
    		}
    	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8034; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {listaValor, 28, 9, 10}-{pontuacaoQ, 29, 9, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
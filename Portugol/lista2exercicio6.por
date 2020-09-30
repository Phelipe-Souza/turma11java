programa
{
	
	funcao inicio()
	{
		inteiro idade

		//entrada
		escreva ("Nadador, por favor informe a sua idade:")
		leia (idade)

		// Processamento e Saída
		se (idade> = 5 e idade <= 7) {
			escreva ("Olá nadador, voce tem", idade, "anos e sua categoria é a Infantil A")
		}
		senao se (idade> = 8 e idade <= 11) {
			escreva ("Olá nadador, voce tem", idade, "anos e sua categoria é a Infantil B")
		}
		senao se (idade> = 12 e idade <= 13) {
			escreva ("Olá nadador, voce tem", idade, "anos e sua categoria é a Juvenil A")
		}
		senao se (idade> = 14 e idade <= 17) {
			escreva ("Olá nadador, voce tem", idade, "anos e sua categoria é a Juvenil B")
		}
		senao {
			escreva ("Olá nadador, voce tem", idade, "anos e sua categoria é a de Adultos")
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
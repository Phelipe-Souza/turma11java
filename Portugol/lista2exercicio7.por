programa
{
	
	funcao inicio()
	{
		/* 7) Receber valores de base e altura de um triângulo 
		 *  e verificar se são valores válidos (positivos maiores que zero). 
		 *  Em caso afirmativo, calcular a área do triângulo.
		 * Variaveis - Base e Altura 
		 */
		inteiro base = 0, altura = 0

		escreva("Digite o valor inteiro da base: ")
		leia(base)
		escreva("Digite o valor inteiro da Altura: ")
		leia(altura)

		se((base>0) e (altura>0)){
			escreva("Area do Triangulo é de: " ,((base*altura)/2),"")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
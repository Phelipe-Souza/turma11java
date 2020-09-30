programa
{
	
	funcao inicio()
	{
		/*
		 *  1-João Papo-de-Pescador, homem de bem, comprou um microcomputador 
		 *  para controlar o rendimento diário de seu trabalho. Toda vez que 
		 *  ele traz um peso de tomate maior que o estabelecido pelo 
		 *  regulamento do estado de São Paulo (50 quilos) deve pagar uma 
		 *  multa de R$ 4,00 por quilo excedente. João precisa que você faça 
		 *  um sistema que leia a variável P (peso de tomates) e verifique 
		 *  se há excesso. Se houver, gravar na variável E (Excesso) e na 
		 *  variável M o valor da multa que João deverá pagar. Caso contrário 
		 *  mostrar tais variáveis com o conteúdo ZERO.
		 */
		 //Variaveis
		 real peso = 0.0
		 real excesso = 0.0
		 real multa = 0.0
		 real regulamento = 50.00
		
	
		 escreva ("Digite o peso do carregamento: ")
		 leia (peso)
		 escreva ("\n Peso do Carregamento é de: ", peso, " kg")
		 excesso = (peso - regulamento)
		 multa = excesso * 4.00
		 se (peso>regulamento){
		 	escreva ("\n Peso em excesso é de: ", excesso, " kg")
		 	escreva ("\n E multa no valor de: ", multa, " reais")
		 }

		 senao {
		 	escreva ("\n Peso em excesso é de: ", excesso, " kg")
		 	escreva ("\n E multa no valor de: ", multa, " reais")
		 }
		 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
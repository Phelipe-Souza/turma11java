programa
{
	
	funcao inicio()
	{
		/*4-Faça um sistema que leia um número inteiro e mostre uma 
		 * mensagem indicando se este número é par ou ímpar, e se 
		 * é positivo ou negativo
		 * ZERO É PAR
		 * PAR O IMPAR SÓ PARA POSITIVO
		 * NEGATIVO É MENOR QUE 0
		 * VARIÁVEL É INTEIRO
		 */

		 inteiro valorUsuario

		 escreva("Digite um valor: ")
		 leia(valorUsuario)

		 se (valorUsuario==0) {
		 	
		 	escreva("\nVocê digitou 0 e Zero é Par!!")
		 }

		 se (valorUsuario > 0 ) { 
		 	se (valorUsuario%2==0)
		 		escreva("\nO Valor é par")
		 	     escreva ("\nO valor é positivo")
		 }
		  se (valorUsuario%2!=0){
		  	
		          escreva("\nO Valor é Impar")
		 	     
		 	     } 
		            	
		            }
		 senao se (valorUsuario < 0){
		 	escreva("\nO Valor é Negativo")
		 	
		 }
		
		 

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 39; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
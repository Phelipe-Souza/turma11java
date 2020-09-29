programa
{
	
	funcao inicio()
	{
		/*Faça um sistema que leia o tempo de duração 
		 *de um evento em uma fábrica expressa em 
		 *segundos e mostre-o expresso em horas, 
		 *minutos e segundos. 
		 *
		 *1 segundo=1 segundo
		 *1 minuto=60 segundos
		 *1 hora=3600 segundos
		 *
		 *Tempo em 
		 */


		 //Ingredientes
		 inteiro tempoDuracao = 0
		 inteiro segundos = 0
		 inteiro minutos = 0
		 inteiro horas = 0

		 //Modo de Preparo - Processamento

		 escreva("Digite o tempo em segundos: ")
		 leia(tempoDuracao)
		 horas=(tempoDuracao/3600)
		 escreva("\nTotal de Horas: ",horas)
		 minutos=((tempoDuracao%3600)/60)
		 escreva("\nTotal de Minutos: ",minutos)
		 segundos=((tempoDuracao%3600)%60)
		 escreva("\nTotal de Segundos: ",segundos)
		 

		 
		 
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 761; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
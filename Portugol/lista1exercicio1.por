programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um sistema que leia a idade de uma pessoa 
		 * expressa em anos, meses e dias e mostre-a 
		 * expressa apenas em dias. 
		 * Phelipe 28 anos, 9 meses, 20 dias
		 * 
		 * 1 ano - 365 dias
		 * 1 mês - 30 dias
		 */


		 //Ingredientes

		 inteiro anos = 0
		 inteiro meses = 0
		 inteiro dias = 0
		 inteiro totalDias = 0

		 // modo de preparo

		 escreva("digite os anos")
		 leia(anos)
		 escreva("digite os meses")
		 leia(meses)
		 escreva("digite os dias")
		 leia(dias)

		 totalDias = ((anos*365) + (meses*30) + dias) 

		 escreva("Total de dias é ",totalDias)
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
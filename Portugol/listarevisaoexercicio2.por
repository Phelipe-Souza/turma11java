programa
{
	
	funcao inicio()
	{
		/*
		 * O IMC – Índice de Massa Corporal é um critério da Organização 
		 * Mundial de Saúde para dar uma indicação sobre a condição de 
		 * peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
             Elabore um programa que leia o peso e a altura de um adulto
             e mostre sua condição de acordo com a tabela abaixo. 
             IMC em adultos Condição 
             Abaixo de 18,5 Abaixo do peso 
             Entre 18,5 e 25 Peso normal 
             Entre 25 e 30 Acima do peso 
             Acima de 30 obeso

		 * 
		 */
		real altura, peso, imc

		escreva("Digite a sua altura: ")
		leia(altura)
		escreva("Digite o seu peso: ")
		leia(peso)
		imc=(peso/(altura*altura))

		se (imc < 18.5)
		{
			escreva("Você está abaixo do peso")
		}
		senao se (imc=>18.5)e(imc<25.0)
		{
			escreva("Você está com o peso normal")
		}
		 
     
     
     }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 902; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
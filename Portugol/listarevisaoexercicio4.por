programa
{
	/*
	 4 - Faça um programa que calcula e escreve a seguinte soma: 
	 soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	 */
	funcao inicio()
	{	
		//variavéis
		inteiro numerador = -1;
		real resposta = 0;

		//laço apresentando o numerador e denominador e tambem sendo calculado
		para (inteiro denominador = 1; denominador <= 50; denominador++){
    		numerador = numerador + 2;
    		escreva(numerador,"/",denominador, " + ")
    		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
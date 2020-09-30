programa
{
	
	funcao inicio()
	{
		/*2-Elabore um sistema que leia as variáveis C e N, respectivamente 
		 *código e número de horas trabalhadas de um operário. E calcule 
		 *o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o 
		 *número de horas exceder a 50 calcule o excesso de pagamento 
		 *armazenando-o na variável E, caso contrário zerar tal variável. 
		 *A hora excedente de trabalho vale R$ 20,00. No final do 
		 *processamento imprimir o salário total e o salário excedente.
		 */
		 //Variaveis
		 real c,n,ex,lim = 50.00
		 real salarioTotal, salarioExcedente

		 escreva("\nDigite seu código: ")
		 leia(c)
		 escreva("Numero de horas trabalhada: ")
		 leia(n)
		 ex = ((n-lim)*20.00)
		 salarioTotal=((lim*10.00)+ex)

		 escreva("\nSalario Total é de: ",salarioTotal,"")
		 escreva("\nSalario Excedente é de: ",ex,"")
		 
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
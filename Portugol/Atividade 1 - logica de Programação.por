programa
{
	
	funcao inicio()
	{
		cadeia nomeUsuario
		inteiro ano,meses,dias
		ano=365
		meses=365
		dias=0
		
		
		escreva("Nome do Usuário ")
		leia(nomeUsuario)
		escreva("A seguir descreva sua idade da seguinte forma, primeiro em anos, meses e dias")
		escreva("\n Descreva quantos ano você tem?")
		leia(ano)
		escreva("Quantos meses?")
		leia(meses)
		escreva("Quantos dias?")
		leia(dias)
		escreva("\n A sua idade calculada em dias resulta em:",(ano*365+(meses*30)+dias)" Dias")
		
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
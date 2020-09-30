programa
{
	
	funcao inicio()
	{
		/*
		 * NOME DO USUARIO
		 * OPCAO MASCULINO OU FEMININO
		 * ANONASCIMENTO
		 * IDADE EU CHAMO DE IDOSO, IDOSA, MADURO OU MADURA, E JOVEM
		 * IDOSO ACIMA DE 60 ANOS (60 INCLUSIVE)
		 * ,MADURO ENTRE 25 E 59 ANOS
		 * JOVEM ABAIXO DE 25
		 */
		 //Variaveis

		cadeia nomeUsuario
		caracter opcao
		inteiro idade = 0
		inteiro anoNascimento
		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite M - masculino ou F - feminino :")
		leia(opcao)
		escreva("Digite o ano de nascimento : ")
		leia(anoNascimento)
		idade=(2020-anoNascimento)
		escreva(idade)
		 se(idade < 25){
		 	escreva ("\n Olá, ", nomeUsuario, " você é Jovem! ")
		 }
		 senao se(idade <60){
		 	se(opcao == 'F'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é madura")
		 	}
		 	senao se (opcao =='f'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é madura")
		 	}
		 	senao se (opcao =='M'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é maduro")
		 	}
		 	senao se (opcao =='m'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é maduro")
		 	}
		 	senao {
		 		escreva ("\n Olá, ", nomeUsuario, " você é madurx")
		 	}
		 		
		 }
		 senao {
		 	se(opcao == 'F'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é idosa")
		 	}
		 	senao se (opcao =='f'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é idosa")
		 	}
		 	senao se (opcao =='M'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é idoso")
		 	}
		 	senao se (opcao =='m'){
		 		escreva ("\n Olá, ", nomeUsuario, " você é idoso")
		 	}
		 	senao {
		 		escreva ("\n Olá, ", nomeUsuario, " você é idosx")
		 	}
		
		




		 
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1615; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
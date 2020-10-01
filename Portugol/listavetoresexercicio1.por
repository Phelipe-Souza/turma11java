programa
{
	
	funcao inicio()
	{

         /*
          * 1.Faça um programa que crie um vetor por leitura 
          * com 5 valores de pontuação de uma atividade e o 
          * escreva em seguida. Encontre após a maior 
          * pontuação e a apresente.
          */

		
		const inteiro X = 5
		real notas[X], maior = 0.0

              
		para (inteiro i=0; i < X; i++){
			escreva("\nDigite a " ,(i + 1),"º nota: ")
			leia(notas[i])
			se (notas[i] >= maior){
				maior = notas[i]
				
			}
		}
			para (inteiro i=0; i < X; i++){
				se(notas[i]>=maior)
				escreva("\nA Maior nota é a: ",notas[i])
			}
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
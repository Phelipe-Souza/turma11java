package exercicios;

public class LacoRepeticao {

	public static void main(String[] args) {
		/*
		 * LAÇO QUE MOSTRE NA TELA UMA SEQUENCIA DE NUMEROS DE 1 A 1000
           PARA - ENQUANTO - FAÇA ENQUANTO
           GUJ
           MSDN
           MDN
           LAÇO PARA NO JAVA
		 */

		int i,soma = 0;
			
		
		for (i = 1 ; i <= 1000; i++ )
		 {
			System.out.printf("\n%d",i);
			
			soma=soma+i;
			System.out.println();
		 }
		System.out.println();	
		System.out.println("A soma Total é de "+soma);
		
		
	    }

}

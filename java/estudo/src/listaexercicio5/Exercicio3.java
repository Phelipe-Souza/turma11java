package listaexercicio5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
	{
		
		/*Solicitar a idade de várias pessoas e imprimir: 
		 *Total de pessoas com menos de 21 anos.
		 *Total de pessoas com mais de 50 anos. 
		 *O programa termina quando idade for =99
		 * 
		 * 
		 * 
		 */
	       Scanner leia = new Scanner(System.in);
	       
	       final int LIMITE = 99;
		   int idade = 0,menos21 = 0,mais50 = 0;
		   
		   
	    	
 		    while (idade<LIMITE) {
 		        
 		           System.out.print("Digite a sua idade: ");
		           idade=leia.nextInt();
		           
		           if (idade<21) 
		             {
		        	   menos21=menos21+1;
		             }
		           
		           if (idade>50) 
		             {
		        	   mais50=mais50+1;
		             }
 		    }
		
	       System.out.printf("\nO total de pessoas com menos de 21 anos é de %d",menos21);
	       System.out.printf("\nO total de pessoas com mais de 50 anos é de %d",mais50);
	       
	       leia.close();

	}

}

package listaexercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) 
	{
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre 
		 * um n�mero igual a zero. No final, mostre a soma dos n�meros 
		 * digitados.(DO...WHILE)
		 */

		Scanner leia = new Scanner(System.in);
		
		int num=0,soma=0;
		
		do
		{
		
			System.out.print("Digite um numero: ");
		    num=leia.nextInt();
		    soma=soma+num;
		    		
		}while(num!=0);
		
		
		System.out.printf("\nA Soma total � de %d",soma);
		
		
		
		
		
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package listaexercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) 
	{
		/*
		 * Crie um programa que leia um número do teclado até que encontre 
		 * um número igual a zero. No final, mostre a soma dos números 
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
		
		
		System.out.printf("\nA Soma total é de %d",soma);
		
		
		
		
		
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

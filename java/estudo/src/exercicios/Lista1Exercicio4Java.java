package exercicios;

import java.util.Scanner;

public class Lista1Exercicio4Java {

	public static void main(String[] args) 
	{
		/*4- Faça um programa em que permita a entrada de um
		 *  número qualquer e exiba se este número é par ou ímpar. 
		 *  Se for par exiba também a raiz quadrada do mesmo; se for
		 *  ímpar exiba o número elevado ao quadrado.
		 */
		
		
		Scanner tec = new Scanner (System.in);
		
		 double numero,raiz,quadrado;
		 
		System.out.print("Digite um numero que direi se ele é\nImpar, Par ou Negativo ");
		numero = tec.nextDouble();
	   
		
		if (numero < 0)
		 {
			   System.out.printf("Incorreto, são aceitos somentes numeros positivos",numero);
		 }
	
		
		else if (numero == 0) 
		 {
			   System.out.println("Você digitou 0, é um numero neutro");
		 }
	
		
		else if (numero%2 == 0)
	
		{
	     		System.out.printf("Você digitou %.0f, é um numero Par! e positivo",numero);
			    quadrado=Math.sqrt(numero);
		    	System.out.println();
		       	System.out.printf("A Raiz quadrada de %.0f é de %.4f",numero,quadrado);

		 }
		
	
		else
		
		{
	         	System.out.printf("Você digitou %.0f, é um numero Impar! e positivo",numero);
	         	raiz=numero*numero;
	        	System.out.println();
		        System.out.printf("A o valor de %.0f ao quadrado é de %.0f",numero,raiz);
	     }

		
		
		
		tec.close();
}
	
}

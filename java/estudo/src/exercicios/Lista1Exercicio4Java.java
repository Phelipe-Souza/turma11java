package exercicios;

import java.util.Scanner;

public class Lista1Exercicio4Java {

	public static void main(String[] args) 
	{
		/*4- Fa�a um programa em que permita a entrada de um
		 *  n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 *  Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		 *  �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		
		Scanner tec = new Scanner (System.in);
		
		 double numero,raiz,quadrado;
		 
		System.out.print("Digite um numero que direi se ele �\nImpar, Par ou Negativo ");
		numero = tec.nextDouble();
	   
		
		if (numero < 0)
		 {
			   System.out.printf("Incorreto, s�o aceitos somentes numeros positivos",numero);
		 }
	
		
		else if (numero == 0) 
		 {
			   System.out.println("Voc� digitou 0, � um numero neutro");
		 }
	
		
		else if (numero%2 == 0)
	
		{
	     		System.out.printf("Voc� digitou %.0f, � um numero Par! e positivo",numero);
			    quadrado=Math.sqrt(numero);
		    	System.out.println();
		       	System.out.printf("A Raiz quadrada de %.0f � de %.4f",numero,quadrado);

		 }
		
	
		else
		
		{
	         	System.out.printf("Voc� digitou %.0f, � um numero Impar! e positivo",numero);
	         	raiz=numero*numero;
	        	System.out.println();
		        System.out.printf("A o valor de %.0f ao quadrado � de %.0f",numero,raiz);
	     }

		
		
		
		tec.close();
}
	
}

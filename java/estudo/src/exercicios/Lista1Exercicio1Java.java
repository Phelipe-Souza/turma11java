package exercicios;

import java.util.Scanner;

public class Lista1Exercicio1Java {

	public static void main(String[] args) 
	
	{
		
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
	    Scanner leia = new Scanner(System.in);
	    
	   int num1,num2,num3,maior=0;
	   
	   System.out.print("Digite o 1º numero inteiro e que seja positivo: ");
	   num1 = leia.nextInt();
	   System.out.print("Digite o 2º numero inteiro e que seja positivo: ");
	   num2 = leia.nextInt();
	   System.out.print("Digite o 3º numero inteiro e que seja positivo: ");
	   num3 = leia.nextInt();
	   
	   
	   
	   if ((num1 > num2) && (num1 > num3))
			   {
		           System.out.println("O Maior numero é o 1º"); 
	   
			   }
	   
	   else if ((num2 > num1) && (num2 > num3))
	           {
                   System.out.println("O Maior numero é o 2º"); 

	           }
	   
	   else if ((num3 > num1) && (num3 > num2))
       {
           System.out.println("O Maior numero é o 3º"); 

       }
	   
	   else {
		       System.out.println("Você pode ter digitado numero repetido ou digitou incorreto");
		       System.out.println("Tente Novamente");
	        }
	   
	    

	
	
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    leia.close();
	}

}

package exercicios;

import java.util.Scanner;

public class Lista1Exercicio1Java {

	public static void main(String[] args) 
	
	{
		
		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
	    Scanner leia = new Scanner(System.in);
	    
	   int num1,num2,num3,maior=0;
	   
	   System.out.print("Digite o 1� numero inteiro e que seja positivo: ");
	   num1 = leia.nextInt();
	   System.out.print("Digite o 2� numero inteiro e que seja positivo: ");
	   num2 = leia.nextInt();
	   System.out.print("Digite o 3� numero inteiro e que seja positivo: ");
	   num3 = leia.nextInt();
	   
	   
	   
	   if ((num1 > num2) && (num1 > num3))
			   {
		           System.out.println("O Maior numero � o 1�"); 
	   
			   }
	   
	   else if ((num2 > num1) && (num2 > num3))
	           {
                   System.out.println("O Maior numero � o 2�"); 

	           }
	   
	   else if ((num3 > num1) && (num3 > num2))
       {
           System.out.println("O Maior numero � o 3�"); 

       }
	   
	   else {
		       System.out.println("Voc� pode ter digitado numero repetido ou digitou incorreto");
		       System.out.println("Tente Novamente");
	        }
	   
	    

	
	
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    leia.close();
	}

}

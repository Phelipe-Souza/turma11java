package listaexercicio5;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) 
	{
	     /*
	      * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	      * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair 
	      * digitar 0(zero).(DO...WHILE)
	      */
		
		Scanner leia = new Scanner(System.in);
		
		
        int num=0,multiplos3=0,soma=0,media=0;
		
		do
		{
		
			System.out.print("Digite um numero: ");
		    num=leia.nextInt();
		    
			if ((num % 3) == 0)
			{
                		multiplos3 = multiplos3 + 1;
                		soma=soma+num;
                		media=soma/multiplos3;
                		
			}	
		   
		    		
		}while(num!=0);
		
		System.out.printf("\nA m�dia dos multiplos de 3 foi :%3d " , media);
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}

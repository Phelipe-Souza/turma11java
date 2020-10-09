package listaexercicio5;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		/* Ler 10 números e imprimir quantos são pares e quantos são
		 * ímpares. (FOR)
         
		
		int par, impar,num;
		
		for	
		*/
	
		Scanner leia = new Scanner(System.in);  
		
		int n = 10,x,par	= 0,impar = 0, i;
		
			
		for(i = 0; i < n; i++)
		{
			System.out.print("Digite os Numeros: ");
			x = leia.nextInt();
			System.out.println();
			System.out.printf("\n%d",x);
			
			if (x%2==0)  
				par++;
			else
				impar++;
		}
		
		
		System.out.printf("\n%d numeros pares.\n", par);
		System.out.printf("\n%d numeros impares.\n",impar);
	
	
	
	
	}

}

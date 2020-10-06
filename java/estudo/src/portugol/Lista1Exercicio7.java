package portugol;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		/*
		 * 		inteiro
		a , b , c , d , e , f  , x , y
		
		escreva (" informe o Valor de A : ")
		leia (a)
		pula()
		escreva (" informe o Valor de B : ")
		leia (b)
		pula()
		escreva (" informe o Valor de C : ")
		leia (c)
		pula()
		escreva (" informe o Valor de D : ")
		leia (d)
		pula()
		escreva (" informe o Valor de E : ")
		leia (E)
		pula()
		escreva (" informe o Valor de F : ")
		leia (f)
		pula()
		 x = ( ( (c*E) - (b*f) ) / ( (a*E) - (b*d) ) )
		 y =  ( ( (a*f) - (c*d) ) / ( (a*E) - (b*d) ) )
		 escreva (" O valor de X é : " , x )
		 pula()
		 escreva (" O valor de Y é : " , y)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		
		int a=0 , b=0 , c=0 , d=0 , e=0 , f=0; 
		double x=0 , y=0;
		
		System.out.print("informe o Valor de A : ");
		a = ler.nextInt();
		System.out.print("informe o Valor de B : ");
		b = ler.nextInt();
		System.out.print("informe o Valor de C : ");
		c = ler.nextInt();
		System.out.print("informe o Valor de D : ");
		d = ler.nextInt();
		System.out.print("informe o Valor de E : ");
		e = ler.nextInt();
		System.out.print("informe o Valor de F : ");
		f = ler.nextInt();
		
		x = ( ( (c*e) - (b*f) ) / ( (a*e) - (b*d) ) );
		
		
		y =  ( ( (a*f) - (c*d) ) / ( (a*e) - (b*d) ) );
	
		
		System.out.printf("O valor de X é de %f e o valor de Y é de %f",x,y);

		
		ler.close();
	}

}

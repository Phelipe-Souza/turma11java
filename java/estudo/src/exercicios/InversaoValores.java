package exercicios;

import java.util.Scanner;

public class InversaoValores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
int a, b;
		
		System.out.print("Digite A: ");
		a = leia.nextInt();
		System.out.print("Digite B: ");
		b = leia.nextInt();
		System.out.printf("\nAntes da Inversão A = %d e B = %d",a,b);
		
		a = a + b; // Ex, a = 10 e b = 20 ---> a = 30
		b = a - b; // B = 30 - 20 --> b = 10
		a = a - b; // a = 30 - 10 --> a = 20
		
		
		System.out.println("\nInvertendo as variáveis");
		System.out.println("B = " + b);
		System.out.println("A = " + a);
		
		
		leia.close();


	}

}

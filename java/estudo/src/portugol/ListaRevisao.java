package portugol;

import java.util.Scanner;

public class ListaRevisao {

	public static void main(String[] args)
	{
		Scanner tec = new Scanner (System.in);
		 double numero;
		System.out.print("Digite um numero que direi se ele �\nImpar, Par ou Negativo ");
		numero = tec.nextDouble();
		if (numero < 0){
			System.out.printf("Voc� digitou %.0f, � um numero negativo",numero);
		}else if (numero == 0) {
			System.out.println("Voc� digitou 0, � um numero neutro");
		}else if (numero%2 == 0){
			System.out.printf("Voc� digitou %.0f, � um numero Par! e positivo",numero);
		}else{
		System.out.printf("Voc� digitou %.0f, � um numero Impar! e positivo",numero);

	         }

    }
}

package portugol;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		/*/Vari�veis
		// a=anos, m=meses, d=dias
		inteiro a, m, d, dias
		dias=0
		a=0
		m=0
		d=0
		escreva("Digite quantos dias de idade vc tem?: ")
		leia(dias)
		a=(dias/365)
		m=(dias%365)/30
		d=(dias%365)%30)
		escreva("Voc� tem ",a, " ano(s) ",m, " m�s(s) ",d, " dia(s)! ")
		 *
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int a, m, d, dias;
		
		System.out.print("Digite quantos dias de idade vc tem?: ");
		dias= leia.nextInt();
		
		a=(dias/365);
		m=(dias%365)/30;
		//d=(dias%365)%30);

		System.out.printf("Voc� tem %d anos %d meses de idade ",a,m);
	}

}

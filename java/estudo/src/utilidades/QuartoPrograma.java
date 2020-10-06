package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) 
	{
	   Scanner ler = new Scanner (System.in);
	   
	   String nome;
	   int anoNasc,idade;
	   double salario;
	   
	   System.out.print("Escreva o seu nome: ");
	   nome = ler.next();
	   System.out.print("Digite o ano de nascimento: ");
	   anoNasc = ler.nextInt();
	   System.out.print("Digite o seu Salário: ");
	   salario = ler.nextDouble();
	   
	   idade = (2020-anoNasc);
	   
	  // System.out.println("Ola "+nome+" sua idade é de "+idade+" anos e seu salário é de R$ "+salario);
	   System.out.printf("Olá %s sua idade é de %d anos e seu salario é de R$ %2f",nome,idade,salario);
	   

	}

}

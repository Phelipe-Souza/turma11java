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
	   System.out.print("Digite o seu Sal�rio: ");
	   salario = ler.nextDouble();
	   
	   idade = (2020-anoNasc);
	   
	  // System.out.println("Ola "+nome+" sua idade � de "+idade+" anos e seu sal�rio � de R$ "+salario);
	   System.out.printf("Ol� %s sua idade � de %d anos e seu salario � de R$ %2f",nome,idade,salario);
	   

	}

}

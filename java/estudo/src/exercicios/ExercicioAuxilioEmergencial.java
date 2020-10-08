package exercicios;

import java.util.Scanner;

public class ExercicioAuxilioEmergencial {

	public static void main(String[] args) 
	{
      //Variaveis
		
		Scanner ler = new Scanner (System.in);
		
		int idade , anoNascimento;
		String nome;
		char sexo,chefe;
		
		System.out.print("informe Seu Nome : ");
		nome = ler.next();
		
		System.out.print("informe seu ano de nascimento: ");
		anoNascimento = ler.nextInt();
		
		idade = 2020 - anoNascimento;
		
	//	if (idade < 18 )  
		//{
		//	System.out.printf("Impossibilitado de proseguir por ser menor de idade");
			
	//	}
		
		
		System.out.print("\nDigite M para masculino ou F para feminino: ");
		sexo = ler.next().toUpperCase().charAt(0);
		
		System.out.print("Você é chefe de Familia ? Digite  S para sim ou N para não:  ");
		chefe = ler.next().toUpperCase().charAt(0);
		
		
		
		
		if ((sexo=='M' && idade >= 18 )  && chefe=='S')
		{
			System.out.printf("Olá %s o senhor tem direito ao auxilio emergencial no valo de R$ 1.200,00",nome);
		} 
		
		else if ((sexo=='F' && idade >= 18 )  && chefe=='S')
		{
			System.out.printf("Olá %s a senhora tem direito ao auxilio emergencial no valo de R$ 1.200,00",nome);
				
		}
		
		else if ((sexo=='F' && idade >= 18 )  && chefe=='N') 
		{
			System.out.printf("Olá %s a senhora tem direito ao auxilio emergencial no valo de R$ 600,00",nome);
				
		}
		
		else if ((sexo=='M' && idade >= 18 )  && chefe=='N') 
		{
			System.out.printf("Olá %s a senhor tem direito ao auxilio emergencial no valo de R$ 600,00",nome);
				
		}
		
		else if (idade < 18 )  
		{
			System.out.printf("Você não tem direito ao auxilio por não cumprir os requisitos");
				
		}
		
		else 
		{
			System.out.println("Opção Invalida");
			System.out.println("Programa Finalizado");
		}
      
		ler.close();

	}

}

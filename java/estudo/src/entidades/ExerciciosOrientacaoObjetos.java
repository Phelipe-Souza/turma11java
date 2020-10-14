package entidades;

import java.util.Scanner;

public class ExerciciosOrientacaoObjetos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		char sexo = ' ';
		
		System.out.print("Digite o seu Nome: ");
		cliente.nome = leia.next().toUpperCase();
		System.out.print("Digite F para Feminino M para Masculino e X para outros");
		cliente.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a sua idade: ");
		cliente.idade = leia.nextInt();
		System.out.printf("Olá %s defina seu sonho em uma palavra: ",cliente.nome);
		cliente.sonho = leia.next().toUpperCase();
		
	
		
		System.out.printf("\nNome: %s ",cliente.nome);
		System.out.println((cliente.sexo=='F')?"\nFeminino":(cliente.sexo=='M')?"\nMasculino":"\nOutros");
	    System.out.printf("Idade: %d",cliente.idade);
	    System.out.printf("\nO Maior sonho é %s",cliente.sonho );
	
	
	
	
	
	
	
	leia.close();
	}
	

}

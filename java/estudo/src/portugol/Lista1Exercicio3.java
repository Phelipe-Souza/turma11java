package portugol;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		/*
		 * //Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
//1seg=1seg
//1minuto = 60segundos 
//1h=60 minutos. 60*60 =3600


		
		inteiro tempoDuracao = 0
		inteiro horas = 0
		inteiro segundos = 0
		inteiro minutos = 0

		escreva("digite o tempo em segundos: ")
		leia(tempoDuracao)
		horas = tempoDuracao/3600
		escreva("total de horas ",horas)

		minutos = (tempoDuracao%3600)/60
		escreva("total de minutos ",minutos)
		segundos =(tempoDuracao%3600)%60
		escreva("total segundos ",segundos)
		

		//processamento 

	 
	}
}

		 */
		
	
	   Scanner leia = new Scanner(System.in);
	   
      /* int tempoDuracao = 0,horas = 0,segundos = 0, minutos = 0;
		
    	System.out.println("digite o tempo em segundos: ");
        tempoDuracao = leia.nextInt();
        horas = tempoDuracao/3600;
        System.out.println("Total de Horas é de"+horas);*/
	   
	   int segundos, horas, minutos, seg;
		
		System.out.print("Digite o tempo em segundos: ");
		segundos = leia.nextInt();
		horas = (segundos / 3600);
		minutos = ((segundos / 60) - (horas * 60));
		seg = segundos - ((horas * 3600) + (minutos * 60));
		
		System.out.println("horas : "+horas);
		System.out.println("minutos : "+minutos);
		System.out.println("segundos : "+seg);
		
		
		
		leia.close();
        
	}

}

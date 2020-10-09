package listaexercicio5;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) 
	
{
		/*idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
		 *(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a
		 * pessoa era agressiva). Pede-se para elaborar um sistema que permita 
		 * ler os dados de 150 pessoas, calcule e mostre: (WHILE)
           Limite de 150 pessoas
           
           numero de pessoas calmas
           numero de mulheres nervosa
           numero de homens agressivos
           numero de outros calmos
           numero de pessoas nervosas com mais de 40
           numero de pessoas calmas com menos de 18
         */
		
		Scanner leia = new Scanner(System.in);
	     
		//Variaveis
		final int LIMITE = 2;
		int idade;
	    byte sexo;
        byte tipoHumor;
        int mulheresNervosas=0,pessoasCalmas=0,homensAgressivos=0,nervosasMais40=0,
        calmasMenor18=0,outrosCalmos=0;
        int contador = 1, totalF,totalM,totalO;
        
        System.out.println("-----------Sistema de Pesquisa-----------");
       
        
        while (contador <= LIMITE) 
        {
        	System.out.print("Digite sua idade: ");
        	idade=leia.nextInt();
        	System.out.print("Digite 1-feminino / 2-masculino / 3-Outros: ");
        	sexo=leia.nextByte();
        	System.out.print("Digite 1 para Calma / 2 para Nervosa / 3 para Agressiva: ");
        	tipoHumor = leia.nextByte();
        	
        	
        	if (tipoHumor==1) 
        	{
        		pessoasCalmas=pessoasCalmas + 1;
        	}
        	
        	if ((tipoHumor==2) && (sexo==1)) 
        	{
        		mulheresNervosas=mulheresNervosas +1;
        		        		
        	}
        	
        	if ((tipoHumor==3)&&(sexo==2))
        	{
        		homensAgressivos=homensAgressivos+1;
        	}
        	
        	if ((tipoHumor==1)&&(sexo==3))
        	{
        		outrosCalmos=outrosCalmos+1;
        	}
        		
        	if ((idade>40)&&(tipoHumor==2))
        	{
        		nervosasMais40=nervosasMais40+1;
        	}
        	
        	if ((idade<18)&&(tipoHumor==1))
        	{
        		calmasMenor18=calmasMenor18+1;
        	}
        	
        	
        	
        	
        	contador++;
        }
        
        
        System.out.printf("\nO Total de pessoas Calmas é de %d",pessoasCalmas);
        System.out.printf("\nO Total de Mulheres nervosas é de %d",mulheresNervosas);
        System.out.printf("\nO total de homens agressivos é de %d",homensAgressivos);
        System.out.printf("\nO total de outros calmos é de %d",outrosCalmos);
        System.out.printf("\nO total de pessoas nervosas com mais de 40 anos é de %d",nervosasMais40);
        System.out.printf("\nO total de pessoas calmas menores de 18 anos é de %d",calmasMenor18);
        
        /*
        
           numero de pessoas calmas com menos de 18
         */
        
        System.out.println();
        
        System.out.println("Obrigado pela Participação!!");		
		
		
		
		
		leia.close();
	}

}

package exercicios;

import java.util.Scanner;

public class LacoRepeticao2 {

	public static void main(String[] args) {
		
		/*int num = 1;
		boolean continua = true;
		
		Scanner ler = new Scanner(System.in);
		
		while (continua && num<=1000){
			System.out.println(num);
			System.out.println("Continua? ");
			continua = ler.nextBoolean();
			num++;
		}
	    */
		 
		Scanner ler = new Scanner(System.in);
		
		int num = 1;
		char opc = 'S';
		
	   do {
		   System.out.println(num);
		   System.out.println("Continua S para sim e N para não: ");
		   opc = ler.next().toUpperCase().charAt(0);
		   
		   num++;
		   
	   }while (opc=='S');
	   
	   ;
	     
	
		
		

	}

}

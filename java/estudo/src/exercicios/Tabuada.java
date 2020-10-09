package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	     
		Scanner ler = new Scanner(System.in);
		
		int num = 1,x = 1,y = 1;
		
	
		for(x = 1; x <= 10; x++) {
			System.out.printf("\n\n Tabuada do %d",x);
		   for (y = 1; y <= 10; y++) 
		      {
			    num = x*y;
			    
			   System.out.printf("\n %d * %d = %d",x,y,num);
		      }
		}
		/*Scanner leia = new Scanner (System.in);
		int num;
		
		for (int i =1; i<=10; i++) {
			System.out.printf("\n\n--Tabuada do %d--",i);
			for (int j =1; j<=10; j++) {
				num= i*j;
			System.out.printf("\n %d * %d = %d",i,j, num);
			}

	}
*/
}
}

package exerciciosOrienta�aoObjetos;

public class TesteExercicio {

	public static void main(String[] args)
	{
		
	         Pessoas pessoa1 = new Pessoas("Phelipe");
	         Fornecedor fornecedor = new Fornecedor("Magazine Luiza");
	         Fornecedor fornecedor2 = new Fornecedor("Marabr�s","rua Javali",200.25);
		
	         
	         fornecedor2.setValorDivida(150.00);
	         
	         System.out.println("O saldo da "+fornecedor2.getNome()+" � de "+fornecedor2.obterSaldo());

	}

}

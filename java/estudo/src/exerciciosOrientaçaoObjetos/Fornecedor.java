package exerciciosOrientaçaoObjetos;

public class Fornecedor extends Pessoas 
{

	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome) 
	  {
		super(nome);
	  }
	
	public Fornecedor(String nome, String endereco, double valorCredito) 
	  {
		super (nome,endereco);
		this.valorCredito = valorCredito;
		
	  }

	public double obterSaldo() {
		return valorCredito-valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	
	
	
}

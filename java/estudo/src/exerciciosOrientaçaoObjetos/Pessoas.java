package exerciciosOrientaçaoObjetos;

public class Pessoas 
{
	
	//Atributos
	private String nome;
	private String endereco;
	private String telefone;

	//Construtor
	
	public Pessoas() {}
	
	
	//Subconstrutor
	public Pessoas (String nome,String endereco) 
	  {
	      	this.nome = nome;
	      	this.endereco = endereco;
      }
	
     


	public Pessoas(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	
	
}

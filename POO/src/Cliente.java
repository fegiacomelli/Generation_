
public class Cliente {
	
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
     esta classe, em seguida crie um objeto cliente, defina as instancias deste
     objeto e apresente as informações deste objeto no console.*/
	
	private String nomeCliente;
	private int idade;
	private String sexo;
	private String endereço;
	
	public Cliente(String nomeCliente,int idade,String sexo,String endereço) 
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.sexo = sexo;
		this.endereço = endereço;
	}
	public void printInfo()
	{
		
		
	System.out.println("\nNome do cliente: "+nomeCliente+"\nIdade: "+idade+"\nGenero: "+sexo+"\nEndereço: "+endereço);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	
}


public class Eletronico {
	
	/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto produto eletrônico,
    defina as instancias deste objeto e apresente as informações deste objeto
    no console.*/
	
	private String marca;
	private String modelo;
	private String cor;
	private int capacidade;
	private double valor;
	
	public Eletronico(String marca,String modelo,String cor,int capacidade,double valor)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.capacidade = capacidade;
		this.valor = valor;
	}
	
	public void InfoCell() 
	{
		System.out.println("\nMarca:"+marca+"\nModelo:"+modelo+"\nCor:"+cor+"\nCapacidade:"+capacidade+"Gb"+"\nValor: R$"+valor);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}

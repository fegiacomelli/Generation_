
public class contaBancaria {
	
	/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto conta bancaria, defina
    as instancias deste objeto e apresente as informações deste objeto no
    console.*/
	
	private String nomeP;
	private String enCobra;
	private float cpf;
	private int numConta;
	private String tipConta;
	private double saldo;
	
	public contaBancaria(String nomeP,String enCobra,float cpf,int numConta,String tipConta,double saldo)
	{
		this.nomeP = nomeP;
		this.enCobra = enCobra;
		this.cpf = cpf;
		this.numConta = numConta;
		this.tipConta = tipConta;
		this.saldo = saldo;
		
	}
	public void printC() 
	{
		System.out.println("\nNome do Proprietario:"+nomeP+"\nEndereço da Fatura:"+enCobra+"\nCPF:"+cpf+"\nNumero da Conta:"+numConta+"\nTipo da Conta:"+tipConta+"\nSaldo:R$"+saldo);
		
	}
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public String getEnCobra() {
		return enCobra;
	}
	public void setEnCobra(String enCobra) {
		this.enCobra = enCobra;
	}
	public float getCpf() {
		return cpf;
	}
	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipConta() {
		return tipConta;
	}
	public void setTipConta(String tipConta) {
		this.tipConta = tipConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	

	
	

}

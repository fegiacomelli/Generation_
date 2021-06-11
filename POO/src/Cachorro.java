
public class Cachorro extends Animal {
	
	private String nOfato;
	private String indPropria;
	
	public Cachorro(String nome,int idade,String nOfato,String indPropria)
	{
		super(nome,idade);
		this.nOfato = nOfato;
		this.indPropria = indPropria;
	}
	
	

	public void print()
	{
		System.out.println("\nNome do animal: "+getNome()+"\nIdade: "+getIdade()+" anos"+
				"\nNivel de ofato: "+nOfato+"\nPossui Impressão digital:"+indPropria);
	}

	public String getnOfato() {
		return nOfato;
	}

	public void setnOfato(String nOfato) {
		this.nOfato = nOfato;
	}

	public String getIndPropria() {
		return indPropria;
	}

	public void setIndPropria(String indPropria) {
		this.indPropria = indPropria;
	}
	
	@Override
	public void som() 
	{
		System.out.println("Som emitido é: Latido");
	}
	@Override
	public void mover() 
	{
		System.out.println("Sua Movimentação: Correr");
	}

}

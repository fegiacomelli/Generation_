
public class Preguica extends Animal {

	private String hAquatica;
	private  int tDormindo;
	
	public Preguica(String nome,int idade,String hAquatica,int tDormindo)
	{
		super(nome,idade);
		this.hAquatica = hAquatica;
		this.tDormindo = tDormindo;
	}
	
	public void print()
	{
		System.out.println("\nNome do animal: "+getNome()+"\nIdade: "+getIdade()+" anos"
				+"\nHabilidade Aquatica:"+hAquatica+"\nDormi por ate: "+tDormindo+"hrs");
	}
	
	
}

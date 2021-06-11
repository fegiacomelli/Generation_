
public class Cavalo extends Animal {
	
	private int tGestacao;
	private int expVida;

	public Cavalo(String nome,int idade,int tGestacao,int expVida)
	{
		super(nome,idade);
		this.tGestacao = tGestacao;
		this.expVida = expVida;
	}
	
	@Override
	public void som() 
	{
		System.out.println("Som emitido é: Relincho");
	}
	@Override
	public void mover() 
	{
		System.out.println("Sua Movimentação: Galopar");
	}
	
	public void print()
	{
		System.out.println("\nNome do animal: "+getNome()+"\nIdade: "+getIdade()+" anos"+"\nSua gestaçao dura: "+
	tGestacao+" meses"+"\nTempo de vida media de: "+expVida+" anos");
	
	}

	public int gettGestacao() {
		return tGestacao;
	}

	public void settGestacao(int tGestacao) {
		this.tGestacao = tGestacao;
	}

	public int getExpVida() {
		return expVida;
	}

	public void setExpVida(int expVida) {
		this.expVida = expVida;
	}
	
	
	
	
	
}

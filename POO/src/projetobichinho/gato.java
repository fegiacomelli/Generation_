package projetobichinho;

public class gato extends ANIMAL{

	public gato(String nome, int idade, String especie, String porte, String raca, String cor, String doenca,
			String vacina, String castrado, String comportamento, String endereco, int telefone, String sexo) 
	{
		super(nome, idade, especie, porte, raca, cor, doenca, vacina, castrado, comportamento, endereco, telefone, sexo);		
	}
	public void imprimirInfo () 
	{
		System.out.println ("Olá, eu sou um(a) "+getEspecie()+"da raça"+getRaca()+"de cor"+getCor()+",meu nome é "+getNome()+ " sou " +getSexo()+ " tenho "
				+getIdade()+"e sou de" +getPorte()+"sou muito"+getComportamento()+" e tenho "+getDoenca()+"ja fui "+getCastrado()+
				"você pode me encontrar no endereço: "+getEndereco()+" ou pelo telefone: "+getTelefone()+ "Vem ser meu amigo!");
	}


}

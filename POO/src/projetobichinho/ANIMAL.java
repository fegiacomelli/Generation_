package projetobichinho;

public class ANIMAL {

	private String nome;
	private String especie;
	private int idade;
	private String porte;
	private String raca;
	private String cor;
	private String doenca;
	private String vacina;
	private String castrado;
	private String comportamento;
	private String endereco;
	private int telefone;
	private String sexo;

	
	public ANIMAL (String nome, int idade, String especie, String porte, String raca,
			String cor,  String doenca,  String vacina,  String castrado,  String comportamento,
			 String endereco, int telefone, String sexo)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.castrado = castrado;
		this.comportamento = comportamento;
		this.cor = cor;
		this.doenca = doenca;
		this.endereco = endereco;
		this.especie = especie;
		this.porte = porte;
		this.telefone = telefone;
		this.vacina = vacina;
		}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getDoenca() {
		return doenca;
	}


	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}


	public String getVacina() {
		return vacina;
	}


	public void setVacina(String vacina) {
		this.vacina = vacina;
	}


	public String getCastrado() {
		return castrado;
	}


	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}


	public String getComportamento() {
		return comportamento;
	}


	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}


public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Felipe Giacomelli",25,"Masculino","Rua celso...");

		cliente1.printInfo();
		
		System.out.println("\nMudança de endereço");
		
		cliente1.setEndereço("\nRua Juventos...");
		cliente1.printInfo();
		
		
	}

}

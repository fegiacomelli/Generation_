package projetobichinho;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int s;
		System.out.println("\nQual Animal voce esta pesquisando: \n1-Cachorro\n2-Gato\n3Animais Silvestres\n0-Para encerrar");
	    s = scan.nextInt();		
		
		while(s!=0)
		{
		switch(s)
		{
			case 1:
				 cachorro cao1 = new cachorro("Dog","Lhasa Apso","preto","Mike","M",5,"Grande","Calmo","Vacinado","Cadrastrado","rua.....",9559595);
				 cao1.imprimirInfo();	
				break;
			case 2: 
				    
				break;
			case 3:
				    
		}
		System.out.println("\nQual Animal voce esta pesquisando: \n1-Cachorro\n2-Gato\n3Animais Silvestres\n0-Para encerrar");
	    s = scan.nextInt();
	}
           System.out.println("\nEncerrando pesquisa!"); 
	}

	

}

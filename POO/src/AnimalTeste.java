import java.util.Scanner;

public class AnimalTeste {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		int s;
		System.out.println("\nQual Animal voce esta pesquisando: \n1-Cachorro\n2-Cavalo\n3-Preguiça");
	    s = scan.nextInt();		
		
	    while(s!=0)
		{
		switch(s)
		{
			case 1:
				    Cachorro mike = new Cachorro("Mike",5,"Alto","No focinho");
				    mike.print();
				    mike.som();
				    mike.mover();
				break;
			case 2: 
				    Cavalo spirit = new Cavalo("Spirit",15,11,25);
				    spirit.print();
				    spirit.som();
				    spirit.mover();
				break;
			case 3:
				    Preguica bob = new Preguica("Bob",10,"Otima nadadora",20);
				    bob.print();
				    bob.som();
				    bob.mover();
		}
		System.out.println("\nQual Animal voce esta pesquisando: \n1-Cachorro\n2-Cavalo\n3-Preguiça\n0-Para encerrar");
	    s = scan.nextInt();
	}
           System.out.println("\nEncerrando pesquisa!"); 
	}
	    

}

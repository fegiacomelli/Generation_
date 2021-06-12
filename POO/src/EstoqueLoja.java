
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueLoja {
	
	public static void main(String[] args) {
	 
        
        int s;
		
         Scanner scan = new Scanner(System.in);
    	 List<Integer> list = new ArrayList<Integer>();
     
		
		System.out.println("\ntEscolha uma opção: ");
		System.out.println("\n1-Adicionar produtos\n2-Remover um produto"
				+ "\n3-Atualizar produto\n4-Mostrar produtos cadastrados");
	 
      
      s = scan.nextInt();
	  
      
      switch(s)
	  {
		  case 1: 
			    scan.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String p = scan.nextLine();
				   
			  break;
		  case 2:
			  scan.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String p1 = scan.nextLine();
				
				if(list.contains(p1))
				{
					list.remove(p1);
					System.out.println(list);
				}
				else
				{
					System.out.println("\nProduto invalido");
				}  
			  break;
		  case 3:
			  
			  
			  break;
		  case 4: 
			  break;
			  
	  }
	
	
     }  
} 

	
	

package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {

		int s;

		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("\nEscolha uma opção: ");
		System.out.println("\n1-Adicionar produtos\n2-Remover um produto"
				+ "\n3-Atualizar produto\n4-Mostrar produtos cadastrados");

		s = scan.nextInt();

		while (s != 0) {
			switch (s) {
			case 1:
				
				scan.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String p = scan.nextLine();
				list.add(p);
				
				break;
			case 2:
				scan.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String p1 = scan.nextLine();

				if (list.contains(p1)) {
					list.remove(p1);
					System.out.println(list);
				} else {
					System.out.println("\nProduto invalido");
				}
				break;
			case 3:
				scan.nextLine();
				System.out.println("\nDigite o produto para remover e atualizar: ");
				System.out.println(list);
				String p2 = scan.nextLine();
                  
				if (list.contains(p2)) {
					
					list.remove(p2);
					System.out.println("\nDigite o produto que deseja colocar no lugar: ");
					String p3 = scan.nextLine();
					list.add(p3);
				} else {
					System.out.println("\nProduto invalido");
				}

				break;
			case 4:
				System.out.println(list);
				break;
			default:
				System.out.println("\nEscolha uma opção: ");
				System.out.println("\n1-Adicionar produtos\n2-Remover um produto"
						+ "\n3-Atualizar produto\n4-Mostrar produtos cadastrados");
			}
			System.out.println("\nEscolha uma opção: ");
			System.out.println("\n1-Adicionar produtos\n2-Remover um produto"
					+ "\n3-Atualizar produto\n4-Mostrar produtos cadastrados");
			s = scan.nextInt();

		}
	}
}

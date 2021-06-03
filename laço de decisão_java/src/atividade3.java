import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
   10-14 infantil
   15-17 juvenil
   18-25 adulto
     */


public class atividade3 {

	public static void main(String[] args) {
		
		int idade; 
		String nome;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		nome = scan.next();
		System.out.println("\nDigite sua idade: ");
		idade = scan.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\n"+nome+"Sua categoria é Infantil");
            System.out.println("\nBoa sorte!!!");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\n"+nome+"\nSua categoria é Juvenil");
			System.out.println("\nBoa sorte!!!");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\n"+nome+"\nSua categoria é Adulto");
			System.out.println("\nBoa sorte!!!");
		}
		else
		{
			System.out.println("\n"+nome+"\nSua idade não e permitido em nunhuma categoria");
		}
		
		 
	}

}

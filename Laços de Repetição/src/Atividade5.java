import java.util.Scanner;

public class Atividade5 {
	
	/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/

	public static void main(String[] args) {
		
		float num,sDN=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira um numero");
		num = scan.nextFloat();
		
		do 
		{
		    sDN = sDN + num;   
		    
		    System.out.println("\nInsira um numero");
			num = scan.nextFloat();
		    
		}
		while(num>0);
		
		
		
		System.out.println("\nA soma dos numeros digitados é: "+sDN);
		
		

	}

}

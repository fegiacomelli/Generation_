import java.util.Scanner;

public class Atividade5 {
	
	/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/

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
		
		
		
		System.out.println("\nA soma dos numeros digitados �: "+sDN);
		
		

	}

}

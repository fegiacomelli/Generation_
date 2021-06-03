import java.util.Scanner;

public class atividade4 {

	/*Faça um programa em que permita a entrada de um número qualquer 
 * e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
      se for ímpar exiba o número elevado ao quadrado.*/
	
	public static void main(String[] args) {
		
		float num;
		double r;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira um numero: ");
		num = scan.nextFloat();
		
		if(num%2==0)
		{
			r =  Math.sqrt(num);
			System.out.println("\n"+num+" é numero par");
			System.out.printf("\nA raiz quadrada é : %2.2f",r);
		}
		else 
		{
			r =  Math.pow(num,2);
			System.out.println("\n"+num+" é numero impar!");
			System.out.printf("\nA Elevado ao quadrado é : %2.2f",r);
		}	
		

	}

}

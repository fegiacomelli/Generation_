import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior*/

public class atividade1 {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.println("\nInsira o segundo numero: ");
		num2 = scan.nextInt();
		System.out.println("\nInsira o terceiro numero: ");
		num3 = scan.nextInt();
		
		if(num1>=num2 && num1>=num3)
		{
			
			System.out.println("\nSeu maior numero � : "+num1);
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println("\nSeu maior numero � : "+num2);	
		}
		else
		{
			System.out.println("\nSeu maior numero � : "+num3);
		}
	}

}

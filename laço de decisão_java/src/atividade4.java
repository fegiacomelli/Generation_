import java.util.Scanner;

public class atividade4 {

	/*Fa�a um programa em que permita a entrada de um n�mero qualquer 
 * e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
      se for �mpar exiba o n�mero elevado ao quadrado.*/
	
	public static void main(String[] args) {
		
		float num;
		double r;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira um numero: ");
		num = scan.nextFloat();
		
		if(num%2==0)
		{
			r =  Math.sqrt(num);
			System.out.println("\n"+num+" � numero par");
			System.out.printf("\nA raiz quadrada � : %2.2f",r);
		}
		else 
		{
			r =  Math.pow(num,2);
			System.out.println("\n"+num+" � numero impar!");
			System.out.printf("\nA Elevado ao quadrado � : %2.2f",r);
		}	
		

	}

}

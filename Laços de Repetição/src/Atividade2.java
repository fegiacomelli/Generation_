import java.util.Scanner;

public class Atividade2 {

	/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
	
	public static void main(String[] args) {
		
		float num,contP=0,contI=0,x;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira um Numero");
		num = scan.nextFloat();
		
		for(x=1;x<10;x++)
		{
			if(num%2==0)
			{
				contP++;
			}
			else {
				contI++;
			}
			
			System.out.println("\nInsira um Numero");
			num = scan.nextFloat();
		}
		
		System.out.println("\nNumeros Pares: "+contP);
		System.out.println("\nNumero Impares: "+contI);

	}

}

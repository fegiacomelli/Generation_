import java.util.Scanner;

public class Introdução_aos_Algoritmos_2 {

	public static void main(String[] args) {
		float dias,anos,totalDeDias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o numero de dias: ");
		dias = leia.nextInt();
		
		dias = dias / 365;
		
		System.out.printf("\nVoce tem: %2.2f",dias,"anos");
		

	}

}

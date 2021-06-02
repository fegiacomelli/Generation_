import java.util.Scanner;

public class Introdução_aos_Algoritmos_1 {

	public static void main(String[] args) {
		
		int ano,mes,dias,dia,meses,anos,totalDeDias;
		
		Scanner leia = new Scanner (System.in);
                
		System.out.println("Digite o numero de dias: ");
		dias = leia.nextInt();
		System.out.println("Digite o numero de meses: ");
		meses = leia.nextInt();
		System.out.println("Digite o numero de anos: ");
		anos = leia.nextInt();
		
		meses = meses * 30;
		anos = anos * 365;
		
	  totalDeDias = dias + meses + anos;
	  
	  System.out.println("\nTotal de dias é: "+totalDeDias);
	
		
		
	}

}

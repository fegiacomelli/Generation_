import java.util.Scanner;

public class Introdução_aos_Algoritmos_8 {

	public static void main(String[] args) {
		
		double vCusto,vFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nInsira o valor do carro: ");
		vCusto = ler.nextFloat();
		
		vFinal = vCusto + (vCusto * 0.73);
        
		System.out.println("\nValor final do carro é: R$"+vFinal);
	}

}

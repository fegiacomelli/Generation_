import java.util.Scanner;

public class Introdução_aos_Algoritmos_4 {

	public static void main(String[] args) {
		double a,b,c,d,r,s;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nInsira o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nInsira o valor de C: ");
		c = leia.nextInt();
		
		r = Math.sqrt(a+b);
		s = Math.sqrt(b+c);
		d = (r+s)/2;
		
		System.out.printf("\nValor de D é: %2.2f",d);
		
		
	}

}

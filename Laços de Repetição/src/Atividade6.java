import java.util.Scanner;

public class Atividade6 {
	
	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

	public static void main(String[] args) {
		
		int num,cNUM=0,sNUM=0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("\nInsira um numero");
		num = scan.nextInt();
		
		
		do 
		{
		    if(num%3==0) {
		    	cNUM++;
		    	sNUM = sNUM + num;
		    }
		    	
		    
		    System.out.println("\nInsira um numero");
			num = scan.nextInt();
		    
		}
		while(num>0);
		
		
		sNUM = sNUM / cNUM;
		System.out.println("\nA m�dia da soma dos n�meros m�ltiplos de 3 �: "+sNUM);
		
		

	}

}

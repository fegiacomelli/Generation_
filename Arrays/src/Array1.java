import java.util.Scanner;

public class Array1 {
	
	/*1- Faça um programa que possua um vetor denominado A que armazene 6 números
     inteiros. O programa deve executar os seguintes passos:
     (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
     (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
      A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
     (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
      (d) Mostre na tela cada valor do vetor A, um em cada linha.*/

	public static void main(String[] args) {
		
		float [] A = {1,0,5,-2,-5,7};
		float [] B = new float[6];
		float num=0;
		int x=0;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira um numero: ");
	    B[x] = scan.nextInt();
	    
	    
	    for(x=0;x<6;x++)
	    {
	    	B[x] = B[x] + A[x];
	        System.out.println(B[x]); 
    
	    }

	}

}

import java.util.Scanner;

public class Array2 {
	
	/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
    � Os n�meros pares digitados;
    � A soma dos n�meros pares digitados;
    � Os n�meros �mpares digitados;
    � A quantidade de n�meros �mpares digitados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float [] numero = new float[6];
		float somaPar=0,contI=0;
	
		Scanner scan = new Scanner(System.in);
			
		for(int x=0;x<6;x++)
		{
			System.out.println("\nInsira um numero: ");
			numero[x] = scan.nextFloat();
			
			                     if(numero[x]%2==0)
			                     {
			                    	somaPar += numero[x]; 
			                     }
			                     else
			                     {
			                    	 contI++;
			                     }
	                     
		}
		
		for(int x=0;x<6;x++)
        {  
			      if(numero[x]%2==0)
			      {
	        	   System.out.println("Pares: "+numero[x]);
			      }
    
        }
		
		System.out.println("\nSoma total dos pares: "+somaPar);
		
		for(int x=0;x<6;x++)
        {  
			      if(numero[x]%2==1)
			      {
	        	   System.out.println("Impares: "+numero[x]);
			      }
    
        }
		
		System.out.println("\nTotal de numeros impares: "+contI);

	}

}

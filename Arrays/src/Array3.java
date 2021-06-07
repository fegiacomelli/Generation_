import java.util.Scanner;

public class Array3 {
	
	/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [][] m = new float[3][3];
		int l=0,c=0;
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
	    for(l=0;l<3;l++)
	    {
	    	for(c=0;c<3;c++)
	    	{
	    		System.out.println("\nInsira um numero: ");
	    	    m[l][c] = scan.nextFloat();

	        }
	    	

	     }
        for(l=0;l<3;l++)
        {  
        	for(c=0;c<3;c++)
        	{
	          if(m[l][c]>10)
	          {  
	        	 System.out.println("\t "+m[l][c]);
	          }
        	}
        }
}
	
}	

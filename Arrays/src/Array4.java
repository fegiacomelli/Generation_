import java.util.Scanner;

public class Array4 {

	/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
    menu de opções:
   (1) somar as duas matrizes
   (2) subtrair a primeira matriz da segunda
   (3) adicionar uma constante as duas matrizes
   (4) imprimir as matrizes
   Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
   da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
   própria matriz.*/
	
public static void main(String[] args) {
	
	float [][] A = new float[2][2];
	float [][] B = new float[2][2];
	int x=0,y=0,s;
	float somaM;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("\nInsira um numero: ");
	somaM = scan.nextFloat();
	
	
    for(x=0;x<2;x++)
    {
    	for(y=0;y<2;y++)
    	{
    		  		
    		System.out.println("\nInsira um numero A: ");
    	    A[x][y] = scan.nextFloat();
    	    System.out.println("\nInsira um numero B: ");
    	    B[x][y] = scan.nextFloat();

        }
     }
            System.out.println("\nMenu de opções: \n1-Somar as duas matrizes\n2-Subtrair a primeira matriz da segunda"
            + "\n3-Adicionar uma constante as duas matrizes\n4-Imprimir as matrizes");
	        s = scan.nextInt();
            
           switch(s)
           {
		
           case 1:    
        	   for(x=0;x<2;x++)
        	    {
        	    	for(y=0;y<2;y++)
        	    	{
        	    		  		
        	         A[x][y] = A[x][y] + B[x][y];        	    	    
                    System.out.println(" "+A[x][y]);
        	        }
        	     } 
			break;	
           
           case 2:
        	   for(x=0;x<2;x++)
       	    {
       	    	for(y=0;y<2;y++)
       	    	{
       	    		  		
       	    	 A[x][y] = A[x][y]- B[x][y];        	    	    
                   System.out.println(" "+A[x][y]);
       	        }
       	     } 
        	   
		    break;
		    
           case 3:
        	   for(x=0;x<2;x++)
               {   
               	     for(y=0;y<2;y++)
               	     {
               	    	A[x][y] = A[x][y] + somaM;
               	    	B[x][y] = B[x][y] + somaM;
               	    	System.out.println(" "+A[x][y]);
               	    	System.out.println(" "+B[x][y]);
       	        	 
               	     }
               }	   
            break;	
           case 4:	
        	   for(x=0;x<2;x++)
               {  
        		   
               	     for(y=0;y<2;y++)
               	     {
       	        	 System.out.println(A[x][y]+"\t"+B[x][y]);
       	        	 
               	     }
               }
        	   
		    break;	
		   default : 
			   System.out.println("Opção invalida");
           }
	}

}

import java.util.Scanner;

public class atividade2 {
	
	/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.println("\nInsira o segundo numero: ");
		num2 = scan.nextInt();
		System.out.println("\nInsira o terceiro numero: ");
		num3 = scan.nextInt();
		
		if(num1<num2 && num1<num3)
		{
        	   if(num2<num3)
        	   {
        		   System.out.println("\nA ordem �: "+num1+" "+num2+" "+num3);
        	   }
        	   else
        	   {
        		   System.out.println("\nA ordem �: "+num1+" "+num3+" "+num2);
        	   }
        	
		}
        	      
		else if(num2<num3 && num2<num1)
           {
			 if(num1<num3)
      	   {
      		   System.out.println("\nA ordem �: "+num2+" "+num1+" "+num3);
      	   }
      	   else
      	   {
      		   System.out.println("\nA ordem �: "+num2+" "+num3+" "+num1);
      	   }
        	    	   
            }
        	    	      
		else if(num3<num1 && num3<num2)
          {
			 if(num2<num1)
      	   {
      		   System.out.println("\nA ordem �: "+num3+" "+num2+" "+num1);
      	   }
      	   else
      	   {
      		   System.out.println("\nA ordem �: "+num3+""+num1+""+num2);
      	   }
          }

        	       
		
		                  

	}

}

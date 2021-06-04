import java.util.Scanner;

public class Atividade4 {
	
	/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
	 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
	 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
	 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
     o número de pessoas calmas; 
     o número de mulheres nervosas; 
     o número de homens agressivos; 
     o número de outros calmos;
     o número de pessoas nervosas com mais de 40 anos; 
     o número de pessoas calmas com menos de 18 anos.*/

	public static void main(String[] args) {
		
		int idade,s,pC=0,mN=0,hA=0,oC=0,pNV=0,pCN=0,t,NP=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nVamos começar a pesquisa: 0=Não e 1=Sim");
		NP = scan.nextInt();
		
		while(NP!=0)
		{	
		
		System.out.println("\nQual seu sexo: ");
		System.out.println("\n1-Feminino");
		System.out.println("\n2-Masculino");
		System.out.println("\n3-Outros");
		s = scan.nextInt();
		
		switch(s)
		{
		
		case 1: 
			System.out.println("\nQual sua idade: ");
			idade = scan.nextInt();
			System.out.println("\nQual sua características psicológicas: ");
			System.out.println("\n1-Calma");
			System.out.println("\n2-Nervosa");
			System.out.println("\n3-Agressiva");
			
			t = scan.nextInt();
			switch(t)
			{
		         case 1:
		        	 pC++;
		        	 if(idade<18) 
		        	 {
		        		pCN++; 
		        	 }	        	
		        	 break;
		         case 2:
		        	 mN++;
		        	 if(idade>40) 
		        	 {
		        		pNV++; 
		        	 }    	 
		        	 break; 
			}
		break;
			
		
		case 2:
			
			System.out.println("\nQual sua idade: ");
			idade = scan.nextInt();
			System.out.println("\nQual sua características psicológicas: ");
			System.out.println("\n1-Calmo");
			System.out.println("\n2-Nervoso");
			System.out.println("\n3-Agressivo");
			t = scan.nextInt();
			
			switch(t)
			{
		         case 1:
		        	 pC++;
		        	 if(idade<18) 
		        	 {
		        		pCN++; 
		        	 }	        	
		        	 break;
		         case 2:
		        	 if(idade>40) 
		        	 {
		        		pNV++; 
		        	 }    	
		        	 
		         case 3:
		        	 hA++;
		        	 break; 
		        	 
			}
			
		break;
	
	
		case 3:
			
			System.out.println("\nQual sua idade: ");
			idade = scan.nextInt();
			System.out.println("\nQual sua características psicológicas: ");
			System.out.println("\n1-Calma");
			System.out.println("\n2-Nervosa");
			System.out.println("\n3-Agressiva");
			t = scan.nextInt();
		
			switch(t)
			{
		         case 1:
		        	 pC++;
		        	 oC++;
		        	 if(idade<18) 
		        	 {
		        		pCN++; 
		        	 }	        	
		        	 break;
 
			}
		break;
		}
		
		System.out.println("\nDeseja continuar 0=Não e 1=Sim");
		NP = scan.nextInt();

	}
		
		System.out.println("\nO número de pessoas calmas: "+pC);
		System.out.println("\nO número de mulheres nervosas: "+mN);
		System.out.println("\nO número de homens agressivos: "+hA);
		System.out.println("\nO número de outros calmos: "+oC);
		System.out.println("\nO número de pessoas nervosas com mais de 40 anos: "+pNV);
		System.out.println("\nO número de pessoas calmas com menos de 18 anos: "+pCN);

	}		
}

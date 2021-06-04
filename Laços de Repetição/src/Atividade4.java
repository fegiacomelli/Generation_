import java.util.Scanner;

public class Atividade4 {
	
	/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
	 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
	 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
	 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
     o n�mero de pessoas calmas; 
     o n�mero de mulheres nervosas; 
     o n�mero de homens agressivos; 
     o n�mero de outros calmos;
     o n�mero de pessoas nervosas com mais de 40 anos; 
     o n�mero de pessoas calmas com menos de 18 anos.*/

	public static void main(String[] args) {
		
		int idade,s,pC=0,mN=0,hA=0,oC=0,pNV=0,pCN=0,t,NP=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nVamos come�ar a pesquisa: 0=N�o e 1=Sim");
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
			System.out.println("\nQual sua caracter�sticas psicol�gicas: ");
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
			System.out.println("\nQual sua caracter�sticas psicol�gicas: ");
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
			System.out.println("\nQual sua caracter�sticas psicol�gicas: ");
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
		
		System.out.println("\nDeseja continuar 0=N�o e 1=Sim");
		NP = scan.nextInt();

	}
		
		System.out.println("\nO n�mero de pessoas calmas: "+pC);
		System.out.println("\nO n�mero de mulheres nervosas: "+mN);
		System.out.println("\nO n�mero de homens agressivos: "+hA);
		System.out.println("\nO n�mero de outros calmos: "+oC);
		System.out.println("\nO n�mero de pessoas nervosas com mais de 40 anos: "+pNV);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos: "+pCN);

	}		
}

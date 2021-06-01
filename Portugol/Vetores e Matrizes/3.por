programa
{
	/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
     a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
        das matrizes N1 e N2;
     b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
        posição das matrizes N1 e N2.*/
	funcao inicio()
	{
		real N1[4][6],N2[4][6],M1[4][6],M2[4][6]
		inteiro x=0,y=0
		
		

		para(x=0;x<4;x++){
			

			para(y=0;y<6;y++){
				escreva("\nInsira os valores N1: ")
                  	leia(N1[x][y])
                  	escreva("\nInsira os valores N2: ")
                  	leia(N2[x][y])
			limpa()	
	
			}
      	
	    } 
			  para(x=0;x<4;x++){
			  	
			         para(y=0;y<6;y++){
                        M1[x][y] = N1[x][y] + N2[x][y]
			         escreva("\nSoma ",N1[x][y]," + ",N2[x][y]," = ",M1[x][y])
			         }
			         
			   }

			   para(x=0;x<4;x++){
			  	
			         para(y=0;y<6;y++){
                        M2[x][y] = N1[x][y] - N2[x][y]
			         escreva("\nDiferença ",N1[x][y]," - ",N2[x][y]," = ",M2[x][y])
			         }
			         
			   }
   }
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N2, 10, 17, 2}-{M1, 10, 26, 2}-{M2, 10, 35, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
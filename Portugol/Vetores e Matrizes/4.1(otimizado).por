programa
{
	
/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
       em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
       diagonal, ou seja, diagonal principal.*/
	funcao inicio()
	{
		real v[3][3],somaV=0.0,somaVD=0.0 
		inteiro x
		,y

		para(x=0;x<3;x++){

                  para(y=0;y<3;y++){
                  	escreva("Insira os valores: ")
                  	leia(v[x][y])
                            
                            somaV = somaV + v[x][y]
 		                  
 		                  se(x == y){
                            somaVD = somaVD + v[x][y]
 		                  }           
 		        }
	
		}
		limpa()
		
		escreva("\nA soma dos valores é: ",somaV)
		escreva("\nA soma da diagonal principal é: ",somaVD)
	}
}
 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 580; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 9, 7, 1}-{somaV, 9, 15, 5}-{somaVD, 9, 25, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
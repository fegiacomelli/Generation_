programa
{
	/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
       em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
       diagonal, ou seja, diagonal principal.*/
	funcao inicio()
	{
		real v[3][3],somaV=0.0,somaVD=0.0 
		inteiro x,y

		para(x=0;x<3;x++){

                  para(y=0;y<3;y++){
                  	escreva("Insira os valores: ")
                  	leia(v[x][y])

 		                 se(v[x][y]>=0){

 		                 somaV = somaV + v[x][y]

 		                 }           
 		        }
	
		}
		limpa()
		somaVD = v[0][0] + v[1][1] + v[2][2]
		escreva("\nA soma dos valores é: ",somaV)
		escreva("\nA soma da diagonal principal é: ",somaVD)
	}
} 

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 8, 7, 1}-{somaV, 8, 15, 5}-{somaVD, 8, 25, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
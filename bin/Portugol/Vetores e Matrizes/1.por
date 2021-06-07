programa
{
	/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

	funcao inicio()
	{
		real   numP[5],mP=0.0
		inteiro x=0

                para(x=0;x<5;x++){
                	escreva("Insira a pontuação: ")
                	leia(numP[x])
                	

                     se(mP<numP[x]){
                     	mP = numP[x]  
                     }	
               
                	
                }
                limpa()
                para(x=0;x<5;x++){
                escreva("\nEstas são as pontuações: ",numP[x])

                }
		escreva("\nA maior pontuação foi: ",mP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 673; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numP, 8, 9, 4}-{mP, 8, 17, 2}-{x, 9, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
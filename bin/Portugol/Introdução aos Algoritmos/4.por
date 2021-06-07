programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
         
         
         real A,B,C,D,R,S


         escreva("\nInsira o valor de A: ")
         leia(A)
         escreva("\nInsira o valor de B: ")
         leia(B)
         escreva("\nInsira o valor de C: ")
         leia(C)
         
         R = mat.raiz((A+B), 2.0)
         S = mat.raiz((B+C), 2.0)
         D = (R+S)/2

	

         escreva("\nValor de D é: ",mat.arredondar(D,2))
         

	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
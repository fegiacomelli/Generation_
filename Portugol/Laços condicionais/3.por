programa
{
	/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	 real num1,num2,num3,num4,res1,res2,res3,res4
	 
      escreva("\n Insira o Numero 1: ")
		leia(num1)
		escreva("\n Insira o Numero 2: ")
		leia(num2)
		escreva("\n Insira o Numero 3: ")
		leia(num3)
		escreva("\n Insira o Numero 4: ")
		leia(num4)

		res1 = mat.raiz(num1,2.0)
		res2 = mat.raiz(num2,2.0)
		res3 = mat.raiz(num3,2.0)
		res4 = mat.raiz(num4,2.0)

		se(res3 >=1000) 
		{
		escreva("\nResuldado Numero 3:",res3)	
	     }
          senao 
          {
          escreva("\nValor digitado: ",num1,"\nSua raiz quadrada é: ",res1,"\n")
          escreva("\nValor digitado: ",num2,"\nSua raiz quadrada é: ",res2,"\n")
          escreva("\nValor digitado: ",num3,"\nSua raiz quadrada é: ",res3,"\n")
          escreva("\nValor digitado: ",num4,"\nSua raiz quadrada é: ",res4,"\n")
          }
	     

      }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
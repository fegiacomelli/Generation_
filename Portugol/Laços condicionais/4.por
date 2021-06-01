programa
{
	/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/
	funcao inicio()
	{
		inteiro num

		escreva("\nEscreva um numero: ")
		leia(num)

          se(num%2==0)
          {
          	se(num>=0)
          	{
          		escreva("Este numero e par e positivo")
          	}
          	senao
          	{
          		escreva("Este numero e par e positivo")
          	}
          }
          senao
          {
          	se(num<0)
          	{
          		escreva("Este numero e impar e negativo ")
          	}
          	senao
          	{
          		escreva("Este numero e impar e positivo")
          	}
          }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
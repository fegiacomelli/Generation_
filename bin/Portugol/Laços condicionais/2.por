programa
{
	/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de 
	horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/
	funcao inicio()
	{
	real C,N,hora,E,T
	cadeia nome

	escreva("\n Insira o nome do Trabalhador : ")
		leia(nome)
		escreva("\n Insira o  numero de horas: ")
		leia(hora)  

		E =  hora - 50
          C  = 50.00 * 10
		
		se (hora>50)
		{	  
		  N  = (E *20) + C
		  T  = N - C 
            escreva("\n Salario Total é: R$",N," salário excedente: R$",T)  
	     }
	     
	     senao 
	     {
          escreva("\n Salario Total é: ",C)
	     }

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 727; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
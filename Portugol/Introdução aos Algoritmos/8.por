programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
      real vCusto,vFinal1,vImposto,vDis,vFinal2,vFinal3
	
      escreva("\nInsira o valor do carro: ")
      leia(vCusto)
       escreva("\nInsira o valor do Imposto: ")
      leia(vImposto) 
       escreva("\nInsira o valor do distribuidor: ")
      leia(vDis)  

     
      vFinal1 = (vCusto * ( vImposto / 100 ))
      vFinal2 = (vCusto * ( vDis / 100 ))
      vFinal3 = vCusto + vFinal2 + vFinal1
      
      escreva("\nValor do carro ao consumidor é : " ,vFinal3)
      
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
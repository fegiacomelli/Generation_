programa
{
	inclua biblioteca Matematica-->mat
	/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
     coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
     a) média do salário da população;
     b) média do número de filhos;
     c) maior salário;
     d) percentual de pessoas com salário até R$100,00.*/
	funcao inicio()
	{
     
     real S=0.0,maiorS=0.0,pM=0.0,mS=0.0
     inteiro nH,n,mF=0,numF
     cadeia nome
     
         escreva("\nEscreva o numero de habitate: ")
         leia(n)

     para(nH=1;nH<=n;nH++)
     {
         escreva("\nEscreva o nome do habitate: ")
         leia(nome)
         escreva("\nValor do salario: ")
         leia(S)
         escreva("\nNumero de filhos: ")
         leia(numF)
         
           maiorS = maiorS + S
           mF = mF + numF 
           mS = mS + S

          escreva("\nHabitante: ",nome,"\nNumero de filho: ",numF,"\n")
         
        se(mS<S)
        {
        	mS = S
        }

        se(S<=100)
        {
        	pM++
        }       

	}
	
	mS = mS/n
	mF = mF/n
	pM = (pM/n)*100

	escreva("\nMedia de filhos por Habitante: ",mF)
	escreva("\nMedia salarial: R$",mS)
	escreva("\nPessoas com salario maior que R$100: ",pM,"%")
     	

 
}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1095; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
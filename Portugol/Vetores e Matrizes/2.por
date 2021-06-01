programa
{
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
	funcao inicio()
	{
	       real dL[10],media=0.0,mP=0.0,soma=0.0
	       inteiro num=0

	       para(num=0;num<10;num++){
                  escreva("\nInsira o dado: ")
                  leia(dL[num])
    

                  se(mP<dL[num]){
                  	mP = dL[num] 
                  }
                   soma = soma + dL[num]
                   limpa()

	       }

	        media = soma / 10
            escreva("Maior pontuação: ",mP)
	       escreva("\nSoma: ",soma)
	       escreva("\nMedia: ",media)
	       
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 728; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dL, 9, 13, 2}-{media, 9, 20, 5}-{mP, 9, 30, 2}-{soma, 9, 37, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
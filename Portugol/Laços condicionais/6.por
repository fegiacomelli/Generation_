programa
{
	/*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
      categorias:
      Infantil A = 5 a 7 anos
      Infantil B = 8 a 11 anos
      Juvenil A = 12 a 13 anos
      Juvenil B = 14 a 17 anos
      Adultos = Maiores de 18 anos*/
	funcao inicio()
	{
		inteiro iA,iB,jA,jB,i
		cadeia  nome

		escreva("\n Insira o nome do nadador :")
		leia(nome)
		escreva("\n Insira o idade do nadador :")
		leia(i)

	
              se(i >= 5 e i<= 7)
              { 
               escreva("\nSua categoria e infantil A boa sorte!!!")
              }      
              
              senao se (i>=8 e i<=11)
                   {
                   escreva("\nSua categoria e infantil B boa sorte!!!")
                   }

             senao se (i>=12 e i<=13)
                  {    
                   escreva("\nSua categoria e juvenil A boa sorte!!!")
                  }
                  
             senao se (i>=14 e i<=17)
                   {
                    escreva("\nSua categoria e juvenil B boa sorte!!!")
                   } 
             senao se (i>=18)
                   {
                   	escreva("\nSua categoria e Adulto boa sorte!!!")        
                   }
             
             senao
                  {
                   escreva("\n",nome,"!!!Sua idade não e permitido")
                  }


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
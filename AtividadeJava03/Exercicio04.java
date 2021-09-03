package br.com.generatio.AtividadeJava03;

import java.util.Scanner;

public class Exercicio04 {
/*Uma empresa desenvolveu uma pesquisa para saber as características 
 *psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 *(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 *Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre
 *   : (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
			int fem, masc, outros, idade, sexo, humor;
			int calma1 = 1, nervosa2 = 2, agressiva3 = 3;
			int numPCalma = 0, numMuNerv = 0, numMcalma;
			int numHoAgre = 0, numOutrosCal = 0, numPesNmais40 = 0, numPesCmenos18 = 0, numPessoa = 0;
		
			
	
				
				while(numPessoa <2) {

				    System.out.println("Informe aqui sua idade" );
				    idade = leia.nextInt();
				    System.out.println("Informe  sexo: (1 fem/2 masc/3 out) ");
				    sexo = leia.nextInt();
				    System.out.println("Informe  seu humor: (1 calm/2 nerv/3 agress) ");
				    humor = leia.nextInt();


				    if (humor == 1) {
				    numPCalma++; 
				    }
				    if (sexo == 1 && humor == 2)  {
				    numMuNerv++;
				    }
				    if (sexo == 2 && humor == 3)  {
				    numHoAgre++;
				    }
				    if (sexo == 3 && humor == 1)  {
				    numOutrosCal++;
				    }
				    if (idade > 40 && humor == 2) {
				    numPesNmais40++;
				    }
				    if (idade < 18 && humor == 1) {
				    numPesCmenos18++;
				    }


				    numPessoa++;

				    }

				    System.out.println("O numero de pessoas calmas: " + numPCalma);
				    System.out.println("O numero de mulheres nervosas: " + numMuNerv);
				    System.out.println("O numero de homens agressivos: " + numHoAgre);
				    System.out.println("O numero de outros calmos: " + numOutrosCal);
				    System.out.println("O numero de pessoas nervosas com mais 40: " + numPesNmais40);
				    System.out.println("O numero de pessoas calmas com menos 18: " + numPesCmenos18);



				    leia.close();
		
	}

}

package br.com.generation.atividade.matrizvetores;

import java.util.Scanner;
/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e 
 * apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
a m�dia
o valor do maior
quantas vezes foram guardados o maior valor
*/
public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int x = 0, soma=0, maiorNum = 0, nMmaisX =0;
		
		int []dado = new int[10];
		
		
		
		System.out.println("Digite 10 numeros de 1 a 6");
		for(x = 0; x <= 9; x++) {
			System.out.print("Digite o" + (x + 1) + " � numero:");	
			dado[x] = leia.nextInt();
			
			if (dado[x] >= maiorNum) {
				if (dado[x] == maiorNum) {
					nMmaisX++;
					}
				else {
					nMmaisX = 0;					
				}
				
				maiorNum = dado[x];
					
			}
			
			
			soma = soma + dado[x];		//soma += dado[x]
		
			
		}
		System.out.print("Os numeros lan�ados foram: \n");
		
		for(x = 0; x <= 9; x++) {
			System.out.print("|" + dado[x]);
		}
		
						
		
		System.out.println("\nA media dos numeros lan�ados : " + soma/(dado.length));
		System.out.println("O maior numero foi lan�ado  " + maiorNum);
		
		
		leia.close();
		

	}

}

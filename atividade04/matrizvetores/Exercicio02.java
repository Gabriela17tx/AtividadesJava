package br.com.generation.atividade.matrizvetores;

import java.util.Scanner;
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
 * apresente também quantas foram as ocorrências da maior pontuação.
a média
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
			System.out.print("Digite o" + (x + 1) + " º numero:");	
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
		System.out.print("Os numeros lançados foram: \n");
		
		for(x = 0; x <= 9; x++) {
			System.out.print("|" + dado[x]);
		}
		
						
		
		System.out.println("\nA media dos numeros lançados : " + soma/(dado.length));
		System.out.println("O maior numero foi lançado  " + maiorNum);
		
		
		leia.close();
		

	}

}

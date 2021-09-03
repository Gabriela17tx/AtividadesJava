package br.com.generation.atividade.matrizvetores;

import java.util.Scanner;
/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double[] pontos = new double[5];
		double maiorPonto = 0.0;
		int i = 0;

		for (i = 0; i <= 4; i++) {
			System.out.print("Digite o " + (i + 1) + "� Ponto: ");
			pontos[i] = ler.nextDouble();

			if (pontos[i] > maiorPonto) {
				maiorPonto = pontos[i];
			}

		}

		System.out.println("O maior ponto �: " + maiorPonto);

		ler.close();
	}

}

package br.com.generatio.AtividadeJava03;

import java.util.Scanner;

public class Exercicio05 {
		/*Crie um programa que leia um n�mero
		 *  do teclado at� que encontre um n�mero igual a zero.
		 *   No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		
		do {
			System.out.println("Digite um numero");
			num = ler.nextInt();
			soma += num;
			}
		
		while(num != 0);
		
		
		System.out.println("A soma dos numeros digitados �: " + soma);
		
		
		ler.close();
	}

}
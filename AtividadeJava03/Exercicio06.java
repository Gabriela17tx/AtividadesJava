package br.com.generatio.AtividadeJava03;

import java.util.Scanner;

public class Exercicio06 {
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 *E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		 *Para sair digitar 0(zero).(DO...WHILE)*/
	public static void main(String[] args) {
		
		Scanner ler	= new Scanner(System.in);
			
		int num, soma = 0,divisor, cont = 0;
		System.out.println("Para obter a m�dia dos numeros digitados multiplos 3, digite 0");
		System.out.println("Digite um numero");
		num = ler.nextInt();
		do {
			
			
			
			if(num % 3 ==0) {
			soma += num;
			cont++;
			
			}
			System.out.println("Digite um numero");
			num = ler.nextInt();
			}
		
		while(num != 0);
			
		divisor = soma/cont;
		System.out.println("M�dia dos muutiplos de 3: "  + divisor);
		
		
		ler.close();
	}

}
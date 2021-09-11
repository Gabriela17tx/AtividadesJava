package br.com.polimorfismo2;

import java.util.Scanner;

public abstract class TestaOperacaoMatematica {
	
	public static void calculaOperacao(OperacaoMatematica op, double x, double y) { //apelido OP para operação
		System.out.println("Calculo Realizado: " + op.calcular(x, y));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double num1, num2;
		
		System.out.println("Digite os dois numeros:");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		calculaOperacao(new Soma(), num1,num2);
		calculaOperacao(new Multiplicacao(), num1,num2);
		

	}

}

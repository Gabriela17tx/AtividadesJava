package br.com.atividade1.hello;

import java.util.Scanner;

public class atividade4 {
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, r, s;
		
		System.out.print("Digite  valor de A: ");
		a = leia.nextInt();
		
		System.out.print("Digite  valor de B: ");
		b = leia.nextInt();
		
		System.out.print("Digite  valor de C: ");
		c = leia.nextInt();
		
		r = Math.pow((a+b), 2 );
		s = Math.pow((b + c), 2) ;
		
		System.out.print("Valor de D: " + (r + s)/2);
		
		leia.close();
		
		
	}

}

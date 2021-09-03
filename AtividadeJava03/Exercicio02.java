package br.com.generatio.AtividadeJava03;

import java.util.Scanner;

public class Exercicio02 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num = 1, x = 0, numImpar = 0, numPar = 0;
		
		 for(x = 0; x < 10; x++) {
			
			
			System.out.println("Digite 10 numero ");
			num = ler.nextInt();
			if (num % 2 == 0) {
				numPar++;
				}
			
		
		
			if(num % 2 == 1){
				numImpar++;
				}
			
		
		}


	    System.out.println("Foram digitados: " + numPar + " numeros pares \n");
	    System.out.println("Foram digitados: " + numImpar + " numeros impares");



	    ler.close();

	}

}

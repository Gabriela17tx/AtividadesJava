/*Programa: que ler a idade expressa em anos meses e dias e mostra em dias*/

package br.com.atividade1.hello;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos, diasAno=365, diasMeses = 30, idadeDias;
		
		System.out.print("digite a sua idade em anos, meses e dias" + "\nAnos: ");
		anos = leia.nextInt();
		
		System.out.print("Meses: ");
		meses = leia.nextInt();
		
		System.out.print("Anos: ");
		dias = leia.nextInt();
		
		idadeDias = (anos * diasAno) + (meses * diasMeses);
		
		System.out.print("Você tem" + idadeDias + "Dias ");
		
		leia.close();
		
		
		

	}

}

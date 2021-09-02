/* Sistema que ler a idade em dias em converte para anos, meses, e dias*/

package br.com.atividade1.hello;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos, diasAno=365, diasMeses = 30, idadeDias;
		
		System.out.print("Digite sua idade em dias: ");
		
		idadeDias = leia.nextInt();
		
		anos = idadeDias / diasAno;
		meses = (idadeDias % diasAno) / diasMeses;
		dias = (idadeDias % diasAno) % diasMeses;
		
		System.out.println("\nVocê tem " + anos + " Anos " + meses + " meses " + dias + " Dias. ");
		
		leia.close();

	}

}

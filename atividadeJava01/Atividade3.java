
package br.com.atividade1.hello;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		
		int totalSeg, min, seg;
		int hora = 3600;
		
		System.out.println("Quantos segundos tem esse evento? ");
	totalSeg = leia.nextInt();	
	
	hora = (totalSeg / hora);
	min = ((totalSeg - (hora * 3600))/60);
	seg = (totalSeg % 60);
	
	System.out.println("O evento durará: " + hora + " horas \n" + min + " minutos e " + seg + " segundos.");
	
	leia.close();

	}

}

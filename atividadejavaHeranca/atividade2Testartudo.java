package br.com.javaHerancaExercicio;

import java.util.Scanner;

public class atividade2Testartudo {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		cachorro cachorro = new cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("Que som o cachorro emite? ");
		
		cachorro.setSom(ler.next());
		
		System.out.println("Qual som o cavalo emite?");
		cavalo.setSom(ler.next());
		
		System.out.println("Qual som a Preguiça emite?");
		preguica.setSom(ler.next());
		
		System.out.println("O cachorro " + cachorro.getSom());
		System.out.println("O cavalo " + cavalo.getSom());
		System.out.println("E a preguiça " + preguica.getSom());
		
		
		
		
	
		
	}

}

package br.com.javaHerancaExercicio;

import java.util.Scanner;

public class testarTudo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		cachorro cachorro = new cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("Digite o nome, a idade e o som que faz o cachorro ");
		cachorro.setNome(ler.next());
		cachorro.setIdade(ler.nextInt());
		cachorro.setSom(ler.next());
		
		System.out.println("Digite o nome, a idade e o som que faz o cavalo ");
		cavalo.setNome(ler.next());
		cavalo.setIdade(ler.nextInt());
		cavalo.setSom(ler.next());
		
		System.out.println("Digite o nome, a idade e o som que faz o cavalo ");
		preguica.setNome(ler.next());
		preguica.setIdade(ler.nextInt());
		preguica.setSom(ler.next());
		
		System.out.println("O cachorro se chama: " + cachorro.getNome()+ " ele tem " + cachorro.getIdade()+" Anos ");
		System.out.println("Sempre " + cachorro.getSom());
		
		System.out.println("O cavalo se chama: " + cavalo.getNome()+ " ele tem " + cavalo.getIdade()+" Anos ");
		System.out.println("Sempre " + cavalo.getSom());
		
		System.out.println("O preguiça se chama: " + preguica.getNome()+ " ele tem " + preguica.getIdade()+" Anos ");
		System.out.println("Sempre " + preguica.getSom());
		
		

	}

}

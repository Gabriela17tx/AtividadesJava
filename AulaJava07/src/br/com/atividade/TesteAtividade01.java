package br.com.atividade;

import java.util.Scanner;

import br.com.interfaceTeste.Cachorro;

public class TesteAtividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cachorro dog = new Cachorro();
		cavalo cavalo = new cavalo();
		preguica preguica = new preguica();
		
		dog.setNome("Romeu");
		dog.setIdade(7);
		dog.somAnimal();
		
		System.out.println("O meu cachorro se chama" + dog.getNome());
		System.out.println("O" + dog.getNome() + " tem " + dog.getIdade());
		
		System.out.println("\n"+"\n");
		
		cavalo.setNome("Sereno");
		cavalo.setIdade(12);
		cavalo.getSom();
		
		System.out.println("O meu cavalo se chama " + cavalo.getNome());
		System.out.println("O" + cavalo.getNome() + " tem " + cavalo.getIdade());
		
		System.out.println("\n"+"\n");

	}

}

package br.com.interfaceTeste;

public class Gato implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("O som do gatos: Miau Miauu");
		
	}

	@Override
	public void dormir() {
		System.out.println("O Gato quando dorme: Sniff  Sniff");
		
	}

}

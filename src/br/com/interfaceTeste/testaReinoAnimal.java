package br.com.interfaceTeste;

public class testaReinoAnimal {

	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();  //construtor
		
		
		meuCachorro.dormir();
		meuCachorro.somAnimal();
		meuCachorro.setNome("Baboo");
		meuCachorro.setIdade(5);
		System.out.println("O meu cachorre se chama: " + meuCachorro.getNome());
		System.out.println("O " + meuCachorro.getNome()+" tem "+ meuCachorro.getIdade()+ " Anos");
		
		

	}

}

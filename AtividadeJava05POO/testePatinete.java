package br.com.pooCorrecao;

public class testePatinete {

	public static void main(String[] args) {
		
		Patinete pat = new Patinete();
		
		pat.setCargaMaxima(90);
		pat.setCor("preto");
		pat.setIdadeIndicada("+16");
		pat.setTipo("Eletrico");
		pat.setValor(6000);
		
		System.out.println("O Patinete � " + pat.getTipo() + ", " + pat.getCor());
		System.out.println("Ele � indicado para pessoas com " + pat.getIdadeIndicada() + "anos. Com at� " + pat.getCargaMaxima() + "Kg.");
		System.out.println("O valor est� em m�dia R$ " + pat.getValor() + ",00");

	}

}

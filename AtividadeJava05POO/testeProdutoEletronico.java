package br.com.pooCorrecao;

public class testeProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico ele = new ProdutoEletronico();
		
		ele.setTipo("Celular");
		ele.setMarca("Samsung");
		ele.setModelo("Galaxy A 51");
		ele.setValor(2100);
		
		
		System.out.println("Este produto eletronico é um(a) " + ele.getTipo());
		System.out.println("De marca " + ele.getMarca());
		System.out.println("E modelo " + ele.getModelo());
		System.out.println("Custa em média R$ " + ele.getValor());

	}

}

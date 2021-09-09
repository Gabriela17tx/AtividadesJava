package br.com.pooCorrecao;

public class testeAviao {

	public static void main(String[] args) {


		Aviao aviao = new Aviao();
		
		aviao.setCapacidadeTotal("242");
		aviao.setClasse("executiva");
		aviao.setEmpresa("azul");
		aviao.setLugarOcupado("200");

		
		System.out.println("Avião da empresa " + aviao.getEmpresa());
		System.out.println("Com capacidade Máxima para " + aviao.getCapacidadeTotal() + " pessoas.");
		System.out.println("Estamos com um total de " + aviao.getLugarOcupado()+ " lugares ocupados");
		System.out.println("Temos classe " + aviao.getClasse());
		
		
		
	}

}

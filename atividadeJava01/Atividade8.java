package br.com.atividade1.hello;

import java.util.Scanner;

public class Atividade8 {
/*8. O custo ao consumidor de um carro novo � a soma do custo de
 *  f�brica com a porcentagem do distribuidor e dos impostos 
 *  (aplicados ao custo de f�brica). */
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de F�brica: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica * 0.28);
		
		custoConsumidor = distribuidor + (distribuidor * 0.45);

		System.out.println("Custo consumidor: " + custoConsumidor);
		
		leia.close();
	}

}

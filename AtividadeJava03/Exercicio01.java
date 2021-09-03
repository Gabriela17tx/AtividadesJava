package br.com.generatio.AtividadeJava03;

public class Exercicio01 {
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
	public static void main(String[] args) throws InterruptedException {
		
		int num = 1000, numM = 1999, restoDivisor;
		
		
		while(num <= numM) {
			num++;
			
			if(num % 11 == 5) {
			System.out.println(num);
			
			Thread.sleep(2000);
			}
			
		}

	}
	
}



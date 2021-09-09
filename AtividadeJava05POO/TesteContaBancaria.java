package br.com.pooCorrecao;

public class TesteContaBancaria {

	public static void main(String[] args) {


		ContaBancaria conta = new ContaBancaria();
		
		conta.setNome("Maria");
		conta.setnAgencia(22222);
		conta.setnConta(8888);
		conta.setInstFinanceira("Itau");
		conta.setTipo("Conta Corrente");
		conta.setSaldo(20000.00);
		
		System.out.println("A cliente de nome " + conta.getNome() + ", Com " + conta.getTipo() + " Na instituição Financeira " + conta.getInstFinanceira());
		System.out.println("O numero da Conta: " + conta.getnConta()+ " E o numero da Agencia:" + conta.getnAgencia());
		System.out.println("Tem o Saldo total de " + conta.getSaldo());
		

	}

}

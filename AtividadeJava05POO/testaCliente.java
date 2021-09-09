package br.com.pooCorrecao;

public class testaCliente {

	public static void main(String[] args) {
	
		Cliente cli1 = new Cliente();
		
		cli1.setNome("vagner");
		cli1.setCpf("55546475514");
		cli1.setEndereco("rua dos bobos, nº 0");
		cli1.setIdade(100);
		
		System.out.println("Nome do cliente" + cli1.getNome());
		System.out.println("Idade do Cliente: " + cli1.getIdade());
	}

}

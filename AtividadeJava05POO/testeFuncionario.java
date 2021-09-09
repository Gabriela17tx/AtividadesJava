package br.com.pooCorrecao;

public class testeFuncionario {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario();
		
		fun.setNome("João");
		fun.setIdade(25);
		fun.setTurno("manhã");
		fun.setSetor("RH");
		fun.setFuncao("Analista de recursos humanos");
		
		System.out.println("O funcionario " + fun.getNome());
		System.out.println("tem " + fun.getIdade() + " Anos");
		System.out.println("Trabalha no periodo da " + fun.getTurno());
		System.out.println("No " + fun.getSetor());
		System.out.println("Como " + fun.getFuncao());
		
		

	}

}

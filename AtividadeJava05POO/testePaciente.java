package br.com.pooCorrecao;

public class testePaciente {

	public static void main(String[] args) {
	
		Paciente pac = new Paciente();
		
		pac.setCpf("012.345.678-99");
		pac.setIdade(59);
		pac.setNome("Sandra");
		pac.setQuarto("03");
		pac.setTipoSanguineo("O+");
		
		System.out.println("A paciente " + pac.getNome()+ " tem " + pac.getIdade());
		System.out.println("CPF: ");
		System.out.println("Nº Quarto " + pac.getQuarto());
		System.out.println("O tipo Sanguíneo é " + pac.getTipoSanguineo());

	}

}

package br.com.pooCorrecao;

public class ContaBancaria {

	private String nome;
	private String tipo;
	private String instFinanceira;
	private int nAgencia;
	private int nConta;
	private double saldo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getInstFinanceira() {
		return instFinanceira;
	}
	public void setInstFinanceira(String instFinanceira) {
		this.instFinanceira = instFinanceira;
	}
	public int getnAgencia() {
		return nAgencia;
	}
	public void setnAgencia(int nAgencia) {
		this.nAgencia = nAgencia;
	}
	public int getnConta() {
		return nConta;
	}
	public void setnConta(int nConta) {
		this.nConta = nConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}

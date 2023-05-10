package model;

public class Cliente {
	private String cpf;
	private String nome;
	private int idade;
	private double LimiteCredito=0;
	
	public Cliente(String cpf, String nome, int idade, Double limiteCredito) {
		
	}
	public void setcpf(String cpf) {
		this.cpf= cpf;
	}
	public String getcpf() {
		return cpf;
	}
	public void setnome(String nome) {
		this.nome= nome;
	}
	public String getnome() {
		return nome;
	}
	public void setidade(int idade) {
		this.idade= idade;
	}
	public int getidade() {
		return idade;
	}
	public void setLcredito(double Lcredito) {
		this.LimiteCredito= Lcredito;
	}
	public double getLcredito() {
		return LimiteCredito;
	}
	
}

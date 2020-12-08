package entities;

public class Conta {
	
	private int numConta;
	public String nome;
	private double valor;
	
	
	public Conta(int numConta, String nome, double valor) {
		this.numConta = numConta;
		this.nome = nome;
		this.valor = valor;
	}
	
	public Conta(int numConta, double valor) {
		this.numConta = numConta;
		this.valor = valor;
	}
	
	public void addSaldoConta(double valorAdd){
		valor +=valorAdd;
	}
	
	public void removeSaldoConta(double valorRem){
		
		double taxaSaque = 5.00;
		valor =(valor - valorRem) - taxaSaque;
	}
	
	public String toString() {
		return "Account " + numConta + ", Holder: "+ nome +", Balance: " + String.format("%.2f", valor);
	}
}

package util;
/*
 * Classe Java que contém os atributos da Claase, Contrutores, Métodos Get e Set,
 e Métodos de cálculo. 
 * */
public class CalculoBancario {
	private String dono;
	private int numConta;
	private double saldo;
	
	public CalculoBancario() {
		
	}
	
	public CalculoBancario(String dono, int numConta) {
		this.dono = dono;
		this.numConta = numConta;
		
	}
	
	//Método Get e Set
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getDono() {
		return dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void removeSaldo(double saldo) {
		this.saldo -= (saldo + 5.00);
	}
	
	public String toString() {
		return "Conta: " + getNumConta() + ", Dono: " +getDono() + ", Saldo: R$" 
				+ String.format("%.2f", getSaldo()); 
	}
}

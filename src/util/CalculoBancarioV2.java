package util;

import java.util.Scanner;

/*
 * Classe Java que contém os atributos da Claase, Contrutores, Métodos Get e Set,
 e Métodos de cálculo. 
 * */
public class CalculoBancarioV2 {
	private String dono;
	private int numConta;
	private double saldo;
	
	// Construtor padrão
	
	public CalculoBancarioV2() {
		this.saldo = 0;
		
	}
	
	// Construtor personalizado com sobrecarga.
	public CalculoBancarioV2(String dono, int numConta) {
		this.dono = dono;
		this.numConta = numConta;
		
	}
	
	//Métodos Gets e Sets
	
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
	
	// Métodos de Saque e Deposito.
	
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
	public void dadosBancarios() {
		System.out.println("Dados da conta: " + toString());
	}
	
	// Método para escolha de deposito inicial
	public void menu (Scanner sc) {
		System.out.println("Irá realizar um deposito inicial? (S/N)");
		char escolha = sc.next().charAt(0);
		switch(escolha) {
		case 's','S': 
			
			System.out.println("Informe o valor inicial para o depósito: ");
			double saldo = sc.nextDouble();
			addSaldo(saldo);
			dadosBancarios();
			System.out.println("Insira um valor para deposito: ");
			saldo = sc.nextDouble();
			addSaldo(saldo);
			atualizacaoDados();
			System.out.println("Insira um valor para retirada: ");
			saldo = sc.nextDouble();
			removeSaldo(saldo);
			atualizacaoDados();
			break;
			
		case 'n','N':
			
			dadosBancarios();
			System.out.println("Insira um valor para deposito: ");
			saldo = sc.nextDouble();
			addSaldo(saldo);
			atualizacaoDados();
			System.out.println("Insira um valor para retirada: ");
			saldo = sc.nextDouble();
			removeSaldo(saldo);
			atualizacaoDados();
			break;
			
		default: 
			System.out.println("Opção inválida! Por gentileza, informe S ou N para continuar.");
			menu(sc);
		}
	}
	
	public void atualizacaoDados() {
		System.out.println("Atualização dos dados da conta: " + toString());
	}
}

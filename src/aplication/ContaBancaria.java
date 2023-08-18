package aplication;

import java.util.Scanner;

import util.CalculoBancario;

/*Desenvolvido por: Mayara Brandão de Carvalho
 * Github: https://github.com/MamayCarvalho/Conta-Bancaria
 * */

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalculoBancario banco = new CalculoBancario(null, 0);
		
		System.out.println("Informe o número da conta: ");
		int numConta = sc.nextInt();
		banco.setNumConta(numConta);
		
		System.out.println("Informe o nome do Proprietario da conta: ");
		String dono = sc.next();
		banco.setDono(dono);
		
		System.out.println("Irá realizar deposito inicial? (S/N)");
		char escolha = sc.next().charAt(0);
		if (escolha == 's' || escolha =='S') {
			System.out.println("Informe o valor inicial para o depósito: ");
			double valor = sc.nextDouble();
			banco.addSaldo(valor);
			System.out.println("\nDados da conta: \n" + banco.toString());
			System.out.println("Insira um valor para deposito: ");
			valor = sc.nextDouble();
			banco.addSaldo(valor);
			System.out.println("\nAtualização dos dados da Conta: \n" + banco.toString());
			System.out.println("Insira um valor para retirada: ");
			valor = sc.nextDouble();
			banco.removeSaldo(valor);
			System.out.println("Atualização dos dados da Conta: " + banco.toString());
			
		}else{
			System.out.println("\nDados da conta: \n" + banco.toString());
			System.out.println("Insira um valor para deposito: ");
			double valor = sc.nextDouble();
			banco.addSaldo(valor);
			System.out.println("\nAtualização dos dados da Conta: \n"+ banco.toString());
			System.out.println("Insira um valor para retirada: ");
			valor = sc.nextDouble();
			banco.removeSaldo(valor);
			System.out.println("Atualização dos dados da Conta: " + banco.toString());
		}
		
		sc.close();

	}

}

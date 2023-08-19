package aplication;

import java.util.Scanner;

import util.CalculoBancarioV2;

/*Desenvolvido por: Mayara Brandão de Carvalho
 * Github: https://github.com/MamayCarvalho/Conta-Bancaria
 * */

public class Start_ContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalculoBancarioV2 banco = new CalculoBancarioV2(null, 0);
		
		System.out.println("Informe o número da conta: ");
		int numConta = sc.nextInt();
		banco.setNumConta(numConta);
		
		System.out.println("Informe o nome do Proprietario da conta: ");
		String dono = sc.next();
		banco.setDono(dono);
		
		banco.menu(sc);
		
		sc.close();

	}

}

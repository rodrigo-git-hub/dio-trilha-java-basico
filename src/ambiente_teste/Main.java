package ambiente_teste;

import java.util.Scanner;

import entity.ContaBanco;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor informe o numero da conta:");
		int numero = sc.nextInt();
		
		System.out.println("Por favor, informe a agencia:");
		String agencia = sc.next();
		sc.nextLine();
		
		System.out.println("Por favor informe seu nome:");
		String cliente = sc.nextLine();
		System.out.println("Por favor, informe o saldo:");
		double saldo = sc.nextDouble();
		
		ContaBanco cb = new ContaBanco(numero, agencia, cliente, saldo);
		
		System.out.println("Olá " 
			+ cb.getNomeCliente() 
			+ ", Obrigado(a) por criar uma conta em nosso banco, sua agencia é "
			+ cb.getAgencia() 
			+ ", sua conta é "
			+ cb.getNumero() 
			+ " e seu saldo "
			+ cb.getSaldo()
			+ " já está disponível para saque.");	
				
		sc.close();

	}

}

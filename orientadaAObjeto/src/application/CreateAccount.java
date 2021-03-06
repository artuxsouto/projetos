package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBancary;

public class CreateAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountBancary conta;
		

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char deposit = sc.next().charAt(0);
		
		if(deposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldoInicial = sc.nextDouble();
			conta = new AccountBancary(number, titular, saldoInicial);

		} 
		else {
			conta = new AccountBancary(number, titular);
		}	
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(conta);
			
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double saldo = sc.nextDouble();
			conta.InclueSaldo(saldo);
			System.out.println("Update account data: ");
			System.out.println(conta);
			
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			saldo = sc.nextDouble();
			conta.RemoveSaldo(saldo);
			System.out.println("Update account data: ");
			System.out.println(conta);
			
sc.close();
}
}
package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Cambio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double bought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = "
				+ (dollar * bought * CurrencyConverter.IOF + CurrencyConverter.calcDollar(dollar, bought)));

		sc.close();
	}

}
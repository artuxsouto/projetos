package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Rh {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		
		System.out.println("Name: ");
		em.name = sc.nextLine();
		System.out.println("Gross salary: ");
		em.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		em.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " + em);
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		em.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + em);
				
sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class School {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno st = new Aluno();
		
		System.out.println("Aluno: ");
		st.name = sc.nextLine();
		System.out.println("Primeira nota: ");
		st.n1 = sc.nextDouble();
		System.out.println("Segunda nota: ");
		st.n2 = sc.nextDouble();
		System.out.println("Terceira nota: ");
		st.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", st.FinalGrade());
		
		if(st.FinalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", st.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();
	}
}
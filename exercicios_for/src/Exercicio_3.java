import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double soma;
		
		for(int i = 1; N >= i; i++) {
			double X = sc.nextDouble();
			X = X * 2.0;
			double Y = sc.nextDouble();
			Y = Y * 3.0;
			double Z = sc.nextDouble();
			Z = Z * 5.0;
			soma = (X + Y + Z) / (2 + 3 + 5);
			System.out.printf("%.1f%n", soma);
		}
		
		sc.close();
	}
}
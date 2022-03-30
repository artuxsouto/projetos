import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; N >= i; i++) {
			
			double X = sc.nextInt();
			double Y = sc.nextInt();
			if(Y != 0) {
			double div = X / Y;
			
			System.out.printf("%.1f%n", div);
			
		}
			else {
				System.out.println("Divisao impossivel");
			}
		}
		sc.close();
	}
}
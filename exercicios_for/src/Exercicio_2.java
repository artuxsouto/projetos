import java.util.Scanner;

public class Exercicio_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma1 = 0;
		int soma2 = 0;
		
		for (int i=1; N >= i; i++) {
			int X = sc.nextInt();
			if(X >= 10 && X <= 20) {
				soma1 ++;
			}
			else {
				soma2 ++;
			}
		}
		System.out.println(soma1 + " " + "in");
		System.out.println(soma2 + " " + "out");
		sc.close();
	}
}

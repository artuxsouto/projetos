import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int Q = i * i;
			int C = i * i * i;
			System.out.println(i + " " + Q + " " + C);
		}
		sc.close();

	}

}

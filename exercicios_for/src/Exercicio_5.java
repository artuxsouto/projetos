import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cal = N;
		int F;
		
		for(int i = 1; i < N; i++) {
			F = (N - i) * cal;
			cal = F;
		}
		if(N > 0) {
			System.out.print(cal);
		}
		else {
			System.out.print("1");
		}
		sc.close();
	}
}

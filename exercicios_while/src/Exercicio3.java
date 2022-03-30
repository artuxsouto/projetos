import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pedido = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (pedido != 4) {
			if (pedido == 1) {
				alcool = alcool + 1;				
			}
			if (pedido == 2) {
				gasolina = gasolina + 1;
			}
			if (pedido == 3) {
				diesel = diesel + 1;
			}
			
			pedido = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}

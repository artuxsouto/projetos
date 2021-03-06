package entities;

public class AccountBancary {
			
	private int number;
	private String titular;
	private double saldo;
	
	public AccountBancary() {
		
	}
			
	public AccountBancary(int number, String titular) {
		this.number = number;
		this.titular = titular;
	}
	
	public AccountBancary(int number, String titular, double depositoInicial) {
		this.number = number;
		this.titular = titular;
		InclueSaldo(depositoInicial);
	}

	public int getNumber() {
		return number;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void InclueSaldo(double saldo) {
		this.saldo += saldo;
	}
	public void RemoveSaldo(double saldo) {
		this.saldo -= saldo + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ titular
				+  ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
}

package entities;

public class Aluno {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;

	
	public double FinalGrade() {		
		return n1 + n2 + n3;
	}
	
	public double missingPoints() {
		if (FinalGrade() < 60.0) {
			return 60.0 - FinalGrade();
		}
		else {
			return 0.0;
		}
	}
}
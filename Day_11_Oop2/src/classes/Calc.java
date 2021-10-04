package classes;

public class Calc {
	private int num1;
	private int num2;
	
	public void Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void Calc() {}
	
	public static int minus(int num1, int num2) {	
		return num1 - num2;
	}
	
	public int plus(int num1, int num2) {
		return this.num1 + this.num1;
	}
	
}

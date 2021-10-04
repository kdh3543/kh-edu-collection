package exams;

import classes.Calc;

public class Main {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		System.out.println(c.plus(10,5));
		System.out.println(Calc.minus(10,5));
	}

}

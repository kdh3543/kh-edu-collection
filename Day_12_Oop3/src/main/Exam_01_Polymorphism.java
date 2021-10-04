package main;

class A{
	public void funcA() {
		System.out.println("funcAÀÔ´Ï´Ù.");
	}
}

class B extends A{
	public void funcA() {
		System.out.println("funcBÀÔ´Ï´Ù.");
	}
}


public class Exam_01_Polymorphism {
	public static void main(String[] args) {
		// ´ÙÇü¼º Òýû¡àõ
		
		A a = new B();
		((B)a).funcA();
		a.funcA();
	}
}

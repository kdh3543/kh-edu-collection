package main;

class A{
	public void funcA() {
		System.out.println("funcA�Դϴ�.");
	}
}

class B extends A{
	public void funcA() {
		System.out.println("funcB�Դϴ�.");
	}
}


public class Exam_01_Polymorphism {
	public static void main(String[] args) {
		// ������ ������
		
		A a = new B();
		((B)a).funcA();
		a.funcA();
	}
}

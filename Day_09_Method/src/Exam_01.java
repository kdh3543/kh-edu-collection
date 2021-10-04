

public class Exam_01 { 
	
	public static int plus(int a, int b) {	
		int result = a + b;
		
		return result;
	}
	
	public static int minus(int a, int b) {
		int result = a - b;
		
		return result;
	}
	
	public static int multiply(int a, int b) {
		int result = a * b;
		
		return result;
	}
	
	public static double divide(int a, int b) {
		double result = (double)a / b;
		return result;
	}
	
	public static int bigger(int a, int b) {
		if(a>b) {
			return a;
		}else if(a<b) {
			return b;
		}else 
			return 0;
	}
	
	public static void hello() {
		System.out.println("Hello Java");
	}
	// 메소드 정의부
	
	public static void main(String[] args) {
		
		plus(10,5);// 10, 5 ==> parameter
		minus(20, 7);
		int x = multiply(10, 17);
		double y =divide(3, 5);
		System.out.println(plus(10,5));
		System.out.println(minus(20, 7));
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(bigger(10, 10));
		hello();
	}
	
	// 메소드 호출부
}

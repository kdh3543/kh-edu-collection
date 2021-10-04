package practice_day_1;

public class Num_10_Remainder {
	public static void main(String[] args) {
		int a, b, c;
		a = 6;
		b = 79;
		c = 88;
		
		System.out.println((a + b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a * b)%c);
		System.out.println(((a%c) * (b%c))%c);
	}
}

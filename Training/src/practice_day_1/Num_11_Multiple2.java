package practice_day_1;

import java.util.Scanner;

public class Num_11_Multiple2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int b1 = (b/100)%10;
		int b2 = (b/10)%10;
		int b3 = b%10;
		
		System.out.println(a*b3);
		System.out.println(a*b2);
		System.out.println(a*b1);
		System.out.println(a*b);
	}

}

package practice_day_4;

import java.util.Scanner;

public class Num1_While1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
			if(num1==0&&num2==0) {
				break;
			}
		}
		
	}

}

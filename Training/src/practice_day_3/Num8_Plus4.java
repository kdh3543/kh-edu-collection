package practice_day_3;

import java.util.Scanner;

public class Num8_Plus4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i = 0; i<test;i++) {
			int put1 = sc.nextInt();
			int put2 = sc.nextInt();
			System.out.println("Case #"+(i+1)+" : "+ put1+" + "+put2+
					" = "+(put1 + put2));
		}
	}

}

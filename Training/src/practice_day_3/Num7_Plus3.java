package practice_day_3;

import java.util.Scanner;

public class Num7_Plus3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i = 0; i<test;i++) {
			int put1 = sc.nextInt();
			int put2 = sc.nextInt();
			System.out.println("Case #"+(i+1)+":"+(put1 + put2));
		}
	}

}

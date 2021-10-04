package practice_day_3;

import java.util.Scanner;

public class Num1_Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gugud = sc.nextInt();
		
		for(int i = 1; i< 10;i++) {
			System.out.println(gugud + " x "+i+" = "+gugud*i);
		}
	}

}

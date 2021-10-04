package practice_day_3;

import java.util.Scanner;

public class Num9_PrintStar1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		
		for(int i = 0;i<star;i++) {
			for(int k=star-i-1;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

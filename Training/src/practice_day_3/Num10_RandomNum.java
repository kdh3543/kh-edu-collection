package practice_day_3;

import java.util.Scanner;

public class Num10_RandomNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i = 0; i<N;i++) {
			int ran = (int)(Math.random()*100+1);
			if(ran<X) {
				System.out.print(ran + " ");
			}
		}
		
	}

}

package practice_day_5;

import java.util.Scanner;

public class Main1_MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[9];
		int max = arr[0];
		int count = 0;
		
		for(int i=0; i< arr.length; i++ ) {
			System.out.print(i+1+"번째 수 입력: ");
			int N = sc.nextInt();
			arr[i] = N;
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				count++;
			}
		}
		System.out.println(max + " " + count);
	}
}

package practice_day_5;

import java.util.Scanner;

public class Main2_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i<N;i++) {
			arr[i] = (int)((Math.random()*2000001)-1000000);
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
			System.out.println(arr[i]);
		}
		System.out.println(max + " " + min);
	}

}

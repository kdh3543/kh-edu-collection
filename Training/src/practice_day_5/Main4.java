package practice_day_5;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;

		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i< arr.length; i++) {
			for(int j = i+1; j<arr.length;j++) {
				int tmp = arr[j]%42;
				if(arr[i]%42 != tmp) {
					count++;
				}
				if(arr[j]%42 == tmp) {
					count--;
				}
			}
		}
		System.out.println(count);	
	}
}

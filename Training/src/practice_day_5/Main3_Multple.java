package practice_day_5;

import java.util.Scanner;

public class Main3_Multple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int[] count = new int[10];	
		int sum = num1 * num2 * num3;
		while(true){	
			if(sum<=10) {
				sum = sum%10;
				count[sum]++;
				break;
			}else {
				count[sum%10]++;
				sum = sum/10;
				if(sum==0) {
					break;
				}
			}
		}
		for(int i = 0; i<count.length;i++) {
			System.out.println(i+ "�� ���� Ƚ��: " + count[i]);
		}
	}
}

package practice_day_2;

import java.util.Scanner;

public class Num5_if_Alaram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("일찍 알람 설정하는 프로그램");
		System.out.print("설정할 알람의 시간: ");
		int h = sc.nextInt();
		System.out.print("설정할 알람의 분: ");
		int m = sc.nextInt();

		if(0<=h&&h<=23&&0<=m&&m<=59) {
			if(m-45>=0) {
					System.out.println(h+" "+(m-45));
			}else {
				if(h-1<0) {
					System.out.println((h+23)+" "+(m+15));
				}else
					System.out.println((h-1)+" "+(m+15));
			}
		}else
			System.out.println("시간을 잘못 입력하셨습니다.");
	}
}

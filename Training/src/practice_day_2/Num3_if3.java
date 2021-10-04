package practice_day_2;

import java.util.Scanner;

public class Num3_if3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("윤년 계산하는 프로그램");
		int year = sc.nextInt();
		if(year<1||4000<year) {
			System.out.println("해당 년도는 없습니다.");
		}else {
			if((year%4==0&&year%100!=0)||year%400 == 0) {
				System.out.println(1);
			}else
				System.out.println(0);
		}
	}

}

package practice_day_2;

import java.util.Scanner;

public class Num3_if3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����ϴ� ���α׷�");
		int year = sc.nextInt();
		if(year<1||4000<year) {
			System.out.println("�ش� �⵵�� �����ϴ�.");
		}else {
			if((year%4==0&&year%100!=0)||year%400 == 0) {
				System.out.println(1);
			}else
				System.out.println(0);
		}
	}

}

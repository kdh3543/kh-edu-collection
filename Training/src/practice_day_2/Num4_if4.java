package practice_day_2;

import java.util.Scanner;

public class Num4_if4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x��ǥ ����: ");
		int x = sc.nextInt();
		System.out.print("y��ǥ ����: ");
		int y = sc.nextInt();
		
		if(x<-1000||x>1000||y<-1000||y>1000||x==0||y==0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			if(x>0&&y>0) {
				System.out.println(1);
			}else if(x>0&&y<0) {
				System.out.println(4);
			}else if(x<0&&y>0) {
				System.out.println(2);
			}else
				System.out.println(3);
		}
	}

}

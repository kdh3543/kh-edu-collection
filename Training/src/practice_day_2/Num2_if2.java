package practice_day_2;

import java.util.Scanner;

public class Num2_if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 성적을 입력받아 학점 매기는 프로그램");
		int grade = sc.nextInt();
		
		if(grade >100 || grade < 0) {
			System.out.println("잘못된 점수입니다.");
		}else {
			if(90<=grade&&grade<=100) {
				System.out.println("A");
			}else if(80<=grade&&grade<90) {
				System.out.println("B");
			}else if(70<=grade&&grade<80) {
				System.out.println("C");
			}else if(60<=grade&&grade<70) {
				System.out.println("D");
			}else
				System.out.println("F");
		}
	}

}

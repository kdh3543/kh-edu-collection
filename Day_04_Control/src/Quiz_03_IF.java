import java.util.Scanner;

public class Quiz_03_IF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 성적 및 평균이 나오는 프로그램");
		System.out.println("===========================");
		System.out.print("이 름 : ");
		String name = sc.nextLine();

		System.out.println("===========================");
		System.out.print("국 어 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영 어 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수 학 : ");
		int math = Integer.parseInt(sc.nextLine());

		int sum = kor + eng + math;
		double avg = sum / 3;
		System.out.println("===========================");
		System.out.printf("합 계 : %d\n평 균 : %.2f\n",sum ,avg);

		if(avg >= 95) {
			System.out.println("성적은 A+ 입니다.");
		}else if(avg >= 90 && avg <95) {
			System.out.println("성적은 A 입니다.");
		}else if(avg >= 80 && avg <90) {
			System.out.println("성적은 B 입니다.");
		}else if(avg >= 70 && avg <80) {
			System.out.println("성적은 C 입니다.");
		}else
			System.out.println("성적은 D 입니다.");
	}
}	

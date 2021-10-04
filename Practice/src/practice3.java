import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 성적 합계 및 평균 구하기");
		System.out.println("========================");
		String stu = sc.nextLine();
		System.out.println("학생 이름 : " + stu);
		System.out.println("========================");
		
		
		String kor = sc.nextLine();
		int korsc = Integer.parseInt(kor);
		System.out.println("국어 : " + korsc);
		
		String eng = sc.nextLine();
		int engsc = Integer.parseInt(eng);
		System.out.println("영어 : " + engsc);
		
		String math = sc.nextLine();
		int mathsc = Integer.parseInt(math);
		System.out.println("수학 : " + mathsc);
		
		System.out.println("==========================");
		System.out.println("합계 : " + (korsc+engsc+mathsc));
		System.out.println("평균 : " + (double)((korsc+engsc+mathsc)/3));
	}

}

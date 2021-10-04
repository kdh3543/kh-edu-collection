import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의 학생의 성적 합계 및 평균구하기");
		
		String name = sc.nextLine(); // 학생 이름
		System.out.print("국어 : ");
		String lan = sc.nextLine();
		int lansc = Integer.parseInt(lan); // 국어 점수
		System.out.print("영어 : ");
		String eng = sc.nextLine();
		int engsc = Integer.parseInt(eng); // 영어 점수
		System.out.print("수학 : ");
		String math = sc.nextLine();
		int mathsc = Integer.parseInt(math); // 수학 점수
		System.out.println("===================================");
		System.out.println("합계 : " + (lansc + engsc + mathsc));
		System.out.print("평균 : " + (double)((lansc + engsc + mathsc)/3));
	}
}

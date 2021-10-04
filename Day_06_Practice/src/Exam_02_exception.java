import java.util.Scanner;

public class Exam_02_exception {
	public static void main(String[] args) {
		// 예외 처리
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num;
		try {
		num = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("입력한 값은 숫자가 아닙니다.");
		}		
		System.out.println("프로그램 종료");
	}
}
import java.util.Scanner;

public class Quiz_02_IF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하여 홀수인지 짝수인지 구분하는 프로그램");
		
		System.out.print("1 ~ 100 사이의 숫자 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		if(input > 100 || input < 0) {
			System.out.println("숫자 범위를 다시 확인하세요");
		}else {
				System.out.println("====== 결과 ======");
				if(input%2 == 0) {
					System.out.println("입력한 수는 짝수입니다.");
				}else {
					System.out.println("입력한 수는 홀수입니다.");
				}
		}	
	}
}

import java.util.Scanner;

public class Quiz_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 1 ~ n 까지의 합 구하기 ===");
		System.out.print("n 입력 : ");
		int input = 0;
		while(true) {
			try {
				input = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		
		int num = 0;
		int sum = 0;
		while(num < input) {
			sum += ++num;			
		}
		System.out.println("1 ~ " + input + "까지의 합은 " + sum + " 입니다.");
	}
}
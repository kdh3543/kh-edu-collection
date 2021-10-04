import java.util.Scanner;

public class Day_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("=== 계산기 프로그램 ===");
			System.out.print("연산자 입력 : ");
			String op = sc.nextLine();
			if(op.equals("q")) {
				break;
			}else if(op.equals("+") || op.equals("-") ||
					op.equals("*") || op.equals("/")) {
				System.out.print("첫번째 숫자 입력 : ");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.print("두번째 숫자 입력 : ");
				int num2 = Integer.parseInt(sc.nextLine());

				String ch = num1 + op + num2 + " = ";

				System.out.println("====== 결 과 ======");
				if(op.equals("+")) {
					System.out.println(ch + (num1 + num2));
				}else if(op.equals("-")) {
					System.out.println(ch + (num1 - num2));
				}else if(op.equals("*")) {
					System.out.println(ch + (num1 * num2));
				}else
					System.out.println(ch + ((double)num1 / num2));
			}else 
				System.out.println("다시 작성해주세요.");
		}
	}
}

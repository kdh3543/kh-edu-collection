import java.util.Scanner;

public class Quiz_02switchmethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.println("=== 계산기 프로그램 ===");
			i++;
			System.out.println(i + "번째 시도");
			System.out.print("연산자 입력(+,-,*,/) : ");

			String op = sc.nextLine();
			if(op.equals("q")) {
				break;
			}else if(op.equals("+") || op.equals("-") ||
					op.equals("*") || op.equals("/")) {
				System.out.print("첫번째 숫자 : ");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.print("두번째 숫자 : ");
				int num2 = Integer.parseInt(sc.nextLine());
				
				String ch = num1 + op + num2 + "=";
				switch(op) {
				case "+":
					System.out.println(ch + (num1 + num2));
					break;
				case "-":
					System.out.println(ch + (num1 - num2));
					break;
				case "*":
					System.out.println(ch + (num1 * num2));
					break;
				case "/":
					System.out.println(ch + ((double)num1 / num2));
					break;
				}
			}else
				System.out.println("다시 입력하세요.");
		}
		System.out.println("끝~~!!");
	}
}

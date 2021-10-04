import java.util.Scanner;

public class Quiz_02_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int input1 = 0;
		int input2 = 0;
		while(true) {
			System.out.println("=== 계산기 프로그램 ===");
			i++;
			System.out.println(i + "번째 시도");
			System.out.print("연산자 입력(+,-,*,/) : ");

			String op = sc.nextLine();
			if(op.equals("q")) {
				break;
			}else if(op.equals("+")||op.equals("-")||
					op.equals("*")||op.equals("/")) {
				while(true) {
					try {
						System.out.print("첫 번째 숫자 입력 : ");
						input1 = Integer.parseInt(sc.nextLine());
						break;
					}catch(Exception e) {
						System.out.println("숫자를 입력해주세요.");
					}
				}
				while(true) {
					try {
						System.out.print("두 번째 숫자 입력 : ");
						input2 = Integer.parseInt(sc.nextLine());
						break;
					}catch(Exception e) {
						System.out.println("숫자를 입력해주세요.");
					}
				}
			
				System.out.println("====== 결 과 ======");

				String ch = input1 + op + input2 + " = ";
				
				if(op.equals("+")) {
					System.out.println(ch + (input1 + input2));
				}else if(op.equals("-")) {
					System.out.println(ch + (input1 - input2));
				}else if(op.equals("*")) {
					System.out.println(ch + (input1 * input2));
				}else
					System.out.println(ch + (double)input1 / input2);
			}else
				System.out.println("다시 입력해주세요.");
			
		}
		System.out.println("끝~!!");
	}
}

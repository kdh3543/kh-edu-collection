import java.util.Scanner;

public class Day_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("=== ���� ���α׷� ===");
			System.out.print("������ �Է� : ");
			String op = sc.nextLine();
			if(op.equals("q")) {
				break;
			}else if(op.equals("+") || op.equals("-") ||
					op.equals("*") || op.equals("/")) {
				System.out.print("ù��° ���� �Է� : ");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.print("�ι�° ���� �Է� : ");
				int num2 = Integer.parseInt(sc.nextLine());

				String ch = num1 + op + num2 + " = ";

				System.out.println("====== �� �� ======");
				if(op.equals("+")) {
					System.out.println(ch + (num1 + num2));
				}else if(op.equals("-")) {
					System.out.println(ch + (num1 - num2));
				}else if(op.equals("*")) {
					System.out.println(ch + (num1 * num2));
				}else
					System.out.println(ch + ((double)num1 / num2));
			}else 
				System.out.println("�ٽ� �ۼ����ּ���.");
		}
	}
}

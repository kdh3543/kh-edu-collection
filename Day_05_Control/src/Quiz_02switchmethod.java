import java.util.Scanner;

public class Quiz_02switchmethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.println("=== ���� ���α׷� ===");
			i++;
			System.out.println(i + "��° �õ�");
			System.out.print("������ �Է�(+,-,*,/) : ");

			String op = sc.nextLine();
			if(op.equals("q")) {
				break;
			}else if(op.equals("+") || op.equals("-") ||
					op.equals("*") || op.equals("/")) {
				System.out.print("ù��° ���� : ");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.print("�ι�° ���� : ");
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
				System.out.println("�ٽ� �Է��ϼ���.");
		}
		System.out.println("��~~!!");
	}
}

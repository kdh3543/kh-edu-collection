import java.util.Scanner;

public class Quiz_02_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int input1 = 0;
		int input2 = 0;
		while(true) {
			System.out.println("=== ���� ���α׷� ===");
			i++;
			System.out.println(i + "��° �õ�");
			System.out.print("������ �Է�(+,-,*,/) : ");

			String op = sc.nextLine();
			if(op.equals("q")) {
				break;
			}else if(op.equals("+")||op.equals("-")||
					op.equals("*")||op.equals("/")) {
				while(true) {
					try {
						System.out.print("ù ��° ���� �Է� : ");
						input1 = Integer.parseInt(sc.nextLine());
						break;
					}catch(Exception e) {
						System.out.println("���ڸ� �Է����ּ���.");
					}
				}
				while(true) {
					try {
						System.out.print("�� ��° ���� �Է� : ");
						input2 = Integer.parseInt(sc.nextLine());
						break;
					}catch(Exception e) {
						System.out.println("���ڸ� �Է����ּ���.");
					}
				}
			
				System.out.println("====== �� �� ======");

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
				System.out.println("�ٽ� �Է����ּ���.");
			
		}
		System.out.println("��~!!");
	}
}

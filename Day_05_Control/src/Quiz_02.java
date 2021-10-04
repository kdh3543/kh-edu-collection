import java.util.Scanner;

public class Quiz_02 {
	public static int validInt(String str) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		while(true) {
			try {
				System.out.print(str);
				num = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
			}
		}
		return num;
	}
	
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
			}else if(op.equals("+")||op.equals("-")||
					op.equals("*")||op.equals("/")) {
				int input1 = validInt("ù ��° ���� �Է�: ");
				
				int input2 = validInt("�� ��° ���� �Է�: ");
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

import java.util.Scanner;

public class Quiz_10_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ������ ��� ���α׷� ===");
		int gugud = 0;	
		while(true) {
			System.out.print("2~9�� �� ���� : ");
			while(true) {
				try {
					gugud = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �Է����ּ���.");
				}
			}
			if(2<=gugud &&gugud<=9) {
				int i = 0;
				System.out.println("======================");
				System.out.println(gugud + "��");
				System.out.println("======================");
				while(i < 9) {
					i++;
					System.out.println(gugud + " * " + i + " = " + gugud*i);	
				}
			}else {
				System.out.println("������ ������ �ٽ� �����ϼ���.");
			}
		}
	}
}
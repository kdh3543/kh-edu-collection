import java.util.Scanner;

public class Quiz_02_IF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͽ� Ȧ������ ¦������ �����ϴ� ���α׷�");
		
		System.out.print("1 ~ 100 ������ ���� �Է� : ");
		int input = Integer.parseInt(sc.nextLine());
		if(input > 100 || input < 0) {
			System.out.println("���� ������ �ٽ� Ȯ���ϼ���");
		}else {
				System.out.println("====== ��� ======");
				if(input%2 == 0) {
					System.out.println("�Է��� ���� ¦���Դϴ�.");
				}else {
					System.out.println("�Է��� ���� Ȧ���Դϴ�.");
				}
		}	
	}
}

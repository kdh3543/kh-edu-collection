import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����ϼ���.");
		System.out.println("1. ���� 2. ���� 3. �ٳ���");
		System.out.println(">> ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1. ����");
			break;
		case 2:
			System.out.println("2. ����");
			break;
		case 3:
			System.out.println("3. �ٳ���");
			break;
		default:
			System.out.println("�޴��� �ٽ� Ȯ�����ּ���.");
		}
	}
}

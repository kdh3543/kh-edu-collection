import java.util.Scanner;

public class Exam_01_IF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �����ϴ� ������ �����ϼ���.");
		System.out.println("1. ��� 2. �ٳ��� 3. ����");
		System.out.print(">> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.println("����� ����� Apple �Դϴ�.");
		}else if(menu == 2) {
			System.out.println("�ٳ����� ����� Banana �Դϴ�.");
		}else if(menu == 3) {
			System.out.println("������ ����� Grape �Դϴ�.");
		}else
			System.out.println("�޴��� �ٽ� Ȯ�����ּ���.");
	}
}

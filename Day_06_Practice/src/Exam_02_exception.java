import java.util.Scanner;

public class Exam_02_exception {
	public static void main(String[] args) {
		// ���� ó��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num;
		try {
		num = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("�Է��� ���� ���ڰ� �ƴմϴ�.");
		}		
		System.out.println("���α׷� ����");
	}
}
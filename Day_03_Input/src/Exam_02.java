import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		// System.in.read(); -> �ѱ��ڸ� int������ �Է¹޴´�.
		// ���� �������� ���� ���� �ϳ�
		
		String str = sc.nextLine(); // �� ������ String������ �Է¹޴´�.
		// ���� �������� ���� ���ڿ�
		
		System.out.println("�Է��� �޼����� : " + str);
	}
}

import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �л��� ���� �հ� �� ��ձ��ϱ�");
		
		String name = sc.nextLine(); // �л� �̸�
		System.out.print("���� : ");
		String lan = sc.nextLine();
		int lansc = Integer.parseInt(lan); // ���� ����
		System.out.print("���� : ");
		String eng = sc.nextLine();
		int engsc = Integer.parseInt(eng); // ���� ����
		System.out.print("���� : ");
		String math = sc.nextLine();
		int mathsc = Integer.parseInt(math); // ���� ����
		System.out.println("===================================");
		System.out.println("�հ� : " + (lansc + engsc + mathsc));
		System.out.print("��� : " + (double)((lansc + engsc + mathsc)/3));
	}
}

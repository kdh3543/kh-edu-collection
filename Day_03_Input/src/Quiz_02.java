import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ڸ� ���� �� ���� �Է¹޾� �����ϴ� ���α׷�");
		
		System.out.print("ù��° ���� : ");
		String input1 = sc.nextLine();
		System.out.print("�ι�° ���� : ");
		String input2 = sc.nextLine();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.println("������ ��� : " +
		(num1 + " + " + num2 + " = " +(num1 + num2)));
		
		// �����ڸ� ���� �� ���� �Է¹޾�
		// ������ ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	}
}
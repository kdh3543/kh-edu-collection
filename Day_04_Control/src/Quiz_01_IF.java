import java.util.Scanner;

public class Quiz_01_IF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ũ�� ��");		
		
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("ù��° ���� �Է� : " + num1);	
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("�ι�° ���� �Է� : " + num2);
		
		
		System.out.println("===== ��� =====");
		if(num1 > num2) {
			System.out.println("ù��° �Է��� ���� �� ũ��.");
		}else if(num1 < num2) {
			System.out.println("�ι�° �Է��� ���� �� ũ��.");
		}else
			System.out.println("�� ���� ���� ����.");
	}
}

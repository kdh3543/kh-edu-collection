import java.util.Scanner;

public class Quiz_08_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� Ƚ���� ���ϰ� �� Ƚ����ŭ ��µǴ� ���α׷�");
		System.out.print("��� �ݺ� Ƚ�� : ");
		int input = Integer.parseInt(sc.nextLine());
		int i = 0;
		
		while(i < input) {
			i++;
			System.out.println(i + " : Hello Java");
		}
	}
}

import java.util.Scanner;

public class Quiz_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 1 ~ n ������ �� ���ϱ� ===");
		System.out.print("n �Է� : ");
		int input = 0;
		while(true) {
			try {
				input = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
			}
		}
		
		int num = 0;
		int sum = 0;
		while(num < input) {
			sum += ++num;			
		}
		System.out.println("1 ~ " + input + "������ ���� " + sum + " �Դϴ�.");
	}
}
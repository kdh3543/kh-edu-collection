import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		while(true) {
			while(true) {
				try {
					System.out.print("���� �Է� : ");
					num = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �Է����ּ���.");
				}
			}
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println("�Է��� ������ ������ " + sum);
		System.out.println("=======================");
		int sum2 =0;
		int num1 =0;
		for(;;) {
			
			while(true) {
				try {
					System.out.print("���� �Է� : ");
					num1 = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �Է����ּ���.");
				}
			}
			sum2 += num1;
			if(num1 == 0) {
				break;
			}
		}
		System.out.println("������ �� ����" + sum2);
	}
}
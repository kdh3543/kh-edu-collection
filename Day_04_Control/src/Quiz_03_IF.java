import java.util.Scanner;

public class Quiz_03_IF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�л��� ���� �� ����� ������ ���α׷�");
		System.out.println("===========================");
		System.out.print("�� �� : ");
		String name = sc.nextLine();

		System.out.println("===========================");
		System.out.print("�� �� : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("�� �� : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("�� �� : ");
		int math = Integer.parseInt(sc.nextLine());

		int sum = kor + eng + math;
		double avg = sum / 3;
		System.out.println("===========================");
		System.out.printf("�� �� : %d\n�� �� : %.2f\n",sum ,avg);

		if(avg >= 95) {
			System.out.println("������ A+ �Դϴ�.");
		}else if(avg >= 90 && avg <95) {
			System.out.println("������ A �Դϴ�.");
		}else if(avg >= 80 && avg <90) {
			System.out.println("������ B �Դϴ�.");
		}else if(avg >= 70 && avg <80) {
			System.out.println("������ C �Դϴ�.");
		}else
			System.out.println("������ D �Դϴ�.");
	}
}	

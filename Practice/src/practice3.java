import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л��� ���� �հ� �� ��� ���ϱ�");
		System.out.println("========================");
		String stu = sc.nextLine();
		System.out.println("�л� �̸� : " + stu);
		System.out.println("========================");
		
		
		String kor = sc.nextLine();
		int korsc = Integer.parseInt(kor);
		System.out.println("���� : " + korsc);
		
		String eng = sc.nextLine();
		int engsc = Integer.parseInt(eng);
		System.out.println("���� : " + engsc);
		
		String math = sc.nextLine();
		int mathsc = Integer.parseInt(math);
		System.out.println("���� : " + mathsc);
		
		System.out.println("==========================");
		System.out.println("�հ� : " + (korsc+engsc+mathsc));
		System.out.println("��� : " + (double)((korsc+engsc+mathsc)/3));
	}

}

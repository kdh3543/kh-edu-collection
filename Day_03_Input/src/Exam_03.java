import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String num = sc.nextLine();		
		int result = Integer.parseInt(num);			
		System.out.println("���� ����� : " +(result + 10));
	}
}

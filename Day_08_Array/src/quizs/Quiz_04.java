package quizs;
import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stu = new String[3];
		int[]kor = new int[3];
		int[]eng = new int[3];
		for(int i = 0; i<stu.length; i++) {
			System.out.print(i+1+" ��° �л� �̸� : ");
			stu[i] = sc.nextLine();
			System.out.print(stu[i] + " �л� ���� : ");
			kor[i] = Integer.parseInt(sc.nextLine());
			System.out.print(stu[i] + " �л� ���� : ");
			eng[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("�̸�\t����\t����\t�հ�\t���");
		for(int i = 0; i<stu.length;i++) {
			int sum = kor[i] + eng[i];
			double avg = (kor[i] + eng[i])/2.0;
			System.out.println(stu[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + sum + "\t" + avg);
		}
	}
}

package exams;

import java.util.Scanner;

import classes.Student;

public class Exam_02 {

	public static int inputValidInt(String msg) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.print(msg);
				int num = Integer.parseInt(sc.nextLine());
				return num;
			}catch(Exception e){
				System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1001; // �л��鿡�� ���������� �ο��� ���� ID��
		Student[] stds = new Student[10];
		int index = 0;		
		for(;;) {
			System.out.println("=== �л� ���� �ý��� ===");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ��� ���");
			System.out.println("3. �л� ���� �˻�");
			System.out.println("4. �л� ���� ����");// ���� ���� - ���̵�� ���ο� ������ �Է¹޾� ��� ������ ����
			System.out.println("5. �л� ���� ����");// ���� ���� - ���������� �����Ͽ� ����ϴ� ���
			System.out.println("0. �ý��� ����");
			int menu = inputValidInt(">> ");

			if(menu == 1) {			

				System.out.print("�� �� : ");
				String name = sc.nextLine();

				int kor = inputValidInt("�� �� : ");
				int eng = inputValidInt("�� �� : ");
				int math = inputValidInt("�� �� : ");

				Student std = new Student(id++,name,kor,eng,math);
				stds[index++] = std;

			}else if(menu == 2) {
				for(int i = 0; i<index;i++) {
					System.out.println(stds[i].getId() + " " + stds[i].getName() + " " + stds[i].getKor() + " " + stds[i].getEng() + " " +stds[i].getMath());
				}
			}else if(menu == 3) {
				System.out.print("�˻��� �л��� �̸��� �Է����ּ���: ");
				String name = sc.nextLine();
				boolean existFlag = false;

				for(int i = 0; i<index; i++) {
					if(stds[i].getName().equals(name)){
						System.out.println(stds[i].getId() + " " + stds[i].getName() + " " + stds[i].getKor() + " " + stds[i].getEng() + " " +stds[i].getMath());
						existFlag = true;
					}
				}			
				if(existFlag == false) {
					System.out.println("�ش��ϴ� �л��� �����ϴ�.");
				}
			}else if(menu == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else
				System.out.println("�ٽ� �Է����ּ���.");

		}
	}
}

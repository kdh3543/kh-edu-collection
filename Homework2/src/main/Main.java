package main;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Student;
import classes.StudentManager;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1001;
		StudentManager sm = new StudentManager();
		while(true) {
			System.out.println("=== �л� ���� �ý��� ===");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ��� ���");
			System.out.println("3. �л� ���� �˻�");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. �ý��� ����");
			System.out.print("�޴� ����: ");
			Student stu = new Student();
			int menu = Integer.parseInt(sc.nextLine());
			ArrayList stus = sm.getStudents();
			if(menu == 1) {
				System.out.print("�л� �̸�: ");
				String name = sc.nextLine();
				System.out.print(name+" �л� ���� ����: ");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.print(name+" �л� ���� ����: ");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print(name+" �л� ���� ����: ");
				int math = Integer.parseInt(sc.nextLine());
				sm.addStudent(new Student(id++,name,kor,eng,math));
			}else if(menu == 2) {
				for(int i = 0; i < stus.size(); i++) {
					System.out.println(((Student)(stus.get(i))).getId() + " " + ((Student)(stus.get(i))).getName()
							+ " " + ((Student)(stus.get(i))).getKor() + " " + ((Student)(stus.get(i))).getEng()
							+ " " + ((Student)(stus.get(i))).getMath() + " " + ((Student)(stus.get(i))).sum()
							+ " " + ((Student)(stus.get(i))).avg()); 
				}
			}else if(menu == 3) {
				String sear = sc.nextLine();
				boolean bool = false;
				for(int i = 0; i < stus.size(); i++) {
					if(sear.equals(((Student)(stus.get(i))).getName())){
						System.out.println(((Student)(stus.get(i))).getId() + " " + ((Student)(stus.get(i))).getName()
								+ " " + ((Student)(stus.get(i))).getKor() + " " + ((Student)(stus.get(i))).getEng()
								+ " " + ((Student)(stus.get(i))).getMath() + " " + ((Student)(stus.get(i))).sum()
								+ " " + ((Student)(stus.get(i))).avg());
						bool = true;
					}
				}
				if(bool == false) {
					System.out.println("�ش� �л��� ������ �������� �ʽ��ϴ�.");
				}
			}else if(menu == 4) {
				System.out.print("������ �л��� Id�� �Է��ϼ���: ");
				int fix = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < stus.size(); i++) {
					if(fix == ((Student)(stus.get(i))).getId()) {
						System.out.print("�л��� id��: ");
						int fixid = Integer.parseInt(sc.nextLine());
						((Student)(stus.get(i))).setId(fixid);
						System.out.print("�л��� �̸���: ");
						String fixname = sc.nextLine();
						((Student)(stus.get(i))).setName(fixname);
						System.out.print("�л��� ���� ������: ");
						int fixkor = Integer.parseInt(sc.nextLine()); 
						((Student)(stus.get(i))).setKor(fixkor);
						System.out.print("�л��� ���� ������: ");
						int fixeng = Integer.parseInt(sc.nextLine()); 
						((Student)(stus.get(i))).setEng(fixeng);
						System.out.print("�л��� ���� ������: ");
						int fixmath = Integer.parseInt(sc.nextLine()); 
						((Student)(stus.get(i))).setMath(fixmath);
					}
				}
			}else if(menu == 5) {
				System.out.print("������ �л� ������ Id�� �Է��ϼ���: ");
				int del = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < stus.size(); i++) {
					if(del == ((Student)(stus.get(i))).getId()) {
						stus.remove(i);
					}
				}
			}else if(menu == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
	}
}

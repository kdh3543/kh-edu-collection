package main;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Manager;
import classes.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1001;
		Manager man = new Manager();
		while(true) {
			System.out.println("=== �л� ���� �ý��� ===");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ��� ���");
			System.out.println("3. �л� ���� �˻�");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. �ý��� ����");
			System.out.print("�޴� ����: ");
			ArrayList students = man.getStu();
			int pick = Integer.parseInt(sc.nextLine());

			if(pick == 1) {
				System.out.print("�л� �̸�: ");
				String name = sc.nextLine();
				System.out.print(name + "�л��� ����: ");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.print(name + "�л��� ����: ");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print(name + "�л��� ����: ");
				int math = Integer.parseInt(sc.nextLine());
				man.addStu(new Student(id++, name, kor, eng, math));
			}else if(pick == 2) {
				for(int i = 0; i < students.size(); i++) {
					System.out.println(((Student)(students).get(i)).getId() + "\t"  + ((Student)(students).get(i)).getName() + "\t"
							+ ((Student)(students).get(i)).getKor() + "\t" + ((Student)(students).get(i)).getEng() + "\t"
							+ ((Student)(students).get(i)).getMath() + "\t" + ((Student)(students).get(i)).getSum() + "\t"
							+ ((Student)(students).get(i)).getAvg());
				}
			}else if(pick == 3) {
				String search = sc.nextLine();
				boolean bool = false;
				for(int i = 0; i < students.size(); i++) {
					if(search.equals(((Student)(students).get(i)).getName())) {
						System.out.println(((Student)(students).get(i)).getId() + "\t"  + ((Student)(students).get(i)).getName() + "\t"
								+ ((Student)(students).get(i)).getKor() + "\t" + ((Student)(students).get(i)).getEng() + "\t"
								+ ((Student)(students).get(i)).getMath() + "\t" + ((Student)(students).get(i)).getSum() + "\t"
								+ ((Student)(students).get(i)).getAvg());
						bool = true;
					}
				}
				if(bool == false) {
					System.out.println("�˻��� �л��� ������ �����ϴ�.");
				}
			}else if(pick == 4) {
				System.out.print("������ �л��� id�� �Է��Ͻÿ�: ");
				int searchId = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < students.size(); i++) {
					if(searchId == ((Student)(students).get(i)).getId()) {
						System.out.print("�л��� id��: ");
						int fixId = Integer.parseInt(sc.nextLine());
						((Student)(students).get(i)).setId(fixId);
						System.out.print("�л��� �̸���: ");
						String fixName = sc.nextLine();
						((Student)(students).get(i)).setName(fixName);
						System.out.print("�л��� ���� ������: ");
						int fixKor = Integer.parseInt(sc.nextLine());
						((Student)(students).get(i)).setKor(fixKor);
						System.out.print("�л��� ���� ������: ");
						int fixEng = Integer.parseInt(sc.nextLine());
						((Student)(students).get(i)).setEng(fixEng);
						System.out.print("�л��� ���� ������: ");
						int fixMath = Integer.parseInt(sc.nextLine());
						((Student)(students).get(i)).setMath(fixMath);
					}
				}
			}else if(pick == 5) {
				System.out.print("������ �л��� id�� �Է��Ͻÿ�: ");
				int del = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < students.size(); i++) {
					if(del == ((Student)(students).get(i)).getId()){
						students.remove(i);
					}
				}

			}else if(pick == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else
				System.out.println("�ٽ� �������ּ���.");
		}	
	}

}

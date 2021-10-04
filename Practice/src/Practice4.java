import java.util.Scanner;

import classes.Somebody;

public class Practice4 {
	public static int ValidInt(String msg) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print(msg);
				int num = Integer.parseInt(sc.nextLine());
				return num;
			}catch(Exception e) {
				System.out.println("���ڷ� �Է����ּ���.");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		Somebody[] members = new Somebody[10];
		while(true) {
			System.out.println("=== �л� ���� �ý��� ===");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ��� ���");
			System.out.println("3. �л� ���� �˻�");
			System.out.println("0. �ý��� ����");
			int menu = ValidInt(">> ");

			if(menu == 1) {

				int id = ValidInt("�л��� id: ");
				String name = sc.nextLine();
				int kor = ValidInt(id + "�л��� ���� ����: ");
				int eng = ValidInt(id + "�л��� ���� ����: ");
				int math = ValidInt(id + "�л��� ���� ����: ");
				Somebody sb = new Somebody(id, name, kor);
				members[index++] = sb;
			}else if(menu == 2) {
				for(int i = 0; i < index; i++) {
					System.out.println(members[i].getId() + "\t" + members[i].getName()
							+ "\t" + members[i].getId());
				}
			}else if(menu == 3) {
				System.out.print("�˻��� �л��� �̸��� �Է����ּ���: ");
				String search = sc.nextLine();
				boolean bool = false;
				for(int i = 0; i < index; i++) {
					if(search.equals(members[i].getName())) {
						System.out.println(members[i].getId() + "\t" + members[i].getName()
								+ "\t" + members[i].getId());
						bool = true;
					}
					if (bool == false) {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}
				}
				
			}else if(menu == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else
				System.out.println("�ٽ� �Է����ּ���.");
		}
	}
}

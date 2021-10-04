package main;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Diamond;
import classes.Gold;
import classes.Grade;
import classes.Silver;
import manager.Manager;

public class Main {
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
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
	
		for(;;) {
			System.out.println("=== ȸ������ �ý��� ===");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ��� ���");
			System.out.println("3. �ý��� ����");
			int menu = ValidInt("==> ");

			if(menu == 1) {
				manager.addMember(new Gold(1001, "Tom", 1000));
				manager.addMember(new Silver(1002, "jane", 2000));
				manager.addMember(new Silver(1003, "jake", 3000));
				manager.addMember(new Gold(1004, "Chalie", 5000));
				manager.addMember(new Diamond(1005, "kevin", 8000));
			}else if(menu == 2) {
				ArrayList members = manager.getMembers();
				for(int i = 0; i < members.size();i++) {
					System.out.println(((Grade)members.get(i)).getId() + " " + ((Grade)members.get(i)).getName() + " "
							+ ((Grade)members.get(i)).getPoint() + " " + ((Grade)members.get(i)).getBonus());
				}
			}else if(menu == 3) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else
				System.out.println("�ش� �޴��� �����ϴ�. �ٽ� �������ֽʽÿ�.");
		}
		
	}
}

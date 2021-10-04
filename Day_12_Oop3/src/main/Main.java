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
				System.out.println("숫자로 입력해주세요.");
			}
		}
	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
	
		for(;;) {
			System.out.println("=== 회원관리 시스템 ===");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 목록 출력");
			System.out.println("3. 시스템 종료");
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
				System.out.println("시스템을 종료합니다.");
				break;
			}else
				System.out.println("해당 메뉴는 없습니다. 다시 선택해주십시오.");
		}
		
	}
}

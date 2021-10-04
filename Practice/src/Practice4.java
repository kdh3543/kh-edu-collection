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
				System.out.println("숫자로 입력해주세요.");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		Somebody[] members = new Somebody[10];
		while(true) {
			System.out.println("=== 학생 관리 시스템 ===");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("0. 시스템 종료");
			int menu = ValidInt(">> ");

			if(menu == 1) {

				int id = ValidInt("학생의 id: ");
				String name = sc.nextLine();
				int kor = ValidInt(id + "학생의 국어 점수: ");
				int eng = ValidInt(id + "학생의 영어 점수: ");
				int math = ValidInt(id + "학생의 수학 점수: ");
				Somebody sb = new Somebody(id, name, kor);
				members[index++] = sb;
			}else if(menu == 2) {
				for(int i = 0; i < index; i++) {
					System.out.println(members[i].getId() + "\t" + members[i].getName()
							+ "\t" + members[i].getId());
				}
			}else if(menu == 3) {
				System.out.print("검색할 학생의 이름을 입력해주세요: ");
				String search = sc.nextLine();
				boolean bool = false;
				for(int i = 0; i < index; i++) {
					if(search.equals(members[i].getName())) {
						System.out.println(members[i].getId() + "\t" + members[i].getName()
								+ "\t" + members[i].getId());
						bool = true;
					}
					if (bool == false) {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
				
			}else if(menu == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else
				System.out.println("다시 입력해주세요.");
		}
	}
}

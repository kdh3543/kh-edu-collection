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
			System.out.println("=== 학생 관리 시스템 ===");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 시스템 종료");
			System.out.print("메뉴 선택: ");
			ArrayList students = man.getStu();
			int pick = Integer.parseInt(sc.nextLine());

			if(pick == 1) {
				System.out.print("학생 이름: ");
				String name = sc.nextLine();
				System.out.print(name + "학생의 국어: ");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.print(name + "학생의 영어: ");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print(name + "학생의 수학: ");
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
					System.out.println("검색한 학생의 정보는 없습니다.");
				}
			}else if(pick == 4) {
				System.out.print("수정할 학생의 id를 입력하시오: ");
				int searchId = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < students.size(); i++) {
					if(searchId == ((Student)(students).get(i)).getId()) {
						System.out.print("학생의 id는: ");
						int fixId = Integer.parseInt(sc.nextLine());
						((Student)(students).get(i)).setId(fixId);
						System.out.print("학생의 이름은: ");
						String fixName = sc.nextLine();
						((Student)(students).get(i)).setName(fixName);
						System.out.print("학생의 국어 점수는: ");
						int fixKor = Integer.parseInt(sc.nextLine());
						((Student)(students).get(i)).setKor(fixKor);
						System.out.print("학생의 영어 점수는: ");
						int fixEng = Integer.parseInt(sc.nextLine());
						((Student)(students).get(i)).setEng(fixEng);
						System.out.print("학생의 수학 점수는: ");
						int fixMath = Integer.parseInt(sc.nextLine());
						((Student)(students).get(i)).setMath(fixMath);
					}
				}
			}else if(pick == 5) {
				System.out.print("삭제할 학생의 id를 입력하시오: ");
				int del = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < students.size(); i++) {
					if(del == ((Student)(students).get(i)).getId()){
						students.remove(i);
					}
				}

			}else if(pick == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else
				System.out.println("다시 선택해주세요.");
		}	
	}

}

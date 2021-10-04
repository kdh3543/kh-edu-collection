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
			System.out.println("=== 학생 관리 시스템 ===");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 시스템 종료");
			System.out.print("메뉴 선택: ");
			Student stu = new Student();
			int menu = Integer.parseInt(sc.nextLine());
			ArrayList stus = sm.getStudents();
			if(menu == 1) {
				System.out.print("학생 이름: ");
				String name = sc.nextLine();
				System.out.print(name+" 학생 국어 점수: ");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.print(name+" 학생 영어 점수: ");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print(name+" 학생 수학 점수: ");
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
					System.out.println("해당 학생의 정보는 존재하지 않습니다.");
				}
			}else if(menu == 4) {
				System.out.print("수정할 학생의 Id를 입력하세요: ");
				int fix = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < stus.size(); i++) {
					if(fix == ((Student)(stus.get(i))).getId()) {
						System.out.print("학생의 id는: ");
						int fixid = Integer.parseInt(sc.nextLine());
						((Student)(stus.get(i))).setId(fixid);
						System.out.print("학생의 이름은: ");
						String fixname = sc.nextLine();
						((Student)(stus.get(i))).setName(fixname);
						System.out.print("학생의 국어 성적은: ");
						int fixkor = Integer.parseInt(sc.nextLine()); 
						((Student)(stus.get(i))).setKor(fixkor);
						System.out.print("학생의 영어 성적은: ");
						int fixeng = Integer.parseInt(sc.nextLine()); 
						((Student)(stus.get(i))).setEng(fixeng);
						System.out.print("학생의 수학 성적은: ");
						int fixmath = Integer.parseInt(sc.nextLine()); 
						((Student)(stus.get(i))).setMath(fixmath);
					}
				}
			}else if(menu == 5) {
				System.out.print("삭제할 학생 정보의 Id를 입력하세요: ");
				int del = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < stus.size(); i++) {
					if(del == ((Student)(stus.get(i))).getId()) {
						stus.remove(i);
					}
				}
			}else if(menu == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
	}
}

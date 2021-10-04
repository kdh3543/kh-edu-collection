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
				System.out.println("숫자를 입력해야 합니다.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1001; // 학생들에게 순차적으로 부여될 고유 ID값
		Student[] stds = new Student[10];
		int index = 0;		
		for(;;) {
			System.out.println("=== 학생 관리 시스템 ===");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");// 선택 과제 - 아이디와 새로운 정보를 입력받아 대상 정보를 수정
			System.out.println("5. 학생 성적 순위");// 선택 과제 - 성적순으로 정렬하여 출력하는 기능
			System.out.println("0. 시스템 종료");
			int menu = inputValidInt(">> ");

			if(menu == 1) {			

				System.out.print("이 름 : ");
				String name = sc.nextLine();

				int kor = inputValidInt("국 어 : ");
				int eng = inputValidInt("영 어 : ");
				int math = inputValidInt("수 학 : ");

				Student std = new Student(id++,name,kor,eng,math);
				stds[index++] = std;

			}else if(menu == 2) {
				for(int i = 0; i<index;i++) {
					System.out.println(stds[i].getId() + " " + stds[i].getName() + " " + stds[i].getKor() + " " + stds[i].getEng() + " " +stds[i].getMath());
				}
			}else if(menu == 3) {
				System.out.print("검색할 학생의 이름을 입력해주세요: ");
				String name = sc.nextLine();
				boolean existFlag = false;

				for(int i = 0; i<index; i++) {
					if(stds[i].getName().equals(name)){
						System.out.println(stds[i].getId() + " " + stds[i].getName() + " " + stds[i].getKor() + " " + stds[i].getEng() + " " +stds[i].getMath());
						existFlag = true;
					}
				}			
				if(existFlag == false) {
					System.out.println("해당하는 학생이 없습니다.");
				}
			}else if(menu == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else
				System.out.println("다시 입력해주세요.");

		}
	}
}

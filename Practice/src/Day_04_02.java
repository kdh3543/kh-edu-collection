import java.util.Scanner;

public class Day_04_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hm = 0;
		while(true) {
			try {System.out.print("소지금 : ");
			hm = Integer.parseInt(sc.nextLine());
			break;
			}catch(Exception e) {
				System.out.println("숫자를 다시 입력해주세요.");
			}
		}

		int coke = 0;
		int cider = 0;
		int tea = 0;
		int sel = 0;
		while(true) {
			System.out.println("====자판기 시뮬레이터====");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1. 콜라(1000) 2. 사이다(800) 3. 매실차(1500) [0.소지품확인]");
			while(true) {
				try {
					sel = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 다시 입력해주세요.");
				}
			}

			if(sel == 4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}

			int cop = 1000;
			int cip = 800;
			int tp = 1500;

			if(sel == 0) {
				System.out.println("=======소지품 목록=======");
				System.out.println("소지금 : " + hm);
				System.out.println("콜라 : " + coke);
				System.out.println("사이다 : " + cider);
				System.out.println("매실차 : " + tea);
			}

			if(sel == 1) {
				if(hm < cop) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("콜라 +1");
					System.out.println("소지금 -1000");
					coke++;
					hm -= cop;
				}
			}else if(sel == 2) {
				if(hm < cip) {
					System.out.println("잔액이 부족합니다.");
				}else {
				System.out.println("사이다 +1");
				System.out.println("소지금 -800");
				cider++;
				hm -= cip;
				}
			}else if(sel == 3) {
				if(hm < tp) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("매실차 +1");
					System.out.println("소지금 -1500");
					tea++;
					hm -= tp;
				}	
			}else
				System.out.println("잘못 입력하셨습니다.");
		}

	}

}

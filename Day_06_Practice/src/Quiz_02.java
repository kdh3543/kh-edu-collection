import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소지금 : ");	
		int coke = 0;
		int cider = 0;
		int tea = 0;
		int sum = 0;
		while(true) {
			try {
				sum = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		int pick = 0;
		while(true) {
			System.out.println("====자판기 시뮬레이터====");
			System.out.println("읍료수를 선택하세요.");
			System.out.println("1. 콜라(1000) 2. 사이다(800) 3. 매실차(1500) [0.소지품확인]");
			int cop = 1000;
			int cip	= 800;
			int tp = 1500;
			while(true) {
				try {
					pick = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 입력해주세요.");
				}
			}

			if(pick == 0) {
				System.out.println("========소지품 목록========");
				System.out.println("소지금 : " + sum);
				System.out.println("콜라 : " + coke + "개");
				System.out.println("사이다 : " + cider + "개");
				System.out.println("매실차 : " + tea + "개");
			}else if(pick == 4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}		
			if(pick != 1 && pick != 2 && pick != 3) {
				System.out.println("다시 입력해주세요.");
				continue;
			}else {
				if(sum < cop || sum < cip || sum < tp) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}else {
					if(pick == 1) {
						System.out.println("콜라를 구매했습니다.");
						System.out.println("콜라 +1");
						coke++;
						System.out.println("소지금 -1000");
						sum -= cop;
					}else if(pick == 2) {
						sum -= cip;
						System.out.println("사이다를 구매했습니다.");
						System.out.println("사이다 +1");
						cider++;
						System.out.println("소지금 -800");
					}else if(pick == 3){
						sum -= tp;
						System.out.println("매실차를 구매했습니다.");
						System.out.println("매실차 +1");
						tea++;
						System.out.println("소지금 -1500");
					}
				}
			}
		}
	}
}

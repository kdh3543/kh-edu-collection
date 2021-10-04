import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hm = 0;
		while(true) {
			System.out.println("=== ATM 시뮬레이터 ===");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기");
			System.out.print("메뉴를 선택하세요: ");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {
				System.out.println("현재 보유 잔액은 " + hm + "원 입니다.");
			}else if(menu == 2) {
				System.out.print("얼마를 입금하시겠습니까: ");
				int pm = Integer.parseInt(sc.nextLine());
				hm += pm;
			}else if(menu == 3) {
				System.out.print("얼마를 출금하시겠습니까: ");
				int om = Integer.parseInt(sc.nextLine());
				if(om > hm) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println(om + "원이 출금되었습니다.");
					hm -= om;
				}
			}else if(menu == 4) {
				System.out.println("시스템을 종료합니다. 안녕히 가세요.");
				break;
			}else {
				System.out.println("다시 선택해주세요.");
			}
		}
	}
}
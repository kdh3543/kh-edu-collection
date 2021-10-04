import java.util.Scanner;

public class Day_04_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int menu = 0;
		while(true) {
			System.out.println("===Atm Simulator===");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기");
			System.out.print(">> ");
			while(true) {
				try {
					menu = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 다시 입력해주세요.");
				}
			}
			if(menu == 1) {				
			}else if(menu == 2) {
				while(true) {
					try {
						System.out.print("얼마를 입금하시겠습니까 : ");
						int put = Integer.parseInt(sc.nextLine());
						System.out.println(put + " 원이 입금 되었습니다.");
						sum += put;
						break;
					}catch(Exception e) {
						System.out.println("숫자를 다시 입력해주세요.");
					}
				}
			}else if(menu == 3) {
				while(true) {
					while(true) {
						try {System.out.print("얼마를 출금하시겠습니까 : ");
						int out = Integer.parseInt(sc.nextLine());
						if(sum < out) {
							System.out.println("잔액이 부족합니다.");
						}else {
							System.out.println(out + " 원이 출금 되었습니다.");
							sum -= out;
							break;
						}
						}catch(Exception e) {
							System.out.println("숫자를 다시 입력해주세요.");
						}
					}
					break;
				}
			}else if(menu == 4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println("현재 보유 잔액은 "+ sum + " 입니다.");
		}
	}

}

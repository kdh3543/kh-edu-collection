import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = 0;
		while(true) {	
			System.out.println("***ATM 시뮬레이터***");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기");
			System.out.print(">> ");
			while(true) {
				try {
					input = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 입력해주세요.");
				}
			}

			if(input == 1) {
			}else if(input == 2) {
				while(true) {
					try {
						System.out.println("얼마를 입금하시겠습니까? ");
						System.out.print(">> ");
						int put = Integer.parseInt(sc.nextLine());
						sum += put; // 사용자가 입력한 값과 원래 가지고 있던 값을 더해수 누적
						System.out.println(put + "원이 입금 되었습니다.");
						break;
					}catch(Exception e) {
						System.out.println("숫자를 입력해주세요.");
					}
				}
			}else if(input == 3) {
				while(true) {
					while(true) {
						try {
							System.out.println("얼마를 출금하시겠습니까? ");
							System.out.print(">> ");
							int out = Integer.parseInt(sc.nextLine());
							if(out <= sum) {
								sum -= out;
								System.out.println(out + "원이 출금 되었습니다.");
								break;
							}else if(out > sum) {
								System.out.println("다시 출금하실 금액을 입력해주세요.");	
							}
						}catch(Exception e) {
							System.out.println("숫자를 입력해주세요.");
						}
					}
					break;
				}
			}else if(input == 4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			System.out.println("현재 보유 잔액은" + sum + " 원 입니다.");
			System.out.println();
		}
	}
}

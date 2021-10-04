import java.util.Scanner;

public class Homework_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0; // 메뉴 선택 변수
		int hm = 0; //잔액에 대한 변수
		int dm = 0; // 입금하는 돈에 대한 변수
		int om = 0; // 인출하는 돈에 대한 변수
		int pick = 0; // 배팅하려는 말에 대한 변수
		int bm = 0; //배팅하는 금액에 대한 변수
		while(true) {
			System.out.println("경마게임에 오신 것을 환영합니다.");
			System.out.println("1. 게임 시작");
			System.out.println("2. 잔액 충전");
			System.out.println("3. 잔액 조회");
			System.out.println("4. 현금 인출");
			System.out.println("5. 종료");
			// 메뉴 선택 시 숫자로 입력하지 않았을 시, 잘못된 수 입력시에 대한 예외처리
			while(true) {
				try {
					System.out.print("메뉴를 선택해주세요 : ");
					menu = Integer.parseInt(sc.nextLine());
					if(0<menu&&menu<6) {
						break;	
					}else
						System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
				}catch(Exception e) {
					System.out.println("숫자로 입력해주세요.");
				}
			}

			if(menu == 1) {
				int hgr = (int)(Math.random()*3 + 1); // int hgr(horse game result) 게임 결과에 대한 변수
				// 선택하는 말을 입력할 때 숫자가 아닌 입력 및 잘못된 수 입력시에 대한 예외처리
				while(true) {
					try {
						System.out.println("아래 3종류의 말이 있습니다.");
						System.out.println("1. 우승 경력이 많지만 은퇴를 앞둔 말 ==> 배당 3배");
						System.out.println("2. 이번달 성적이 제일 좋은 말	==> 배당 1.5배");
						System.out.println("3. 최근 떠오르는 신예 말 ==> 배당 2배");
						System.out.print("어떤 말을 선택하시겠습니까: ");
						pick = Integer.parseInt(sc.nextLine());
						if(0<pick && pick<4) {
							break;
						}else 
							System.out.println("다시 입력해주세요.");						
					}catch(Exception e) {
						System.out.println("숫자로 입력해주세요.");
					}
				}
				// 배팅하는 돈을 입력할 때 숫자가 아닌 입력 및 잘못된 수 입력시에 대한 예외처리
				while(true) {
					try {
						System.out.print("얼마를 배팅하시겠습니까: ");
						bm = Integer.parseInt(sc.nextLine());
						if(bm > hm) {
							System.out.println("잔액이 부족합니다.");
						}else
							break;
					}catch(Exception e) {
						System.out.println("숫자로 입력해주세요.");
					}
				}

				if(pick == hgr) {
					System.out.println("배팅에 성공하셨습니다!!");
					if(pick == 1) {
						System.out.println(bm*3 + "원을 획득하셨습니다.");
					}else if(pick == 2) {
						System.out.println((int)(bm*1.5) + "원을 획득하셨습니다.");
					}else {
						System.out.println(bm*2 + "원을 획득하셨습니다.");
					}
					hm += bm; // 가지고 있는 잔액에 획득한 배팅 금액만큼 추가
				}else {
					System.out.println("배팅한 금액인 " + bm + "원을 모두 잃으셨습니다.");
					hm -= bm; // 가지고 있는 잔액에 잃은 금액만큼 차감
				}
			}else if(menu == 2) {

				// 입금하는 돈을 입력할 때 숫자가 아닌 입력 및 잘못된 수 입력시에 대한 예외처리
				while(true) { 
					try {	
						if(dm < 0) {
							System.out.println("잘못된 입력입니다.");
						}else {
							System.out.print("얼마를 충전하시겠습니까: ");
							dm = Integer.parseInt(sc.nextLine());
							System.out.println(dm + "원을 충전했습니다.");
							hm += dm;
							break;
						}
					}catch(Exception e) {
						System.out.println("숫자로 입력해주세요.");
					}
				}
			}else if(menu == 3) {
				System.out.println("현재 잔액은 " + hm + "원 입니다."); 
			}else if(menu == 4) {

				while(true) {
					try {	
						if(om > hm) {
							System.out.println("잔액이 부족합니다.");
						}else{
							System.out.print("얼마를 인출하시겠습니까: ");
							om = Integer.parseInt(sc.nextLine());
							System.out.println(om + "원을 인출합니다.");
							hm -= om; // 기존에 남아있는 금액에 인출한 금액만큼을 차감한 값
							System.out.println("남아있는 잔액은 " + dm + "원 입니다." );
							break;
						}	
					}catch(Exception e) {
						System.out.println("숫자로 입력해주세요.");
					}
				}	
			}else {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
}

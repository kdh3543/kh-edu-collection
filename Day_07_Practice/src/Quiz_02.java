import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int input = 0;
		int bs = 100;
		int com = 0;
		int i = 0;
		int cs = 0;
		int ps = 0;
		while(true) {
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");

			while(true) {
				try {
					System.out.print("메뉴 선택 : ");
					menu = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("번호로 입력해 주세요.");
				}
			}
			if(menu == 1) {

				i = 0;
				int answer = (int)(Math.random()*99 + 1);
				System.out.println("<< Game Start >>");
				System.out.println(answer);
				//플레이어 차례
				System.out.println("==== Player Turn ====");
				while(true) {
					i++;
					System.out.println(i + "번째 시도");

					while(true) {
						try {
							System.out.print("Input Number : ");
							input = Integer.parseInt(sc.nextLine());
							break;
						}catch(Exception e) {
							System.out.println("번호로 입력해 주세요.");
						}
					}
					if(input==answer) {
						System.out.println("정답");						
						// 정답을 맞추는 순간, 플레이어의 점수가 최고 기록과 비교해서 더 좋은 점수인지 확인해야함
						ps++;
						System.out.println("플레이어 승");
						break;
					}else if(input < answer) {
						System.out.println("<< UP >>");

					}else if(input > answer) {
						System.out.println("<< DOWN >>");
					}

					// 컴퓨터 차례
					System.out.println("==== Computer Turn ====");

					System.out.println(i + "번째 시도");
					System.out.print("Input Number : ");
					com = (int)(Math.random()*99+1);
					System.out.println(com);
					if(com==answer) {
						System.out.println("정답");
						cs++;
						System.out.println("컴퓨터 승");
						break;
					}else if(com < answer) {
						System.out.println("<< UP >>");

					}else if(com > answer) {
						System.out.println("<< DOWN >>");
					}
				}
			}else if(menu == 2) { 	
				System.out.println("스코어 == " + "플레이어 = " + ps + " : " + " 컴퓨터 = " + cs);
			}else if(menu == 3) {
				System.out.println("게임을 종료하겠습니다.");
				break;
			}else
				System.out.println("다시 입력해주세요.");
		}
	}	
}

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int ps = 0;
		int cs = 0;
		int i = 0;
		while(true) {
			i++;
			System.out.println("===가위 바위 보 게임===");
			System.out.println(i + "번째 게임");
			System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
			int com = (int)(Math.random()*3+1);
			while(true) {
				try {
					sel = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자로 입력해주세요.");
				}
			}

			System.out.println("========= 결과 =========");
			if(sel == 1) {
				System.out.println("당신은 가위를 냈습니다.");
			}else if(sel == 2) {
				System.out.println("당신은 바위를 냈습니다.");
			}else if(sel == 3){
				System.out.println("당신은 보를 냈습니다.");
			}else if(sel == 0) {
				System.out.println("게임이 종료되었습니다.");	
				break;
			}else {
				System.out.println("다시 선택해주세요.");
				continue;
			}
			
			if(com == 1) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
			}else if(com == 2) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
			}else
				System.out.println("컴퓨터는 보를 냈습니다.");
			
			System.out.println("=======================");
			if(sel == com) {
				System.out.println("컴퓨터와 플레이어가 비겼습니다.");
			}else if((sel == 1 && com == 2) || (sel==2 && com==3) || (sel==3&&com==1)) {
				System.out.println("컴퓨터가 이겼습니다.");
				cs++;
			}else {
				System.out.println("플레이어가 이겼습니다.");
				ps++;
			}
			System.out.println(ps + " : " + cs);
		}
		System.out.println("최종 스코어 : " + ps + " : " + cs);
		if(ps > cs) {
			System.out.println("플레이어 승!!!");
		}else if(ps < cs) {
			System.out.println("컴퓨터 승!!!");
		}else
			System.out.println("무승부~!!!");
	}

}

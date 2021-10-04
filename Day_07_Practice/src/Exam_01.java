import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pick = 0;
		int ps = 0;
		int cs = 0;
		while(true) {
			int ran = (int)(Math.random()*2 + 1);
			System.out.println(ps + " : " + cs);
			System.out.println("===동전 앞 뒤 맞추기===");
			

			while(true) {
				try {
					System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
					pick = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 다시 입력해주세요.");
				}
			}
			
			if(pick == 0) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}

			if(pick != 1 && pick != 2) {
				System.out.println("다시 입력해주세요.");
				continue;
			}else {
				if(pick == ran) {
					System.out.println("맞췄습니다!!");
					ps++;
				}else
					System.out.println("틀렸습니다.");
					cs++;
			}
			
			System.out.println("----------------------------> restart");
		}
	}
}

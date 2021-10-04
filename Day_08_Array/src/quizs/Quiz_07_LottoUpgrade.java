package quizs;

public class Quiz_07_LottoUpgrade {
	public static void main(String[] args) {
		int ans = 0;
		int[] lotto = new int[45];
		System.out.println("오늘의 로또 번호 추천 프로그램");

		for(int i = 0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}

		for(int i =0;i<lotto.length*100;i++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			int tmp = lotto[x];
			lotto[x] = lotto[y];
			lotto[y] = tmp;
		}

		int[] play = new int[45];
		for(int i = 0;i<play.length;i++) {
			play[i] = (int)(Math.random()*45);
		}
		for(int i = 0;i<play.length*100;i++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			int tmp = play[x];
			play[x] = play[y];
			play[y] = tmp;			
		}
		System.out.print("추첨 번호: ");
		for(int i = 0;i<6;i++) {
			System.out.print(play[i] + " ");
		}
		System.out.println();
		ans=0;
		
		for(;;) {
			for(int i = 0;i<6;i++) {
				for(int j = 0;j<6;j++) {
					if(lotto[i]==play[j]) {
						ans++;
					}
				}
			}
			if(ans==6) {
				System.out.println("당첨입니다.");
				break;
			}else if(ans==5) {
				System.out.println("3등입니다.");
			}else if(ans==4) {
				System.out.println("4등입니다.");
			}else if(ans==3) {
				System.out.println("5등입니다.");
				
			}else if(ans==2) {
				System.out.println("6등");
				
			}else
				System.out.println("당첨되지 못했습니다.");
		}

		System.out.println();
		System.out.print("로또 당첨 번호: ");
		for(int i = 0; i<6;i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("7번째 보너스 번호: " + lotto[6]);

	}
}

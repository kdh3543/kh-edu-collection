public class Day_05 {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		int[] rcd = new int[45];
		int t = 0;
		System.out.println("오늘의 로또 번호 추천 프로그램");
		for(;;) {
			
			t++;
			for(int i =0;i<lotto.length;i++) {
				lotto[i] = i+1;
			}

			for(int i = 0; i<lotto.length*100;i++) {
				int x = (int)(Math.random()*45);
				int y = (int)(Math.random()*45);

				int tmp = lotto[x];
				lotto[x] = lotto[y];
				lotto[y] = tmp;
			}

			for(int i = 0; i<rcd.length;i++) {
				rcd[i] = i+1;
			}

			for(int i = 0; i<rcd.length;i++) {
				int x = (int)(Math.random()*45);
				int y = (int)(Math.random()*45);

				int tmp = rcd[x];
				rcd[x] = rcd[y];
				rcd[y] = tmp;
			}

			System.out.print(t+" 번째 로또 추첨 번호: ");
			for(int i = 0;i<6;i++) {
				System.out.print(rcd[i] + " ");
			}
			int bonus = 0;
			int count = 0;
			for(int i = 0;i<6;i++) {
				for(int j = 0;j<6;j++) {
					if(rcd[j] == lotto[i]) {
						count++;
					}
					if(rcd[j]==lotto[6]) {
						bonus++;
					}
				}
			}

			System.out.print("\t");	
			if(count==6) {
				System.out.print("당첨입니다.");
				break;
			}else if(count==5&&bonus==1) {
				System.out.print("2등입니다.");
			}else if(count==5) {
				System.out.print("3등입니다.");
			}else if(count==4) {
				System.out.print("4등입니다.");
			}else if(count==3) {
				System.out.print("3등입니다.");
			}else {
				System.out.print("당첨되지 못했습니다.");
			}
			System.out.println();
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
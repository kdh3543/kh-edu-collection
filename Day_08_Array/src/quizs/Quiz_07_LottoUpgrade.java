package quizs;

public class Quiz_07_LottoUpgrade {
	public static void main(String[] args) {
		int ans = 0;
		int[] lotto = new int[45];
		System.out.println("������ �ζ� ��ȣ ��õ ���α׷�");

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
		System.out.print("��÷ ��ȣ: ");
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
				System.out.println("��÷�Դϴ�.");
				break;
			}else if(ans==5) {
				System.out.println("3���Դϴ�.");
			}else if(ans==4) {
				System.out.println("4���Դϴ�.");
			}else if(ans==3) {
				System.out.println("5���Դϴ�.");
				
			}else if(ans==2) {
				System.out.println("6��");
				
			}else
				System.out.println("��÷���� ���߽��ϴ�.");
		}

		System.out.println();
		System.out.print("�ζ� ��÷ ��ȣ: ");
		for(int i = 0; i<6;i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("7��° ���ʽ� ��ȣ: " + lotto[6]);

	}
}

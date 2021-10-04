public class Day_05_LottoUpgrade {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		int[] rcd = new int[45];
		int t = 0;
		int sec = 0;
		int thd = 0;
		int four = 0;
		int fifth = 0;
		System.out.println("������ �ζ� ��ȣ ��õ ���α׷�");
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

			System.out.print(t+" ��° �ζ� ��÷ ��ȣ: ");
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
				System.out.print("��÷�Դϴ�.");
				break;
			}else if(count==5&&bonus==1) {
				System.out.print("2���Դϴ�.");
				sec++;
			}else if(count==5) {
				System.out.print("3���Դϴ�.");
				thd++;
			}else if(count==4) {
				System.out.print("4���Դϴ�.");
				four++;
			}else if(count==3) {
				System.out.print("3���Դϴ�.");
				fifth++;
			}else {
				System.out.print("��÷���� ���߽��ϴ�.");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("�ζ� ��÷ ��ȣ: ");
		for(int i = 0; i<6;i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("7��° ���ʽ� ��ȣ: " + lotto[6]);
		System.out.println("2�� ��÷ Ƚ��: "+sec + " ��÷ Ȯ��: " + (double)sec/t);
		System.out.println("3�� ��÷ Ƚ��: "+thd + " ��÷ Ȯ��: " + (double)thd/t);
		System.out.println("4�� ��÷ Ƚ��: "+four + " ��÷ Ȯ��: " + (double)four/t);
		System.out.println("5�� ��÷ Ƚ��: "+fifth + " ��÷ Ȯ��: " + (double)fifth/t);
	}
}
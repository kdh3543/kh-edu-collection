package quizs;

public class Quiz_06_lotto {
	public static void main(String[] args) {
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
		
		int[] rclotto = new int[6];
		for(int i = 0; i<rclotto.length;i++) {
			rclotto[i] = lotto[i];
		}
		
		for(int i = 0; i<rclotto.length-1;i++) {
			for(int j = 0; j<rclotto.length-1;j++) {
				if(rclotto[j] > rclotto[j+1]) {
					int tmp = rclotto[j];
					rclotto[j] = rclotto[j+1];
					rclotto[j+1] = tmp;
				}
			}
		}
		System.out.print("�ζ� ��÷ ��ȣ: ");
		for(int i = 0; i<6;i++) {
				System.out.print(rclotto[i] + " ");
		}
		System.out.println();
		System.out.println("7��° ���ʽ� ��ȣ: " + lotto[6]);
	}
}

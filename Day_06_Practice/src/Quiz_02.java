import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ : ");	
		int coke = 0;
		int cider = 0;
		int tea = 0;
		int sum = 0;
		while(true) {
			try {
				sum = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
			}
		}
		int pick = 0;
		while(true) {
			System.out.println("====���Ǳ� �ùķ�����====");
			System.out.println("������� �����ϼ���.");
			System.out.println("1. �ݶ�(1000) 2. ���̴�(800) 3. �Ž���(1500) [0.����ǰȮ��]");
			int cop = 1000;
			int cip	= 800;
			int tp = 1500;
			while(true) {
				try {
					pick = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �Է����ּ���.");
				}
			}

			if(pick == 0) {
				System.out.println("========����ǰ ���========");
				System.out.println("������ : " + sum);
				System.out.println("�ݶ� : " + coke + "��");
				System.out.println("���̴� : " + cider + "��");
				System.out.println("�Ž��� : " + tea + "��");
			}else if(pick == 4) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}		
			if(pick != 1 && pick != 2 && pick != 3) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}else {
				if(sum < cop || sum < cip || sum < tp) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}else {
					if(pick == 1) {
						System.out.println("�ݶ� �����߽��ϴ�.");
						System.out.println("�ݶ� +1");
						coke++;
						System.out.println("������ -1000");
						sum -= cop;
					}else if(pick == 2) {
						sum -= cip;
						System.out.println("���̴ٸ� �����߽��ϴ�.");
						System.out.println("���̴� +1");
						cider++;
						System.out.println("������ -800");
					}else if(pick == 3){
						sum -= tp;
						System.out.println("�Ž����� �����߽��ϴ�.");
						System.out.println("�Ž��� +1");
						tea++;
						System.out.println("������ -1500");
					}
				}
			}
		}
	}
}

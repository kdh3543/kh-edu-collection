import java.util.Scanner;

public class Day_04_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hm = 0;
		while(true) {
			try {System.out.print("������ : ");
			hm = Integer.parseInt(sc.nextLine());
			break;
			}catch(Exception e) {
				System.out.println("���ڸ� �ٽ� �Է����ּ���.");
			}
		}

		int coke = 0;
		int cider = 0;
		int tea = 0;
		int sel = 0;
		while(true) {
			System.out.println("====���Ǳ� �ùķ�����====");
			System.out.println("������� �����ϼ���.");
			System.out.println("1. �ݶ�(1000) 2. ���̴�(800) 3. �Ž���(1500) [0.����ǰȮ��]");
			while(true) {
				try {
					sel = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �ٽ� �Է����ּ���.");
				}
			}

			if(sel == 4) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}

			int cop = 1000;
			int cip = 800;
			int tp = 1500;

			if(sel == 0) {
				System.out.println("=======����ǰ ���=======");
				System.out.println("������ : " + hm);
				System.out.println("�ݶ� : " + coke);
				System.out.println("���̴� : " + cider);
				System.out.println("�Ž��� : " + tea);
			}

			if(sel == 1) {
				if(hm < cop) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else {
					System.out.println("�ݶ� +1");
					System.out.println("������ -1000");
					coke++;
					hm -= cop;
				}
			}else if(sel == 2) {
				if(hm < cip) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else {
				System.out.println("���̴� +1");
				System.out.println("������ -800");
				cider++;
				hm -= cip;
				}
			}else if(sel == 3) {
				if(hm < tp) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else {
					System.out.println("�Ž��� +1");
					System.out.println("������ -1500");
					tea++;
					hm -= tp;
				}	
			}else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}

import java.util.Scanner;

public class Homework_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0; // �޴� ���� ����
		int hm = 0; //�ܾ׿� ���� ����
		int dm = 0; // �Ա��ϴ� ���� ���� ����
		int om = 0; // �����ϴ� ���� ���� ����
		int pick = 0; // �����Ϸ��� ���� ���� ����
		int bm = 0; //�����ϴ� �ݾ׿� ���� ����
		while(true) {
			System.out.println("�渶���ӿ� ���� ���� ȯ���մϴ�.");
			System.out.println("1. ���� ����");
			System.out.println("2. �ܾ� ����");
			System.out.println("3. �ܾ� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ����");
			// �޴� ���� �� ���ڷ� �Է����� �ʾ��� ��, �߸��� �� �Է½ÿ� ���� ����ó��
			while(true) {
				try {
					System.out.print("�޴��� �������ּ��� : ");
					menu = Integer.parseInt(sc.nextLine());
					if(0<menu&&menu<6) {
						break;	
					}else
						System.out.println("�߸��� �޴��Դϴ�. �ٽ� �������ּ���.");
				}catch(Exception e) {
					System.out.println("���ڷ� �Է����ּ���.");
				}
			}

			if(menu == 1) {
				int hgr = (int)(Math.random()*3 + 1); // int hgr(horse game result) ���� ����� ���� ����
				// �����ϴ� ���� �Է��� �� ���ڰ� �ƴ� �Է� �� �߸��� �� �Է½ÿ� ���� ����ó��
				while(true) {
					try {
						System.out.println("�Ʒ� 3������ ���� �ֽ��ϴ�.");
						System.out.println("1. ��� ����� ������ ���� �յ� �� ==> ��� 3��");
						System.out.println("2. �̹��� ������ ���� ���� ��	==> ��� 1.5��");
						System.out.println("3. �ֱ� �������� �ſ� �� ==> ��� 2��");
						System.out.print("� ���� �����Ͻðڽ��ϱ�: ");
						pick = Integer.parseInt(sc.nextLine());
						if(0<pick && pick<4) {
							break;
						}else 
							System.out.println("�ٽ� �Է����ּ���.");						
					}catch(Exception e) {
						System.out.println("���ڷ� �Է����ּ���.");
					}
				}
				// �����ϴ� ���� �Է��� �� ���ڰ� �ƴ� �Է� �� �߸��� �� �Է½ÿ� ���� ����ó��
				while(true) {
					try {
						System.out.print("�󸶸� �����Ͻðڽ��ϱ�: ");
						bm = Integer.parseInt(sc.nextLine());
						if(bm > hm) {
							System.out.println("�ܾ��� �����մϴ�.");
						}else
							break;
					}catch(Exception e) {
						System.out.println("���ڷ� �Է����ּ���.");
					}
				}

				if(pick == hgr) {
					System.out.println("���ÿ� �����ϼ̽��ϴ�!!");
					if(pick == 1) {
						System.out.println(bm*3 + "���� ȹ���ϼ̽��ϴ�.");
					}else if(pick == 2) {
						System.out.println((int)(bm*1.5) + "���� ȹ���ϼ̽��ϴ�.");
					}else {
						System.out.println(bm*2 + "���� ȹ���ϼ̽��ϴ�.");
					}
					hm += bm; // ������ �ִ� �ܾ׿� ȹ���� ���� �ݾ׸�ŭ �߰�
				}else {
					System.out.println("������ �ݾ��� " + bm + "���� ��� �����̽��ϴ�.");
					hm -= bm; // ������ �ִ� �ܾ׿� ���� �ݾ׸�ŭ ����
				}
			}else if(menu == 2) {

				// �Ա��ϴ� ���� �Է��� �� ���ڰ� �ƴ� �Է� �� �߸��� �� �Է½ÿ� ���� ����ó��
				while(true) { 
					try {	
						if(dm < 0) {
							System.out.println("�߸��� �Է��Դϴ�.");
						}else {
							System.out.print("�󸶸� �����Ͻðڽ��ϱ�: ");
							dm = Integer.parseInt(sc.nextLine());
							System.out.println(dm + "���� �����߽��ϴ�.");
							hm += dm;
							break;
						}
					}catch(Exception e) {
						System.out.println("���ڷ� �Է����ּ���.");
					}
				}
			}else if(menu == 3) {
				System.out.println("���� �ܾ��� " + hm + "�� �Դϴ�."); 
			}else if(menu == 4) {

				while(true) {
					try {	
						if(om > hm) {
							System.out.println("�ܾ��� �����մϴ�.");
						}else{
							System.out.print("�󸶸� �����Ͻðڽ��ϱ�: ");
							om = Integer.parseInt(sc.nextLine());
							System.out.println(om + "���� �����մϴ�.");
							hm -= om; // ������ �����ִ� �ݾ׿� ������ �ݾ׸�ŭ�� ������ ��
							System.out.println("�����ִ� �ܾ��� " + dm + "�� �Դϴ�." );
							break;
						}	
					}catch(Exception e) {
						System.out.println("���ڷ� �Է����ּ���.");
					}
				}	
			}else {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
	}
}
